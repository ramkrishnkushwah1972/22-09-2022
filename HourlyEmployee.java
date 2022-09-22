package com.exercise.bll;

public class HourlyEmployee extends Employee {

	public double hoursWorked;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double hoursWorked,String empName, String jobTitle) {
		super(empName, jobTitle);
		this.hoursWorked=hoursWorked;
	}
	
	@Override
	public double calculatePay(double payrat) {
		return hoursWorked*payrat;
	}

	
}
