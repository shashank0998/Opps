package com.demo.thiskeyword;
/***
 * 
 * case 6 ---> this keyword can be used to return the current class instance from method
 * 
 * 
 * 
 * **/

public class Case6 
{
	Case6 m1()
	{
		return this;
	}
	public static void main(String[] args) 
	{
		Case6 c = new Case6();
		c.m1();
	}
}
