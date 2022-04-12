package com.udemy.tim;

public class VipCustomer {
	String CustomerName;
	double creditLimit;
	String CustomerEmail;
	
	public VipCustomer() {
		this("defaultName",10000.00,"default@default.com");
		System.out.println("Empty constructor called");
	}
	
	public VipCustomer(String CustomerName, double creditLimit, String CustomerEmail) {
		this.CustomerName = CustomerName;
		this.creditLimit = creditLimit;
		this.CustomerEmail = CustomerEmail;
		System.out.println("Testing");
	}
	
	public VipCustomer(String CustomerName, double creditLimit) {
		this.CustomerName = CustomerName;
		this.creditLimit = creditLimit;
		System.out.println("Called");
	}
	
	
}