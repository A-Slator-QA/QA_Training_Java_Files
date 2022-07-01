package com.qa.garage;

public abstract class Vehicle {

	private int wheels;
	private String hornSound;
	private int maxPass; // Maximum Passengers
	private String marque; // marque is like the make, idfk
	private int id;
	private static int count;

	public Vehicle(int wheels, String hornSound, int maxPass, String marque) {
		this.wheels = wheels;
		this.hornSound = hornSound;
		this.maxPass = maxPass;
		this.marque = marque;
		this.id = ++count;
	}

	public Vehicle() {

	}

	public void hitHorn() {
		System.out.println(hornSound);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getHornSound() {
		return hornSound;
	}

	public void setHornSound(String hornSound) {
		this.hornSound = hornSound;
	}

	public int getMaxPass() {
		return maxPass;
	}

	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getId() {
		return id;
	}

	protected abstract float calcBill();

}
