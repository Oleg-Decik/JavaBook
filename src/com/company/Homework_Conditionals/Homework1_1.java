package com.company.Homework_Conditionals;
import java.util.Scanner;

public class Homework1_1 {
	
	public Scanner scanner = new Scanner (System.in);
	
	private int min = 100;
	private int max = 0;
	
	
	public void ShowFloat(){
		for ( int i = 0 ; i < 3 ; i++ ){
			System.out.println ("Enter your float: ");
			float scaner = scanner.nextFloat ();
			if ( scaner >= -5 && scaner <= 5 ){
				System.out.printf ("Float =  %.2f\n", scaner);
			} else {
				System.out.println ("Float doesn`t belong [-5,5] range");
				return;
			}
		}
	}
	
	public void ShowInteger(){
		for ( int i = 0 ; i < 3 ; i++ ){
			System.out.println ("Enter integer: ");
			int scaner = scanner.nextInt ();
			if ( scaner > max ){
				max = scaner;
			}
			if ( scaner < min ){
				min = scaner;
			}
			System.out.printf ("Max is: %d\n", max);
			System.out.printf ("Min is: %d\n", min);
		}
	}
}




