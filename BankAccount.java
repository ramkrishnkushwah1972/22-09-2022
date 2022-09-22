package com.exercise.bll;

public interface BankAccount {
	
	public double getBalance();
	public void deposit(double amount);

	boolean withdraw(double amount);
}	
