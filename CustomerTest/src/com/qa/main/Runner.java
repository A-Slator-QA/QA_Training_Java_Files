package com.qa.main;

import com.qa.customertest.Customer;

public class Runner {
	
	public static void main(String[] args) {
		
		Customer cust = new Customer(null, null, null, 0);
		Customer bob = new Customer(null, null, null, 0);
		
		bob.setFirstName("Bob");
		bob.setSurname("Dole");
		bob.setEmail("Bob.Dole@qa.com");
		bob.setAge(67);
		
		cust.setFirstName("Andrew");
		cust.setSurname("Slator");
		cust.setEmail("a.slator@qa.com");
		cust.setAge(26);
		System.out.println(cust.getFirstName() + " " +  cust.getSurname() + ", " + cust.getAge() + ", " +  cust.getEmail());
		System.out.println(bob.getFirstName() + " " +  bob.getSurname() + ", " + bob.getAge() + ", " +  bob.getEmail());
			
	}
}