package com.qa.main;

import com.qa.calc.Calculator;

public class Runner {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	System.out.println(calc.add(1.5, 5.2) + " " + calc.divide(23, 7));
}

}