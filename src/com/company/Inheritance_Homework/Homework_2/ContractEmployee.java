package com.company.Inheritance_Homework.Homework_2;

public class ContractEmployee extends Employee implements Calculate {
	
	private float averageMounthlySalary;
	private float fixedMonthlyPayment;
	private final int federalTaxIdmember = 10;
	
	public ContractEmployee ( String id, String name, float fmp ) {
		super ( id, name );
		this.fixedMonthlyPayment = fmp;
	}
	
	@Override
	public double calculatePay () {
		averageMounthlySalary = fixedMonthlyPayment;
		System.out.printf ( "Average monthly salary is: %.2f \n", averageMounthlySalary );
		return 0;
	}
	
	@Override
	protected void Display () {
		System.out.println ( employeeId + ": Fixed paid: " + " Name: " + name + " Tax is 5%" );
	}
}
