package com.exercise.pll;

import com.exercise.bll.Author;
import com.exercise.bll.Book;

public class TestBook {

public static void main(String[] args) {

		Book b1= new Book();
		System.out.println(b1);
		
		Author A1 = new Author("Ravi","yas@123.com");

		Book b2= new Book("ISBN0012","Letus", A1,111.0, 2);
		
		System.out.println(b2);
		
		System.out.println("**********************************");
		System.out.println("Name :"+b2.getName());
	
		System.out.println("Price :"+b2.getPrice());
		System.out.println("Quantity :"+b2.getQty());

		
		
		
	}
}
