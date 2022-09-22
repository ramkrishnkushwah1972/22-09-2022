package com.exercise.bll;

public class SalaryAccount implements BankAccount {
	private double balance;
	
	public SalaryAccount() {
		
	}
	
	public SalaryAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
}
