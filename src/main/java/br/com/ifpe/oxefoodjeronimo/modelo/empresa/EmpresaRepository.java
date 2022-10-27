package br.com.ifpe.oxefoodjeronimo.modelo.empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmpresaRepository
	extends JpaRepository<Empresa, Long>, JpaSpecificationExecutor<Empresa> {

}

