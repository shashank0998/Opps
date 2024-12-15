package com.demo.polymorphism.automation;

public class TwoParaCase4 
{
	public void m1(int i,float f)
	{
		System.out.println("int float method");
	}
	public void m1(float f,int i)
	{
		System.out.println("float int method");
	}
	public static void main(String[] args) 
	{
		TwoParaCase4 c =new TwoParaCase4();
		c.m1(10,10.5f);
		c.m1(10.5f,10);
		
		//c.m1(10,10); //CE:reference to m1() is ambiguous,
		 //both method methodOne(int,float) in Test 
		 //and method methodOne(float,int) in Test match
		
		//c.m1(10.5f,10.5f);		//cannot find symbol
		
	}
}
