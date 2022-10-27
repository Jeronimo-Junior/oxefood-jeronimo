package br.com.ifpe.oxefoodjeronimo.modelo.empresa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodjeronimo.util.entity.GenericService;

@Service
public class EmpresaService extends GenericService {

    @Autowired
    private EmpresaRepository repository;

    @Transactional
    public Empresa save(Empresa empresa) {

	super.preencherCamposAuditoria(empresa);
	return repository.save(empresa);
    }
}