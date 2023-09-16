package com.collectors;

public class Person {

	String name;
	String country;
	public Person(String name,String country) {
		
		this.name = name;
		this.country = country;
		
	}
	
public String toString() {
	return "person[name" +name + ",country" +country+"]";
	
}
}
