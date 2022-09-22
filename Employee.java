package com.exercise.bll;

public abstract class Employee {
	public String empName;
	public String jobTitle;
	
	public Employee() {
		
	}
	public Employee(String empName, String jobTitle) {
		this.empName = empName;
		this.jobTitle = jobTitle;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public abstract double calculatePay();
	
	@Override
	public String toString() {
		return "Employee [Name=" + empName + ", Job Title=" + jobTitle + "]";
	}

	
	
}
