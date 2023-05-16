package com.demo.polymorphism.overloading;

public class Case3 
{

	void show(StringBuffer a)
	{
		System.out.println("StringBuffer call");
	}
	void show(String a)
	{
		System.out.println("String call");
	}
	public static void main(String[] args) 
	{
		Case3 c = new Case3();
		//c.show(null);
		c.show("A");
		c.show(new StringBuffer("X"));
	}

}
