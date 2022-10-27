package br.com.ifpe.oxefoodjeronimo.modelo.produto;

import javax.persistence.Entity;
import javax.persistence.Table;

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

public class Produto extends EntidadeAuditavel {
	
	private static final long serialVersionUID = 2359910697089978840L;

	private String chaveEmpresa;
	
	private String codigo;

	private String titulo;

	private String descricao;

	private Double valorUnitario;

	private String tempoEntrega;

	private Boolean temComplemento;

	private Boolean emDestaque;




}
