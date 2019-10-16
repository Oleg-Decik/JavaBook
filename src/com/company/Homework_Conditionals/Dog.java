package com.company.Homework_Conditionals;

public class Dog {
	public enum breeds {
		Mops,
		Huskies,
		Doberman;
	}

	public String name;
	public double age;
	private breeds breed;
	public static double max_age;
	public static Dog refDog;
	static String refDogname = "";

	public Dog (String name, breeds breeds, double age) {
		this.age = age;
		this.name = name;
		this.breed = breeds;
		if (age >= max_age) {
			max_age = 0;
			max_age += age;
			refDog = this;
		}
		refDogname = name;
	}

	public void display () {
		System.out.println (name + " " + breed.toString () + " " + age);
	}
	public static void displaySame(){
		if ( refDog.name == refDogname ) {
			refDogname = refDog.name;
		}
	}
}
