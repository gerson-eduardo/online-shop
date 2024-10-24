package io.data_dives.online_store.domain.model;

public class Produto{
	private String nome;
	private String descricao;
	private Long preco;
	private String sku;
	private Long estoque;
	private Integer promocao;
	private String img;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getPreco() {
		return preco;
	}
	public void setPreco(Long preco) {
		this.preco = preco;
	}
	public String getSku(){
		return sku;
	}
	public void setSku(String sku){
		this.sku = sku;
	}
	public Long getEstoque() {
		return estoque;
	}
	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}
	public Integer getPromocao() {
		return promocao;
	}
	public void setPromocao(Integer promocao) {
		this.promocao = promocao;
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
		private String nome;
		private String descricao;
		private Long preco;
		private String sku;
		private Long estoque;
		private Integer promocao;
		private String img;

		public Builder setNome(String nome) {
			this.nome = nome;
			return this;
		}
		public Builder setDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		public Builder setPreco(Long preco) {
			this.preco = preco;
			return this;
		}
		public Builder setSku(String sku) {
			this.sku = sku;
			return this;
		}
		public Builder setEstoque(Long estoque) {
			this.estoque = estoque;
			return this;
		}
		public Builder setPromocao(Integer promocao) {
			this.promocao = promocao;
			return this;
		}
		public Builder setImg(String img) {
			this.img = img;
			return this;
		}

		public Produto build(){
			Produto produto = new Produto();
			produto.setNome(this.nome);
			produto.setDescricao(this.descricao);
			produto.setPreco(this.preco);
			produto.setSku(this.sku);
			produto.setEstoque(this.estoque);
			produto.setPromocao(this.promocao);
			produto.setImg(this.img);

			return produto;
		}


	}


}
