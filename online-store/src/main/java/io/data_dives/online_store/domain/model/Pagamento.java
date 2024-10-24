package io.data_dives.online_store.domain.model;

import io.data_dives.online_store.domain.types.AcaoPagamento;
import io.data_dives.online_store.domain.types.StatusPagamento;

public class Pagamento{
	private Long valor;
	private Long saldo;
	private AcaoPagamento acao;
	private StatusPagamento status;

	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	public AcaoPagamento getAcao() {
		return acao;
	}
	public void setAcao(AcaoPagamento acao) {
		this.acao = acao;
	}
	public StatusPagamento getStatus() {
		return status;
	}
	public void setStatus(StatusPagamento status) {
		this.status = status;
	}


}
