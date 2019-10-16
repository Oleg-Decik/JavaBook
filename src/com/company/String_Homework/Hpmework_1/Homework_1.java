package com.company.String_Homework.Hpmework_1;

import java.util.Scanner;

public class Homework_1 {
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		String name = scanner.nextLine ();
		String str = name;
		String[] names = str.split ( " " );
		String maxLenght = names[0];
		int max = maxLenght.length ();
		for ( int i = 1 ; i < names.length ; i++ ){
			if ( names[i].length () > maxLenght.length ()){
				maxLenght = names[i];
			}
		}
		System.out.println (maxLenght);
		System.out.println ( max );
		System.out.println ( names[1] );
		System.out.println (names);
	}
}
