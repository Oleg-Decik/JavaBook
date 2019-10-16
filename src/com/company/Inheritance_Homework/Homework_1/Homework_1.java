package com.company.Inheritance_Homework.Homework_1;

public class Homework_1 {
	public static void main ( String[] args ) {
		Bird[] birds = new Bird[6];
		birds[0] = new Flying_Bird ( "Yes", "Yes", "Hoak" );
		birds[1] = new Non_Flying_Bird ( "Yes", "Yes", "Hus`" );
		birds[2] = new Eagle ( "Yes", "Yes", "Ponchik" );
		birds[3] = new Swallow ( "Yes", "Yes", "Lastivka" );
		birds[4] = new Penguin ( "Yes", "Yes", "Pengui" );
		birds[5] = new Chicken ( "Yes", "Yes", "Petuch" );
		
		System.out.println ("Feather: " + birds[0].Feathers + " Lay Eggs: " + birds[0].Lay_Eggs + " Name: " + birds[0].Name );
		System.out.println ("Feather: " + birds[1].Feathers + " Lay Eggs: " + birds[1].Lay_Eggs + " Name: " + birds[1].Name );
		System.out.println ("Feather: " + birds[2].Feathers + " Lay Eggs: " + birds[2].Lay_Eggs + " Name: " + birds[2].Name );
		System.out.println ("Feather: " + birds[3].Feathers + " Lay Eggs: " + birds[3].Lay_Eggs + " Name: " + birds[3].Name );
		System.out.println ("Feather: " + birds[4].Feathers + " Lay Eggs: " + birds[4].Lay_Eggs + " Name: " + birds[4].Name );
		System.out.println ("Feather: " + birds[5].Feathers + " Lay Eggs: " + birds[5].Lay_Eggs + " Name: " + birds[5].Name );
	}
}
