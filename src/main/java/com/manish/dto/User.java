package com.manish.dto;

public class User {

	private Integer uid;
	private String item;
	private Double amount;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", item=" + item + ", amount=" + amount + "]";
	}
	
	
}
