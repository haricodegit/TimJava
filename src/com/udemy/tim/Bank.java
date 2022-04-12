package com.udemy.tim;

public class Bank {
	private long accountNumber;
	private double balance;
	private String customerName, email, phoneNumber;
	
	public Bank() {
		this(12345, 100.0, "Harish", "harish@gmail.com", "9986738920");
		System.out.println("Empty constructor called");
	}
	
	public Bank(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account details updated!");
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//		this.customerName = customerName;
//		this.email = email;
//		this.phoneNumber = phoneNumber;	

		setAccoutNumber(accountNumber);
		setBalance(balance);
		setCustomerName(customerName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setAccoutNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public	void Deposit(float amount) {
		this.balance += amount;
		System.out.println("Deposit of "+amount+" rs is successful! New balance is: "+balance);
	}
	
	public void Withdraw(float amount) {
		if(balance >= amount) {
			System.out.println("WithDrawal of "+amount+" rs is successful! Remaining balance is "+(balance - amount));
			this.balance = (balance - amount);
		} else {
			System.out.println("Insufficient balance!");
			System.out.println("Available balance is: "+balance);
		}
	}
}