package io.data_dives.online_store.domain.model;

import java.util.List;

public class Request{
	List<Item> items;

	public Request(){}

	public Request(List<Item> items){
		this.items = items;
	}

	public void insertItem(String sku, Long qtd){
		Item item = items.stream()
			.filter(i -> i.getProduct().getSku().equals(sku))
			.findAny().orElse(null);

		if(item == null){
			items.add(new Item(
				Product.builder().setSku("A1B2C3").build(),
				qtd
			));
		}else{
			item.setQuantity(qtd);
		}
	}

	public void removeProduct(String sku, Long qtd){
		Item item = items.stream()
			.filter(i -> i.getProduct().getSku().equals(sku))
			.findAny().orElse(null);

		if(item == null)
			return;

		if(qtd >= item.getQuantity())
			items.remove(item);
		else
			item.setQuantity(item.getQuantity() - qtd);
	}
	
	public Long getRequestTotal(){
		return items.stream()
			.mapToLong(Item::CalcularTotalItem)
			.sum();
	}

}
