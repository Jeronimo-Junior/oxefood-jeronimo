package br.com.ifpe.oxefoodjeronimo.servicos.empresa;

import br.com.ifpe.oxefoodjeronimo.modelo.empresa.Empresa;

public class EmpresaRequest {


	private String chave;
	
	private String site;
	
	private String cnpj;
	
	private String inscricaoEstadual;
	
	private String nomeEmpresarial;
	
	private String nomeFantasia;
	
	private String fone;
	
	private String foneAlternativo;
	
	public Empresa buildEmpresa() {
		
		return Empresa.builder()
				.chave(chave)
				.site(site)
				.cnpj(cnpj)
				.inscricaoEstadual(inscricaoEstadual)
				.nomeEmpresarial(nomeEmpresarial)
				.nomeFantasia(nomeFantasia)
				.fone(fone)
				.foneAlternativo(foneAlternativo)
				.build();
	}
}
