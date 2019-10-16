package com.company.Inheritance_Homework.Homework_1;

public class Penguin extends Non_Flying_Bird {
	Penguin(String f, String l, String n){
		super(f, l, n);
	}
	
	@Override
	public void fly () {
		System.out.println ("Eagle flys");
	}
}
