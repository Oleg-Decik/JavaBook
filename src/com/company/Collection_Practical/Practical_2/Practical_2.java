package com.company.Collection_Practical.Practical_2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Practical_2 {
	public static void main ( String[] args ) throws InterruptedException {
		Map <Integer, String> employeeMap = new TreeMap <Integer, String> ();
		Scanner scanner = new Scanner ( System.in );
		Scanner sc = new Scanner ( System.in );
		employeeMap.put ( 1, "Oleg" );
		employeeMap.put ( 2, "Artem" );
		employeeMap.put ( 3, "Oleg" );
		employeeMap.put ( 4, "Vova" );
		employeeMap.put ( 5, "Uasya" );
		employeeMap.put ( 6, "Andrew" );
		employeeMap.put ( 7, "Nata" );
		
		System.out.println ("Enter ID: ");
		Integer key = scanner.nextInt ();
		
		if ( employeeMap.containsKey ( key ) ) {
			System.out.println (employeeMap.get ( key ));
		} else {
			System.out.println ("Artem lox");
		}
		
		
		System.out.println ("Enter Name: ");
		String name = sc.nextLine ();
		for ( Iterator i = employeeMap.entrySet ().iterator () ; i.hasNext () ; ) {
			Map.Entry entry = ( Map.Entry ) i.next ();

				if ( entry.getValue ().equals ( name ) ) {
					System.out.println ( entry.getKey () );
				}

		}
	}
	
}
