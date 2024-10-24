package io.data_dives.ms_support.domain.model;

import java.util.Map;
import java.util.UUID;

import io.data_dives.ms_support.domain.types.CartStatus;

public class Cart{
	private UUID userid;
	private CartStatus status;
	private Map<String, Item> items;

	public Long getCartTotal(){
		return items.entrySet().stream()
			.mapToLong(i -> i.getValue().getTotalPrice())
			.sum();
	}

	public void removeItem(String sku, Integer qtd){
		Item i = items.get(sku);
		if(i == null)
			return;
		if (qtd >= i.getQuantity())
			items.remove(sku);
		else
			i.setQuantity(i.getQuantity() - qtd);
	}

	public void insertItem(Item item){
		Item i = items.get(item.getSku());

		if(i == null)
			items.put(item.getSku(), item);
		else
			i.setQuantity(i.getQuantity() + item.getQuantity());
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


}
