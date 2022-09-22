package com.exercise.bll;

public class BusinessAccount implements BankAccount {
	
	private double balance;
	
	public BusinessAccount() {
		
	}
	
	public BusinessAccount(double balance) {
		this.balance = balance;
	}


	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public boolean withdraw(double amount) {
		if((balance + 25000) >= amount) {
			balance -= amount;
			return true;
		}
		
		return false;
	}

}

	