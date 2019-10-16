package com.company.Inheritance_Homework.Homework_2;

public class Employee {
	protected String employeeId ;
	protected String name;
	public Employee(String id, String name){
		this.employeeId = id;
		this.name  = name;

	}
	
	protected void Display ( ){
		System.out.println (employeeId + " Name: " + name + " Salary: " );
	}
	
}
