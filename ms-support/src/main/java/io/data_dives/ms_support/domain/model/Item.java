package io.data_dives.ms_support.domain.model;

public class Item{
	private String sku;
	private Long price;
	private Integer discount;
	private Integer quantity;

	public Long getTotalPrice(){
		return ((price * (100 - discount))/ 100) * quantity;
	}

	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = (discount > 100 || discount < 0) ? 0: discount;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity= quantity;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}


}
