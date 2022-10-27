package br.com.ifpe.oxefoodjeronimo.servicos.produto;

import br.com.ifpe.oxefoodjeronimo.modelo.produto.Produto;

public class ProdutoRequest {
	
private String chaveEmpresa;
	
	private String codigo;

	private String titulo;

	private String descricao;

	private Double valorUnitario;

	private String tempoEntrega;

	private Boolean temComplemento;

	private Boolean emDestaque;

	
	
	
	public Produto buildProduto() {
		return Produto.builder()
		.codigo(codigo)
		.titulo(titulo)
		.descricao(descricao)
		.valorUnitario(valorUnitario)
		.tempoEntrega(tempoEntrega)
		.temComplemento(temComplemento)
		.emDestaque(emDestaque)
		.build();
	}
}
