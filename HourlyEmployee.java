package com.exercise.bll;

public class HourlyEmployee extends Employee {

	private int hoursWorked;
	private int payRate;
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(int hoursWorked,int payRate,String empName, String jobTitle) {
		super(empName, jobTitle);
		this.hoursWorked=hoursWorked;
		this.payRate=payRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getPayRate() {
		return payRate;
	}

	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

	@Override
	public double calculatePay() {
		return hoursWorked*payRate;
	}

	
}
