package io.data_dives.ms_support.domain.model;

public class Item{
	private String sku;
	private Long price;
	private Integer promocao;
	private Integer quantidade;

	public Long getTotalPrice(){
		return ((price * (100 - promocao))/ 100) * quantidade;
	}

	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getPromocao() {
		return promocao;
	}
	public void setPromocao(Integer promocao) {
		this.promocao = (promocao > 100 || promocao < 0) ? 0: promocao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}


}
