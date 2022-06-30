package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		garage.add(v);
	}

	public void removeVehicle(int i) {
		garage.remove(i);
	}

	public void listVehicles() {
		System.out.println(garage.toString());
	}

	public void billAll() {
		for (Vehicle v : garage) {
			calculateBill(v);
		}

	}

	public void removeCar() {
		for (Vehicle v : garage) {
			if (v instanceof Car) {
				garage.remove(v);
			}
		}
	}

	private void calculateBill(Vehicle v) {
		if (v instanceof Tesla) {
			System.out.println("£500000 lmao");
		} else if (v instanceof Car) {
			System.out.println("£5 per door, " + ((Car) v).getDoors() + "");
		} else if (v instanceof Motorbike) {
			System.out.println("blah blah" + ((Motorbike) v).getEngineSize());
		} else if (v instanceof Lorry) {
			System.out.println("blah blah" + ((Lorry) v).getCargo());
		}
	}

	public void billVehicle(int i) {
		calculateBill(garage.get(i));

	}

	public void emptyGarage() {
		garage.clear();

	}
}
