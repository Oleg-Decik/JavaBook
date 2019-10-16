package com.company.Inheritance_Homework.Homework_1;

public class Chicken extends Non_Flying_Bird {
	Chicken(String f, String l, String n){
		super(f, l, n);
	}
	
	@Override
	public void fly () {
		System.out.println ("Eagle flys");
	}
}
