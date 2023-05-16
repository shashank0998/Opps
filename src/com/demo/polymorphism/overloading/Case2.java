package com.demo.polymorphism.overloading;

public class Case2 
{
	void show(Object a)
	{
		System.out.println("Object call");
	}
	void show(String a)
	{
		System.out.println("String call");
	}
	public static void main(String[] args)
	{
		Case2 c = new Case2();
		c.show("10");

	}

}

/*
 * 			Object <---------- String
 * 
 * 			while resolving overloaded methods compiler will always give precedence for the child class
 * 			 argu. than compared with parent type argu.  
 * 
 * 
 * */
