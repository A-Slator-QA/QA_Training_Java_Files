package com.qa.calc;

public class Calculator {

	public double add(double x, double y ) {
		return x + y;
	}
	
	public double multiply(double x, double y ) {
		return x * y;
	}
	
	public double subtract(double x, double y ) {
		return x - y;
	}
	
	public static void divide(double x, double y ) {
		if (y == 0) {
			System.out.print("Cannot divide by zero");	
		}	else {
		System.out.println(x / y);
		}
	}
}
