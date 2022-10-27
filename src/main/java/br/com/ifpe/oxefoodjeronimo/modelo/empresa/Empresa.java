package br.com.ifpe.oxefoodjeronimo.modelo.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodjeronimo.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Empresa")
@Where(clause = "habilitado = true")

public class Empresa extends EntidadeAuditavel {

private static final long serialVersionUID = 8590545336901037426L;


	
	private String chave;
	
	private String site;
	
	private String cnpj;
	
	private String inscricaoEstadual;
	
	private String nomeEmpresarial;
	
	private String nomeFantasia;
	
	private String fone;
	
	private String foneAlternativo;
	
	
}
