package com.geosha.assignment3;

public class CheckingAccount extends Account {
	public CheckingAccount(String accountHolder, double initialBalance) {
		   super(accountHolder, initialBalance);
		}

		@Override
		public void deposit(double amount) {
		   balance += amount;
		}

		@Override
		public void withdraw(double amount) {
		   if (amount <= balance) {
		       balance -= amount;
		   } else {
		       System.out.println("Insufficient funds in Checking Account.");
		   }
		}

		@Override
		public double getBalance() {
		   return balance;
		}


}
