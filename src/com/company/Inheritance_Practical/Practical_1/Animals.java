package com.company.Inheritance_Practical.Practical_1;

public class Animals implements Animal {
	private String name;
	private int age;
	
	Animals(String name, int age){
		this.age =  age ;
		this.name =  name ;
	}
	
	@Override
	public void feed () {
	
	}
	
	@Override
	public void voice () {
	
	}
}
