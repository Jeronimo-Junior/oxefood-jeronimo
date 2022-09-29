package br.com.ifpe.oxefoodjeronimo.modelo.produto;

import br.com.ifpe.oxefoodjeronimo.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel {
	
	private static final long serialVersionUID = 1987723843842037223L;

	private String chaveEmpresa;
	
	private String descricao;
}
