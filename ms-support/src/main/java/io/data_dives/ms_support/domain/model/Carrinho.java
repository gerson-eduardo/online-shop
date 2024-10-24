package io.data_dives.ms_support.domain.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import io.data_dives.ms_support.domain.types.StatusCarrinho;

public class Carrinho{
	private UUID userid;
	private StatusCarrinho status;
	private Map<String, Item> items;

	public Long getTotalCarrinho(){
		return items.entrySet().stream()
			.mapToLong(i -> i.getValue().getTotalPrice())
			.sum();
	}

	public void removerItem(String sku, Integer qtd){
		Item i = items.get(sku);
		if(i == null)
			return;
		if (qtd >= i.getQuantidade())
			items.remove(sku);
		else
			i.setQuantidade(i.getQuantidade() - qtd);
	}

	public void inserirItem(Item item){
		Item i = items.get(item.getSku());

		if(i == null)
			items.put(item.getSku(), item);
		else
			i.setQuantidade(i.getQuantidade() + item.getQuantidade());
	}

	public UUID getUserid() {
		return userid;
	}
	public void setUserid(UUID userid) {
		this.userid = userid;
	}

	public StatusCarrinho getStatus() {
		return status;
	}
	public void setStatus(StatusCarrinho status) {
		this.status = status;
	}

	public HashMap<String, Item> getItems() {
		return items;
	}

	public void setItems(HashMap<String, Item> items) {
		this.items = items;
	}


}
