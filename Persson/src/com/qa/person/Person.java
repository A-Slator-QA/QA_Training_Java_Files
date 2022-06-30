package com.qa.person;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	private boolean living;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.setAge(age);
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 111) {
			this.age = age;
			this.living = true;
		} else {
			this.living = false;
			System.out.println("Invalid age: " + age);
		}
	}

	public boolean isLiving() {
		return this.living;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public String getBlurb() {
		return "Hello, my name is " + this.name + ", I am a " + this.age + "-year old " + this.jobTitle;
	}

}
