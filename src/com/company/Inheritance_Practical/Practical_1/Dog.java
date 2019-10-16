package com.company.Inheritance_Practical.Practical_1;

public class Dog extends Animals {
	private String names;
	Dog(String name, int age){
		super( name, age );
		this.names = name;
	}
	
	@Override
	public void voice () {
		System.out.println (names + " Says uafw");
	}
	
	@Override
	public void feed () {
		System.out.println (names + " Wants eat");
	}
}
