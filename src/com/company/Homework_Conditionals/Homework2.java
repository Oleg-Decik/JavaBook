package com.company.Homework_Conditionals;

public class Homework2 {
	public static void showDog () {
		Dog charli = new Dog ( "Charli", Dog.breeds.Doberman, 3 );
		charli.display ();
		Dog reks = new Dog ( "Reks", Dog.breeds.Huskies, 2.4 );
		reks.display ();
		Dog aks = new Dog ( "Aksi", Dog.breeds.Mops, 3.7 );
		aks.display ();
		Dog chaslis = new Dog ( "Aksi", Dog.breeds.Doberman, 1.3 );
		System.out.println ( Dog.refDogname );
		System.out.println ( Dog.max_age );
	}
}
