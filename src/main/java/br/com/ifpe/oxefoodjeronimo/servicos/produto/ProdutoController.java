package br.com.ifpe.oxefoodjeronimo.servicos.produto;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodjeronimo.modelo.produto.Produto;
import br.com.ifpe.oxefoodjeronimo.modelo.produto.ProdutoService;
import br.com.ifpe.oxefoodjeronimo.util.entity.GenericController;



public class ProdutoController {
	public class EmpresaController {
		@RestController
		@RequestMapping("/api/produtocontroller")
		public class ClienteController extends GenericController {
			
			 @Autowired
			    private ProdutoService produtoService;

			    @PostMapping
			    public ResponseEntity<Produto> save(@RequestBody @Valid ProdutoRequest request) {

			    Produto produtoRequisicao = request.buildProduto();
			    Produto produtoSalvo = produtoService.save(produtoRequisicao);
				return new ResponseEntity<Produto>(produtoSalvo, HttpStatus.CREATED);
			    }
			}
		
	}
}
