package com.demo.polymorphism.overloading;

public class Case4 
{
	void show(int a, float b)
	{
		System.out.println("int float call");
	}
	
	void show(float a, int b)
	{
		System.out.println("float int call");
	}

	void show(String a, float b)
	{
		System.out.println("string float call");
	}
	public static void main(String[] args) 
	{
		Case4 c = new Case4();
		//c.show(10, 15f);
		c.show(15f, 10);
		
		c.show("abc", 10);
		
		//c.show(10, 20);//ambiguous

	}

}
