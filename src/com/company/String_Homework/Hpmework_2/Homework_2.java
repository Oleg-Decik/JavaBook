package com.company.String_Homework.Hpmework_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework_2 {
	
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		String name = scanner.nextLine ();
		String str = name;
		Pattern p = Pattern.compile ( "[a-zA-Z0-9]+" );
		Matcher m = p.matcher ( str );
		while ( m.find () ){
			System.out.print (str.substring ( m.start (), m.end () ) + " " );
		}
	}
}
