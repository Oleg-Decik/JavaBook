package com.company.Inheritance_Practical.Practical_2;

public class Cleaner extends Staff {
	private double Salary;
	private final String TYPE_PERSON = "Cleaner";
	
	Cleaner(String name , double s){
		super(name );
		this.Salary = s;
		System.out.println (TYPE_PERSON);
	}
	
	@Override
	void print () {
		System.out.println ("I`m a: " + TYPE_PERSON);
	}
	
	@Override
	void Salary () {
		System.out.println ("Salary is " + Salary);
	}
	
}
