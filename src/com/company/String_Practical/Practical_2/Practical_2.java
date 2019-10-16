package com.company.String_Practical.Practical_2;

import java.util.Scanner;

public class Practical_2 {
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		
		System.out.println ("Enter Surname: ");
		String surname = scanner.nextLine ();
		System.out.println ("Enter Name: ");
		String name = scanner.nextLine ();
		System.out.println ("Enter Patronymic: ");
		String patronymic = scanner.nextLine ();
		System.out.printf ("Surname: %s Name: %s Patronymic: %s\n",surname, name.charAt ( 0 ), patronymic.charAt ( 0 ));
		System.out.printf ("Name: %s\n",name);
		System.out.printf ("Name: %s Patronymic: %s Surname: %s",name, patronymic, surname);
	}
}
