package com.demo.polymorphism.overloading;

//Automatic Promotion
public class Case1 
{
	void show(int a)
	{
		System.out.println("Int method call");
	}
	void show(String a)
	{
		System.out.println("String method call");
	}
	
	public static void main(String[] args) 
	{
		Case1 c = new Case1();
		c.show(10);											// pass the int value so go for int method call
															// but we pass string value so go for string method call

	}

}

/*		
 * 									  double
 *										|
 * 										|				
 * 				byte ----> short ----> int ----> float
 * 										|		   |
 * 						   				|		   |
 * 									  long ----> double
 * 										|
 * 										|
 * 									  float
 * 
 * 					char
 * 					 |
 * 					int
 */