package com.qa.garage;

public class Vehicle {

	private int wheels;
	private String hornSound;
	private int maxPass;
	private String marque;

	public Vehicle(int wheels, String hornSound, int maxPass, String marque) {
		this.wheels = wheels;
		this.hornSound = hornSound;
		this.maxPass = maxPass;
		this.marque = marque;
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

}
