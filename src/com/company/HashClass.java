package com.company;

import javax.xml.namespace.QName;

public class HashClass {
	public static int ID;
	public String name;

	 public HashClass (String name) {
		this.name = name;
		ID++;
	}

	public void ShowInfo () {
		System.out.println (ID + " | " + name);
		 this.ID = ID++;
	}

}
