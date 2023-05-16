package com.demo.polymorphism;

public class OverridingRules {

	public static void main(String[] args) 
	{

	}

}
/*
 * use can use parent class method using primitive then class will extends and same primitive or this child 
 * 
 * */

class A 
{
	Integer m1()													// rules for primitive
	{
		System.out.println("inside parent class");
		return 10;
	}
}

class B extends A
{
	Integer m1()
	{
		System.out.println("inside child class");
		return 10;
	}
}