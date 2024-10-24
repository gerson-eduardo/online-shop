package io.data_dives.online_store.domain.model;

import io.data_dives.online_store.domain.types.PaymentAction;
import io.data_dives.online_store.domain.types.PaymentStatus;

public class Payment{
	private Long value;
	private Long balance;
	private PaymentAction action;
	private PaymentStatus status;

	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public PaymentAction getAction() {
		return action;
	}
	public void setAction(PaymentAction action) {
		this.action = action;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
}
