package com.demo.polymorphism.automation;

public class StringCase2 
{

	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(Object o)
	{
		System.out.println("Object version");
	}
	public static void main(String[] args) 
	{
		StringCase2 sc = new StringCase2();
		sc.methodOne("Arun");
		sc.methodOne(new Object());
		sc.methodOne(null);

	}

}
