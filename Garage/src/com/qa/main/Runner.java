package com.qa.main;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Lorry;
import com.qa.garage.Motorbike;
import com.qa.garage.Tesla;

public class Runner {

	public static void main(String[] args) {

		Motorbike m = new Motorbike(600, "Honda");
		m.hitHorn();

		Car c = new Car(5, 4, "Citroen", "C1");
		c.hitHorn();
		System.out.println(c.getMarque());

		Tesla t = new Tesla("Model S");
		t.hitHorn();
		System.out.println(t.getDoors());
		System.out.println(t.getModel());
		System.out.println(t.getWheels());

		Lorry l = new Lorry(18, 100, "Trailer", "Scania");
		l.hitHorn();
		System.out.println(l.getCargo());

		Garage g = new Garage();
		g.addVehicle(c);
		g.addVehicle(t);
		g.addVehicle(m);
		g.addVehicle(l);
		g.addVehicle(new Motorbike(1000, "Yamaha"));
		g.listVehicles();

		g.billAll();

		g.billVehicle(1);

		g.emptyGarage();
		g.listVehicles();
	}

}
