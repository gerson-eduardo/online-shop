package io.data_dives.online_store.domain.model;

public class Item{
	private Produto produto;
	private Long quantidade;

	public Item(){}

	public Item(Produto produto, Long qtd){
		this.produto = produto;
		this.quantidade = qtd;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Long CalcularTotalItem(){
		return produto.getPreco() * quantidade;
	}
}

