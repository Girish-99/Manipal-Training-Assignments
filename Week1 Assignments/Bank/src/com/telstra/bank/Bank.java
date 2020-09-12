package com.telstra.bank;

public class Bank {

	private int id;
	private String name;
	private double balance;
	
	public Bank(int id, String name) {
		this.id = id;
		this.name = name;
		this.balance= 0.0;
	}
	
	public double credit(double balance) {
		this.balance += balance;
		return this.balance;
	}
	
	public double debit(double balance) {
		this.balance -= balance;
		return this.balance;
	}
}
