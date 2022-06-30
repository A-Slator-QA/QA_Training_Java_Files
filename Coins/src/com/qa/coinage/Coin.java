package com.qa.coinage;

public class Coin {

	private String label;
	private int value;
	private int count = 0;

	public Coin(String label, int value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return this.label;
	}

	public int getCount() {
		return this.count;
	}

	public int getValue() {
		return this.value;
	}

	public void incrementCount() {
		this.count++;
	}

	public String printCoinState() {
		return this.label + ": " + this.count;
	}

}
