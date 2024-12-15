package com.demo.methodoverloading;

public class Calculator 
{

	public int add(int a, int b)
	{
		return a+b;
	}

	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public double add(double a, double b)
	{
		return a + b;
	}
	
	
/*	this is invalid method 
 
 * public int multiply(int a) { 
	    return a * a; 
	}

	public double multiply(int a) { 
	    return a * 1.0; // ERROR: Duplicate method
	}
*/
	
	
	
	public static void main(String[] args) 
	{
		
		Calculator cal = new Calculator();
	
		System.out.println("two integer number addition : "+cal.add(10, 12));
		System.out.println("three integer number addition : "+cal.add(30, 42,22));
		System.out.println("double integer number addition : "+cal.add(20.5, 15.5));

	}

}
