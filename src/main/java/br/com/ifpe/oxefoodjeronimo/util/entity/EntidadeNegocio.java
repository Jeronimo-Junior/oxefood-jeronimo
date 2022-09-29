package br.com.ifpe.oxefoodjeronimo.util.entity;

import lombok.Setter;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Setter
@Getter
@MappedSuperclass
@EqualsAndHashCode(of = {"id"})
public class EntidadeNegocio implements Serializable {
	private static final long serialVersionUID = 2249543672724123545L;

	private Long id;
	
	private Boolean habilitado;
}
