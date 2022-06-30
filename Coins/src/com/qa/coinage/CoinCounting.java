package com.qa.coinage;

public class CoinCounting {

	private int initialChange;
	private int currentChange;
	private Coin[] myCoins = new Coin[11];

	public CoinCounting(int cost, int payment) {
		this.currentChange = this.initialChange = payment - cost;
		this.myCoins[0] = new Coin("Twenty pound note", 2000);
		this.myCoins[1] = new Coin("Ten pound note", 1000);
		this.myCoins[2] = new Coin("Five pound note", 500);
		this.myCoins[3] = new Coin("Two pound coin", 200);
		this.myCoins[4] = new Coin("One pound coin", 100);
		this.myCoins[5] = new Coin("Fifty pence piece", 50);
		this.myCoins[6] = new Coin("Twenty pence piece", 20);
		this.myCoins[7] = new Coin("Ten pence piece", 10);
		this.myCoins[8] = new Coin("Five pence piece", 5);
		this.myCoins[9] = new Coin("Two Pence piece", 2);
		this.myCoins[10] = new Coin("One pence piece", 1);

		this.calculateCoins();

	}

	public int getInitialChange() {
		return this.initialChange;
	}

	private void calculateCoins() {

		for (var i = 0; i < this.myCoins.length; i++) {
			if (this.currentChange >= this.myCoins[i].getValue()) {
				this.currentChange -= this.myCoins[i].getValue();
				this.myCoins[i].incrementCount();
				i--;
			}

			if (this.currentChange == 0) {
				break;
			}
		}
	}

	public String printNoOfCoins() {
		String output = "";
		for (var j = 0; j < myCoins.length; j++) {
			if (myCoins[j].getCount() != 0) {
				output += myCoins[j].printCoinState() + "\n";
			}
		}
		return output;

	}

}
