package com.qa.garage;

public class Motorbike extends Vehicle {
	private int engineSize;

	public Motorbike(int engineSize, String marque) {
		super(2, "Meep!", 2, marque);
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

}
