package com.company.Loops_Array.Practical;
import com.company.Loops_Array.Practical.Employee;
public class SecondArrayTask {

	public static void SecondTask () {

		Employee employee = new Employee ("Ivan", 1, 2000);
		Employee employee1 = new Employee ("Vasya", 1, 20500);
		Employee employee2 = new Employee ("Oleg", 3, 1750);
		Employee employee3 = new Employee ("Anton", 2, 3100);
		Employee employee4 = new Employee ("Artem", 5, 1750);

		for (int i = 0 ; i < Employee.employee.length ; i++){
			System.out.println (Employee.employee[i].toString ());
		}
		
		
	}
}
