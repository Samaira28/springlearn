package com.cognizant.account.model;

public class Account {
	
	public long number;
	public String type;
	public long balance;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Account(long number, String type, long balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	public Account()
	{
		
	}

}
