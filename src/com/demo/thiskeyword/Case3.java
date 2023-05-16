package com.demo.thiskeyword;
/**
 * case 3 ---> this() keyword can be used to invoke current class constructor
 * 
 * 
 * **/

public class Case3 
{
	Case3()
	{
		System.out.println("no - arg constructor");
	}
	
	Case3(int a)
	{
		this();												// called no - arg constructor
		System.out.println("parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		Case3 c = new Case3(1909);
	}
}
