package com.company;

import java.util.*;

public class WhileTest {
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		TreeMap <Integer, String> testMap = new TreeMap <> ();
		testMap.put ( 1, "Oleg" );
		testMap.put ( 2, "Artem" );
		testMap.put ( 3, "Oleg" );
		testMap.put ( 4, "Vova" );
		testMap.put ( 5, "Oleg" );
		testMap.put ( 6, "Nata" );
		
		System.out.println ( testMap );
		
		for ( int i = 0 ; ; i++ ) {
			String goes = scanner.nextLine ();
			if ( goes.equals ( "go" ) ) {
				System.out.println ( "Go" );
				break;
			} else {
				System.out.println ( "Dont go" );
				continue;
			}
		}
		
		for ( Iterator i = testMap.entrySet ().iterator () ; ; i.hasNext () ) {
			Map.Entry entry = ( Map.Entry ) i.next ();
			if ( entry.getValue ().equals ( entry.getValue () ) ) {
				System.out.println ( "The same value" );
				testMap.remove ( entry.getKey () );
			}
		}
	}
}
