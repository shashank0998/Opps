package com.demo.thiskeyword;

/*
 * case 1 ---> this keyword is used to invoke current class instance variable
 * 
 * 
 * 
 * **/

public class Case1 
{
	int i;
	void setValue(int i)
	{
		this.i = i;
	}
	void shoe()
	{
		System.out.println(i);
	}
}

class Xyz
{
	public static void main(String[] args) 
	{
		Case1 c = new Case1();
		c.setValue(10);
	}
}