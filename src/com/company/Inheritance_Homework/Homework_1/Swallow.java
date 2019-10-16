package com.company.Inheritance_Homework.Homework_1;

public class Swallow extends Flying_Bird {
	Swallow(String f, String l, String n){
		super(f, l, n);
	}
	
	@Override
	public void fly () {
		System.out.println ("Eagle flys");
	}
}
