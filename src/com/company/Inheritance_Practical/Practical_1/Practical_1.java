package com.company.Inheritance_Practical.Practical_1;

public class Practical_1 {
	public static void main ( String[] args ) {
		Animals[] animalsArray = new Animals[4];
		animalsArray[0] = new Cat ( "Murchik", 1 );
		animalsArray[1] = new Cat ( "Ruzhuk", 3 );
		animalsArray[2] = new Dog ( "Archi", 5 );
		animalsArray[3] = new Dog ( "Aksi", 4 );
		animalsArray[0].voice ();
		animalsArray[0].feed ();
		animalsArray[1].voice ();
		animalsArray[1].feed ();
		animalsArray[2].voice ();
		animalsArray[2].feed ();
		animalsArray[3].voice ();
		animalsArray[3].feed ();
		
	}
	
}
	
	
