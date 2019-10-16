package com.company.Inheritance_Homework.Homework_2;

public class SalariedEmployee extends Employee implements Calculate {
	
	public static SalariedEmployee salariedEmployee;
	private String socialSecurityNumber;
	private float averageMounthlySalary;
	private final float hourlyRate = 30;
	private  float workedHours;
	
	public SalariedEmployee(String id, String name, float wh){
		super(id, name);
		this.workedHours = wh;
	}
	
	@Override
	public double calculatePay () {
		averageMounthlySalary = hourlyRate * workedHours;
		System.out.printf ( "Average monthly salary is: %.2f \n", averageMounthlySalary );
		return 0;
	}
	
	public float getHourSalary () {
		return 0;
	}
	
	@Override
	protected void Display (  ) {
		System.out.println (employeeId + ": Hourly paid: " + " Name: " + name );
	}
	
}
