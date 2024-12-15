package com.demo.polymorphism.automation;

public class StringCase3 
{
	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(StringBuffer s)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) 
	{
		StringCase3 sc = new StringCase3();
		sc.methodOne("shash");
		sc.methodOne(new StringBuffer("aarti"));
		//sc.methodOne(null);
	}
}
