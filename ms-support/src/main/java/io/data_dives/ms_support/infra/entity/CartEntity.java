package io.data_dives.ms_support.infra.entity;

import java.time.ZonedDateTime;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.data_dives.ms_support.domain.model.Item;
import io.data_dives.ms_support.domain.types.CartStatus;

@Document("cart")
public class CartEntity{
	@Id
	private String id;
	private UUID userid;
	private CartStatus status;
	private Map<String, Item> items;
	private ZonedDateTime dateUpdate;
	private ZonedDateTime dateCreate;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public UUID getUserid() {
		return userid;
	}
	public void setUserid(UUID userid) {
		this.userid = userid;
	}
	public CartStatus getStatus() {
		return status;
	}
	public void setStatus(CartStatus status) {
		this.status = status;
	}
	public Map<String, Item> getItems() {
		return items;
	}
	public void setItems(Map<String, Item> items) {
		this.items = items;
	}
	public ZonedDateTime getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(ZonedDateTime dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public ZonedDateTime getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(ZonedDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Builder builder(){
		return new Builder();
	}

	public static class Builder{
		private String id;
		private UUID userid;
		private CartStatus status;
		private Map<String, Item> items;
		private ZonedDateTime dateUpdate;
		private ZonedDateTime dateCreate;

		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		public Builder setUserid(UUID userid) {
			this.userid = userid;
			return this;
		}
		public Builder setStatus(CartStatus status) {
			this.status = status;
			return this;
		}
		public Builder setItems(Map<String, Item> items) {
			this.items = items;
			return this;
		}
		public Builder setDateUpdate(ZonedDateTime dateUpdate) {
			this.dateUpdate = dateUpdate;
			return this;
		}
		public Builder setDateCreate(ZonedDateTime dateCreate) {
			this.dateCreate = dateCreate;
			return this;
		}

		public CartEntity build(){
			CartEntity carrinho = new CartEntity();
			carrinho.setId(this.id);
			carrinho.setUserid(this.userid);
			carrinho.setStatus(this.status);
			carrinho.setItems(this.items);
			carrinho.setDateUpdate(this.dateUpdate);
			carrinho.setDateCreate(this.dateCreate);
			return carrinho;
		}
	}
}
