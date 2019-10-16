package com.company.Loops_Array.Practical;

import java.util.Scanner;

public class Employee {
	public String name;
	public int departments;
	public double salary;
	public static Employee[] employee = new Employee[ 5 ];
	public static int lenght = 0;
	
	public Employee ( String name, int departments, double salary ) {
		this.name = name;
		this.departments = departments;
		this.salary = salary;
		employee[ lenght ] = this;
		lenght++;
	}
	
	@Override
	public String toString () {
		return "Employee{" +
				"name='" + name + '\'' +
				", departments=" + departments +
				", salary=" + salary +
				'}';
	}
	
	public void getDisplayAllEmployees () {
		Scanner scanner = new Scanner ( System.in );
		departments = scanner.nextInt ();
		for ( int i = 0 ; i < employee.length ; i++ ) {
			if ( employee[ i ].departments == departments ) {
				System.out.println ( employee[ i ] );
			}
		}
	}
}
