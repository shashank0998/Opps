package com.demo.thiskeyword;

/**
 * 
 * case 4 ---> this keyword can be used to pass as argument in the method call
 * 
 * 
 * **/


public class Case4 
{
	
	void m1(Case4 c)
	{
		System.out.println("this is m1() ");
	}
	
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args) 
	{
		Case4 c = new Case4();
		c.m2();
	}
}
