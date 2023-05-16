package com.demo.polymorphism.overriding;

/***
 * Overriding Abstract Method Rule----->
 * 									Abstract method is an interface or abstract class are meant to be overridden in derived concrete
 * 									classes otherwise compile-time error will be thrown				
 * 
 * 
 * 
 * */

abstract class Test5
{
	abstract void display();
	void show()
	{
		System.out.println("1");
	}
}

public class AbstarctMethodRule extends Test5
{
	
	void display()
	{
		System.out.println("abstarct rule");
	}
	
	void show()
	{
		System.out.println("5");
	}
	
	
	public static void main(String[] args) 
	{
		AbstarctMethodRule am = new AbstarctMethodRule();
		am.show();
		am.display();
		
	}

}
