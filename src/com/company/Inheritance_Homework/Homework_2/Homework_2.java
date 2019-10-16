package com.company.Inheritance_Homework.Homework_2;

public class Homework_2 {
	public static void main ( String[] args ) {
		Employee[] employee = new Employee[5];
		employee[0] = new SalariedEmployee ( "A001", "Artem", 40 );
		employee[1] = new SalariedEmployee ( "A002", "Oleg", 50 );
		employee[2] = new ContractEmployee ( "A003", "Vova", 1500 );
		employee[3] = new ContractEmployee ( "A004", "Roma", 1800 );
		employee[4] = new SalariedEmployee ( "A005", "Andrew", 32 );
		
		for ( int i = 0 ; i < employee.length ; i ++ ){
			if ( employee[i] instanceof SalariedEmployee){
				((SalariedEmployee)employee[i]).Display ( );
				((SalariedEmployee)employee[i]).calculatePay ();
			} else {
				((ContractEmployee)employee[i]).Display ();
				((ContractEmployee)employee[i]).calculatePay ();
			}
		}
	}
}
