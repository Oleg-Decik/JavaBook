package com.company.Inheritance_Practical.Practical_2;

public abstract class Person {
	private String name;
	
	Person( String name ){
		this.name = name;
	}
	
	abstract void print();
}
