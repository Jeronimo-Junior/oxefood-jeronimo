package br.com.ifpe.oxefoodjeronimo.modelo.cliente;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodjeronimo.util.entity.GenericService;

@Service
public class ClienteService extends GenericService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente) {

	super.preencherCamposAuditoria(cliente);
	return repository.save(cliente);
    }
}
