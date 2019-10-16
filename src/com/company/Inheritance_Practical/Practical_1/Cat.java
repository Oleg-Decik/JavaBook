package com.company.Inheritance_Practical.Practical_1;

public class Cat extends Animals {
	private String names;
	
	Cat(String name, int age){
		super( name, age );
		this.names = name;
	}
	
	@Override
	public void voice () {
		System.out.println (names + " says meow ");
	}
	
	@Override
	public void feed () {
		System.out.println (names + " Wants eat");
	}
	
}
