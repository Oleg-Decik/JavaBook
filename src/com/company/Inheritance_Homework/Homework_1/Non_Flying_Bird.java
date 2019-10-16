package com.company.Inheritance_Homework.Homework_1;

public class Non_Flying_Bird extends Bird {
	
	Non_Flying_Bird(String f, String l, String n){
		super(f, l, n);
	}
	
	@Override
	public void fly () {
		System.out.println ("This bird don`t fly");
	}
}
