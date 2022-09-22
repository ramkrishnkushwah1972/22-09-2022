package com.exercise.pll;

import com.exercise.bll.BankAccount;
import com.exercise.bll.BusinessAccount;
import com.exercise.bll.CurrentAccount;
import com.exercise.bll.SalaryAccount;

public class TestBankAccount {

	public static void main(String[] args) {

		BankAccount acc1 = null;

		System.out.println("\n**************Salary Account**************");
		acc1 = new SalaryAccount(9000);

		System.out.println("Balance: " + acc1.getBalance());

		acc1.deposit(5000);

		System.out.println("After deposit balance: " + acc1.getBalance());

		if (acc1.withdraw(6000)) {
			System.out.println("Withdrawal successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}

		System.out.println("After withdrawal balance: " + acc1.getBalance());

		System.out.println("\n**************Current Account**************");

		acc1 = new CurrentAccount(16000);

		System.out.println("Balance: " + acc1.getBalance());

		acc1.deposit(5000);

		System.out.println("After deposit the balance: " + acc1.getBalance());

		if (acc1.withdraw(16000)) {
			System.out.println("Withdrawal successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}

		System.out.println("After withdrawing balance: " + acc1.getBalance());

		System.out.println("\n**************Business Account**************");

		acc1 = new BusinessAccount(90000);

		System.out.println("Balance: " + acc1.getBalance());

		acc1.deposit(5000);

		System.out.println("After deposi balance: " + acc1.getBalance());

		if (acc1.withdraw(120000)) {
			System.out.println("Withdrawal successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}

		System.out.println("After withdrawal balance: " + acc1.getBalance());
	}

}
