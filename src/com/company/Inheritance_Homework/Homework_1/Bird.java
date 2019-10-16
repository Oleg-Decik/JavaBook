package com.company.Inheritance_Homework.Homework_1;

public abstract class Bird {
	public String Feathers;
	public String Lay_Eggs;
	public String Name;
	
	public Bird(String f, String l, String n){
		Feathers = f;
		Lay_Eggs = l;
		Name = n;
	}
	
	public abstract void fly();
}
