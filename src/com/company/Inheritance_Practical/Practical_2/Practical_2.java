package com.company.Inheritance_Practical.Practical_2;

public class Practical_2 {
	public static void main ( String[] args ) {
		Person[] personArray = new Person[ 5 ];
		personArray[ 0 ] = new Teacher ( "Ihor Kohut", 5000 );
		personArray[ 1 ] = new Cleaner ( "Baba Olya", 1500 );
		personArray[ 2 ] = new Student ( "Oleg Kmet`" );
		for ( int i = 0 ; i < personArray.length ; i++ ) {
			if ( personArray[ i ] instanceof Staff ) {
				personArray[i].print ();
				( ( Staff ) personArray[ i ] ).Salary ();
			}
			
		}
	}
}
