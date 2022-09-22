package com.exercise.pll;

import com.exercise.bll.HourlyEmployee;
import com.exercise.bll.SalaryEmployee;
import com.exercise.bll.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1= null;
		emp1= new SalaryEmployee(1000,"Rakesh","Python Developer"); 
		
		System.out.println(emp1);
		System.out.println("Weekly Salary : "+emp1.calculatePay());
		
		System.out.println("*****************************************");
		
		emp1 = new HourlyEmployee(1100,5,"Mahesh","Java Developer");
		System.out.println(emp1);
		System.out.println("Hourly Salary : "+emp1.calculatePay());
	}

}
