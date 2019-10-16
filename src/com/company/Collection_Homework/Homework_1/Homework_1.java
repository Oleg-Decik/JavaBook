package com.company.Collection_Homework.Homework_1;

import java.util.*;

public abstract class Homework_1 {
	public static void main ( String[] args ) {
		TreeSet <String> set1 = new TreeSet ();
		TreeSet <String> set2 = new TreeSet ();
		set1.add ( "Oleg" );
		set1.add ( "Andrew" );
		set1.add ( "Artem" );
		set1.add ( "Nata" );
		set2.add ( "Oleg" );
		set2.add ( "Vova" );
		set2.add ( "Roman" );
		//Union ( set1, set2 );
		Intersect ( set1, set2 );
	}
	
	public static void Union ( TreeSet set1, TreeSet set2 ) {
		set1.addAll ( set2 );
		System.out.println ( set1 );
	}
	
	public static void Intersect ( TreeSet set1, TreeSet set2 ) {
		set1.retainAll ( set2 );
		System.out.println (set1);
	}
}
