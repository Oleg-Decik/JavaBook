package com.company.Loops_Array.Practical;

public class FirstArrayTask {
	public static int[] arr = { 2, -5, 7, -4, 8, 3, -1, 12, -3, 1 };
	
	public static void displayBiggest () {
		int max = 0;
		for ( int i = 0 ; i < arr.length ; i++ ) {
			if ( arr[ i ] > max ) {
				max = arr[ i ];
			}
		}
		System.out.println ( max );
	}
	
	public static void displaySumPositive () {
		int sum = 0;
		for ( int i = 0 ; i < arr.length ; i++ ) {
			if ( arr[ i ] > 0 ) {
				sum += arr[ i ];
			}
		}
		System.out.println ( sum );
	}
	
	public static void displayAmount () {
		int amount = 0;
		
		for ( int a : arr ) {
			if ( a < 0 ) {
				amount++;
			}
		}
		System.out.println ( amount );
	}
	
	public static void whichMore () {
		int amountPos = 0;
		int amountNeg = 0;
		
		for ( int a : arr ) {
			if ( a < 0 ) {
				amountNeg++;
			} else if ( a > 0 ) {
				amountPos++;
			}
		}
		if ( amountNeg > amountPos ) {
			System.out.println ( "Negative values more" );
		} else if ( amountNeg < amountPos ) {
			System.out.println ( "Positive values more" );
		} else {
			System.out.println ( "Negative and positive values are equal" );
		}
	}
}
