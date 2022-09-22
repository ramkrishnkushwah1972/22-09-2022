package com.exercise.pll;

import com.exercise.bll.HourlyEmployee;
import com.exercise.bll.SalaryEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		
		SalaryEmployee salary_employee = new SalaryEmployee(1000,"Rakesh","Python Developer"); 
		
		HourlyEmployee hourly_employee = new HourlyEmployee(1100,"Mahesh","Java Developer");
		
		System.out.println(salary_employee);
		System.out.println("Weekly Salary : "+salary_employee.calculatePay(13));
		
		System.out.println(hourly_employee);
		System.out.println("Hourly Salary : "+hourly_employee.calculatePay(1.5));

	}

}
