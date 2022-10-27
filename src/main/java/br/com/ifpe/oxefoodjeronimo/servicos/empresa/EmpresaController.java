package br.com.ifpe.oxefoodjeronimo.servicos.empresa;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodjeronimo.modelo.empresa.Empresa;
import br.com.ifpe.oxefoodjeronimo.modelo.empresa.EmpresaService;
import br.com.ifpe.oxefoodjeronimo.util.entity.GenericController;



public class EmpresaController {
	@RestController
	@RequestMapping("/api/empresacontroller")
	public class ClienteController extends GenericController {
		
		 @Autowired
		    private EmpresaService empresaService;

		    @PostMapping
		    public ResponseEntity<Empresa> save(@RequestBody @Valid EmpresaRequest request) {

			Empresa empresaRequisicao = request.buildEmpresa();
			Empresa empresaSalvo = empresaService.save(empresaRequisicao);
			return new ResponseEntity<Empresa>(empresaSalvo, HttpStatus.CREATED);
		    }
		}
	
}

