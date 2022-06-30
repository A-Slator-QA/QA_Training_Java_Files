package com.qa.main;

import com.qa.coinage.CoinCounting;

public class Runner {

	public static void main(String[] args) {
		CoinCounting calc = new CoinCounting(218, 5000);
		System.out.println(calc.getInitialChange() + " divded as: \n" + calc.printNoOfCoins());

	}
}