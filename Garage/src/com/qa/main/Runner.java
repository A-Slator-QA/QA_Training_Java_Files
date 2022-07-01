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

//		Vehicle v = new Vehicle(3, "Ayyy lmao", 1, "Swagmobile"); 
// 		It says it can't be resolved to a type, because I've made Vehicle an abstact class

		Garage g = new Garage();
		g.addVehicle(c);
		g.addVehicle(t);
		g.addVehicle(m);
		g.addVehicle(l);
		g.addVehicle(new Motorbike(1000, "Yamaha"));
		g.listVehicles();

		g.billAll();
		g.billVehicle(1);
		System.out.println(l.getId());

//		g.removeVehicle(); // I've recreated what Jordan did to implement removing vehicles by class, however it doesn't like it when i type any of the classes into the brackets.
//		g.listVehicles();

//		g.emptyGarage();
//		g.listVehicles();

	}

}
