package com.qa.garage;

public class Lorry extends Vehicle {

	private String cargo;
	private int tonnage;

	public Lorry(int wheels, int tonnage, String cargo, String marque) {
		super(wheels, "Honk!", 3, marque);
		this.cargo = cargo;
		this.tonnage = tonnage;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

}
