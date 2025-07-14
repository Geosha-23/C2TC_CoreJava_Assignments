package com.geosha.assignment3;


//Abstract class
public abstract class Account {
       protected String accountHolder;
       protected double balance;
       
       
	public Account(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
       
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
       
}
