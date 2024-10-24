package io.data_dives.online_store.domain.model;

public class Product{
	private String name;
	private String description;
	private Long price;
	private String sku;
	private Long stock;
	private Integer discount;
	private String img;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price; 
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getSku(){
		return sku;
	}
	public void setSku(String sku){
		this.sku = sku;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public static Builder builder(){
		return new Builder();
	}

	public static class Builder{
		private String name;
		private String description;
		private Long price;
		private String sku;
		private Long stock;
		private Integer discount;
		private String img;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}
		public Builder setPrice(Long price) {
			this.price = price;
			return this;
		}
		public Builder setSku(String sku) {
			this.sku = sku;
			return this;
		}
		public Builder setStock(Long stock) {
			this.stock = stock;
			return this;
		}
		public Builder setDiscount(Integer discount) {
			this.discount = discount;
			return this;
		}
		public Builder setImg(String img) {
			this.img = img;
			return this;
		}

		public Product build(){
			Product product= new Product();
			product.setName(this.name);
			product.setDescription(this.description);
			product.setPrice(this.price);
			product.setSku(this.sku);
			product.setStock(this.stock);
			product.setDiscount(this.discount);
			product.setImg(this.img);

			return product;
		}
	}


}
