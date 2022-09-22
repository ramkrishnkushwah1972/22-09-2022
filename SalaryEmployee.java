package com.exercise.bll;

public class SalaryEmployee extends Employee{

	public double weeklySalary;

	
	public SalaryEmployee() {
		super();
	}
	

	public SalaryEmployee(double weeklySalary,String empName, String jobTitle) {
		super(empName,jobTitle);
		this.weeklySalary = weeklySalary;
		
	}
	


	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	@Override
	public double calculatePay() {
		return weeklySalary*7;
	}
	
	
	
}

