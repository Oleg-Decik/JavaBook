package com.company.String_Practical.Practical_3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical_3 {
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		for ( int i = 0 ; i < 5 ; i++ ) {
			System.out.println ( "Enter your name please:" );
			String userNameString = scanner.nextLine ();
			if ( checkWithRegExp ( userNameString ) ){
				System.out.printf ( "Your name is: %s, and it`s valid\n", userNameString );
			} else {
				System.out.printf ( "Your name is: %s, and it`s invalid\n", userNameString );
			}
		}
	}
	
	public static boolean checkWithRegExp ( String userNameString ) {
		Pattern p = Pattern.compile ( "^[a-z0-9_-]{3,15}$" );
		Matcher m = p.matcher ( userNameString );
		return m.matches ();
	}
	
}
