package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		garage.add(v);
	}

	public void listVehicles() {
		System.out.println(garage.toString());
	}

	public void billAll() {
		for (Vehicle v : garage) {
			calculateBill(v);
		}

	}

	public void removeVehicle(int i) {
		garage.remove(i);
	}

	public void removeVehicle(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.garage) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}
		this.garage.removeAll(toRemove);
	}

	private void calculateBill(Vehicle v) {
		if (v instanceof Tesla) {
			System.out.println("£500000 lmao"); // Tesla is a child of Car so it has to be processed first
		} else if (v instanceof Car) {
			System.out.println("£5 per door, " + ((Car) v).getDoors() + "");
		} else if (v instanceof Motorbike) {
			System.out.println("blah blah" + ((Motorbike) v).getEngineSize());
		} else if (v instanceof Lorry) {
			System.out.println("blah blah" + ((Lorry) v).getCargo());
		}
	} // I haven't made the bill output sensible yet but the concept is there.

	public void billVehicle(int i) {
		calculateBill(garage.get(i));

	}

	public void emptyGarage() {
		garage.clear();

	}
}
