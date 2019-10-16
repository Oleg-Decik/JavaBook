package com.company.Collection_Practical.Practical_1;

import java.util.*;

public class Practical_1 {

	public static void main ( String[] args ) {
		List <Integer> myCollection = new ArrayList <> (  );
		ArrayList <Integer> newCollection = new ArrayList <> (  );
		Random random = new Random ();
		
		for(int i = 0; i < 10; i++){
			myCollection.add ( random.nextInt (50) +1);
		}
		System.out.println (myCollection);
		
		myCollection.remove ( 2 );
		myCollection.add ( 2, 1 );
		myCollection.remove ( 8 );
		myCollection.add ( 8, -3 );
		myCollection.remove ( 5 );
		myCollection.add ( 5, -4 );
		System.out.println ("position - 2" + " calue of element - " + myCollection.get ( 2 ));
		System.out.println ("position - 8" + " calue of element - " + myCollection.get ( 8 ));
		System.out.println ("position - 5" + " calue of element - " + myCollection.get ( 5 ));
		System.out.println (myCollection);
		
		
		for ( int i = 0 ; i < myCollection.size (); i++ ){
			if ( myCollection.get ( i ) >= 5 ){
				newCollection.add ( myCollection.get ( i ) );
			}
		}
		
		
		System.out.println (newCollection);
		for ( int i = 0 ; i < myCollection.size (); i++ ){
			if ( myCollection.get ( i ) >= 20 ){
				myCollection.remove ( myCollection.get ( i ) );
			}
		}
		System.out.println (myCollection);
		Collections.sort(myCollection);
		System.out.println ("Sorted collection: " + myCollection);
	}
	
}
