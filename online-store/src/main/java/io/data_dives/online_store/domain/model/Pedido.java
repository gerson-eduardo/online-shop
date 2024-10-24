package io.data_dives.online_store.domain.model;

import java.util.List;

public class Pedido{
	List<Item> itens;

	public Pedido(){}

	public Pedido(List<Item> itens){
		this.itens = itens;
	}

	public void adicionarItem(String sku, Long qtd){
		Item item = itens.stream()
			.filter(i -> i.getProduto().getSku().equals(sku))
			.findAny().orElse(null);

		if(item == null){
			itens.add(new Item(
				Produto.builder().setSku("A1B2C3").build(),
				qtd
			));
		}else{
			item.setQuantidade(qtd);
		}
	}

	public void removerProduto(String sku, Long qtd){
		Item item = itens.stream()
			.filter(i -> i.getProduto().getSku().equals(sku))
			.findAny().orElse(null);

		if(item == null)
			return;

		if(qtd >= item.getQuantidade())
			itens.remove(item);
		else
			item.setQuantidade(item.getQuantidade() - qtd);
	}
	
	public Long calcularTotalPedido(){
		return itens.stream()
			.mapToLong(Item::CalcularTotalItem)
			.sum();
	}

}
