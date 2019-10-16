package com.company.Inheritance_Practical.Practical_2;

public class Student extends Person {
	final String TYPE_PERSON = "Student";
	Student(String name){
		super(name );
		System.out.println (TYPE_PERSON);
	}
	
	@Override
	void print () {
		System.out.println ("I`m a: " + TYPE_PERSON);
	}
	
}
