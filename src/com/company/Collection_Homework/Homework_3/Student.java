package com.company.Collection_Homework.Homework_3;

import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	public Student(){
	
	}
	
	public Student(String n, int c){
		name = n;
		course = c;
	}
	
	public void printStudents(List students, Integer course){
		Iterator i = students.iterator ();
		while ( i.hasNext () ) {
			if ( this.getCourse () == course ) {
				System.out.println ( getName () );
			}
		}
	}
	
	public String getName () {
		return name;
	}
	
	public int getCourse () {
		return course;
	}
}
