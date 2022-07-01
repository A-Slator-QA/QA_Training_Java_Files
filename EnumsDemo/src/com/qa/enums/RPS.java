package com.qa.enums;

public enum RPS {
	ROCK {
		@Override
		public Results matchUp(RPS opp) {
			if (this == opp) {
				return Results.DRAW;
			} else if (opp == PAPER) {
				return Results.LOSE;
			} else
				return Results.WIN;
		}
	},
	PAPER {
		@Override
		public Results matchUp(RPS opp) {
			if (this == opp) {
				return Results.DRAW;
			} else if (opp == SCISSORS) {
				return Results.LOSE;
			} else
				return Results.WIN;
		}
	},
	SCISSORS {
		@Override
		public Results matchUp(RPS opp) {
			if (this == opp) {
				return Results.DRAW;
			} else if (opp == ROCK) {
				return Results.LOSE;
			} else
				return Results.WIN;
		}
	};

	public abstract Results matchUp(RPS opp);

}
