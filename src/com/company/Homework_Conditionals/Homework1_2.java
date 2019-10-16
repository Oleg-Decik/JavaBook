package com.company.Homework_Conditionals;

import com.company.Homework_Conditionals.HTTPEnum.HTTP;

import java.util.Scanner;

public class Homework1_2 {
	public static void DisplayError () {
		Scanner scanner = new Scanner ( System.in );
		
		HTTP http;
		http = HTTP.F400;
		HTTP http1;
		http1 = HTTP.F401;
		HTTP http2;
		http2 = HTTP.F402;
		HTTP http3;
		http3 = HTTP.F403;
		
		System.out.println ( "Enter satus code: " );
		
		int thisName = scanner.nextInt ();
		
		switch ( thisName ) {
			case 400:
				System.out.println ( http.getDescription () );
				break;
			case 401:
				System.out.println ( http1.getDescription () );
				break;
			case 402:
				System.out.println ( http2.getDescription () );
				break;
			case 403:
				System.out.println ( http3.getDescription () );
				break;
			default:
				System.out.println ( "You entered nothing or incorrect status code" );
		}
		
	}
}
