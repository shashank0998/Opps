package com.demo.thiskeyword;

/**
 * 
 * case 5 ----> this keyword can be used to pass an argument in the constructor call
 * 
 * 
 * 
 * 
 ****/

class Test8
{
	Test8(Case5 t) 
	{
		System.out.println("constructor");
	}
}
class Case5 
{
	
	void m1()
	{
		Test8 t = new Test8(this);
	}
	public static void main(String[] args) 
	{
		Case5 t = new Case5();
		t.m1();
	}
	
}
