package com.qa.array;

import java.util.ArrayList;
import java.util.List;

public class Sandwiches {

	public static void main(String[] args) {
		List<String> sandwiches = new ArrayList<>();

		sandwiches.add("bread sandwich");
		sandwiches.add("pop tart");
		sandwiches.add("hot dog");
		sandwiches.add("hamburger");
		sandwiches.add("pancake");

		System.out.println(sandwiches);
		System.out.println(sandwiches.get(0));
		sandwiches.set(4, "ice cream taco");
		System.out.println(sandwiches);

		sandwiches.size();
		System.out.println(sandwiches.size());
		for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
		}
		for (String i : sandwiches) {
			System.out.println(i);
		}
	}
}
