package com.company.Collection_Homework.Homework_2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Homework_2 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		Map<String, String> personMap = new TreeMap <> (  );
		personMap.put ( "A", "a" );
		personMap.put ( "B", "b" );
		personMap.put ( "C", "c" );
		personMap.put ( "D", "d" );
		personMap.put ( "E", "e" );
		personMap.put ( "F", "f" );
		personMap.put ( "G", "g" );
		personMap.put ( "H", "g" );
		personMap.put ( "I", "g" );
		personMap.put ( "J", "j" );
		
		System.out.println (personMap);
		
		System.out.println ("Enter Name: ");
		String name = sc.nextLine ();
		
		for ( Iterator i = personMap.entrySet ().iterator () ;  ; i.hasNext ()) {
			Map.Entry entry = ( Map.Entry ) i.next ();
				if ( entry.getValue ().equals ( name ) ) {
					personMap.remove ( entry.getKey () );
					
					break;
				}
		}
		System.out.println ( personMap );
	}
}
