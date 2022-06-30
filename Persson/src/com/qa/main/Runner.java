package com.qa.main;

import java.util.ArrayList;
import java.util.List;

import com.qa.person.Person;

public class Runner {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		Person p0 = new Person("Andrew", 26, "Massive Legend");
		Person p1 = new Person("Feiza", 21, "Trainee");
		Person p2 = new Person("James", 43, "Trainee");
		Person p3 = new Person("Jordan", 52, "Trainer");
		Person p4 = new Person("David", 27, "Personal Shopper");
		Person p5 = new Person("Gasher", 145, "Grey");
		Person p6 = new Person("Georgina", -2, "Grandmother");
		Person p7 = new Person("Sheemie", 37, "Breaker");

		people.add(p0);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);

		for (Person p : people) {
			if (p.isLiving() == false) {
				people.remove(p);
			} else {
				System.out.println(p.getBlurb());
			}
		}

//		for
//		(int i = 0; i < people.size(); i++) {
		// person p = people.get(i)
//			if (people.get(i).isLiving() == false) {
//				people.remove(i);
//				i--;
//			} else {
//				System.out.println(people.get(i).getBlurb());
//			}
//		}

	}

}
