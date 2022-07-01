package com.qa.enums;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			throwHands(RPS.PAPER); // input your choice here

		}

	}

	private static void throwHands(RPS playerChoice) {
		int randNum = new Random().nextInt(3);
		RPS cpuChoice = null;
		if (randNum == 0) {
			cpuChoice = RPS.ROCK;
		} else if (randNum == 1) {
			cpuChoice = RPS.PAPER;
		} else if (randNum == 2) {
			cpuChoice = RPS.SCISSORS;
		}
		System.out.println("\nYou chose " + playerChoice + ", we chose " + cpuChoice + ". You "
				+ playerChoice.matchUp(cpuChoice) + "!");

	}

}
