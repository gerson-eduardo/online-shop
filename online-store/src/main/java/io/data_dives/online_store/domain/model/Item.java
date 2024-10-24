package io.data_dives.online_store.domain.model;

public class Item{
	private Product product;
	private Long quantity;

	public Item(){}

	public Item(Product product, Long qtd){
		this.product = product;
		this.quantity = qtd;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getItemTotal(){
		return product.getPrice() * quantity;
	}
}

