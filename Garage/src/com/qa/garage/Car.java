package com.qa.garage;

public class Car extends Vehicle {

	private int doors;
	private String model;

	public Car(int doors, int maxPass, String marque, String model) {
		super(4, "Beep!", maxPass, marque);
		this.doors = doors;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

}
