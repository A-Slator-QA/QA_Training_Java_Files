package com.qa.numbers;

public class NumberManipulation {

	public String[] tensArray = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
	public String[] unitsArray = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	public String[] teensArray = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };

	public int i;

	public void catNumber(int i) {

		if (i < 10) {
			System.out.println(unitsArray[i - 1]);
		} else if (10 <= i && i < 20) {
			System.out.println(teensArray[i - 10]);
		} else if (20 <= i && i <= 99) {
			System.out.println(tensArray[i / 10] + unitsArray[i % 10]);
//	adding in hundreds
		} else {
			System.out.println(unitsArray[i / 100] + " hundred and " + tensArray[(i % 100) / 10] + unitsArray[i % 10]);
		}
	}

	public void setI(int i) {
		this.i = i;
	}

}
