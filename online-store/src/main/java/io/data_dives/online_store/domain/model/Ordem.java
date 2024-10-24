package io.data_dives.online_store.domain.model;

import java.util.List;

public class Ordem{
	private Long valor;
	private Long saldo;
	private Pedido pedido;
	private Usuario usuario;
	private List<Pagamento> pagamentos;
}
