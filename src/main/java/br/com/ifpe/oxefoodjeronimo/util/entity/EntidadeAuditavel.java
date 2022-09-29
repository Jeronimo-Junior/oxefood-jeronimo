package br.com.ifpe.oxefoodjeronimo.util.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {

	private static final long serialVersionUID = 4191623123137637546L;
	
	private Long versao;
	
	private Long dataCriacao;
	
	private Long dataUltimaModificacao;
	
	private Long criadoPor;
	
	private Long ultimaModificacaoPor;
	
}
