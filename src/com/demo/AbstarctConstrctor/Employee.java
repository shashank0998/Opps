package com.demo.AbstarctConstrctor;

public abstract class Employee 
{
	int id;
	String name;
	public Employee()							// create no-arg constructor under abstract class
	{
		
	}
	
	public Employee(int id, String name)		// create parameterized constructor
	{
		this.id = id;
		this.name = name;
	}
}
