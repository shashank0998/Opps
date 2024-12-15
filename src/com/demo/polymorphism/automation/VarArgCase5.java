package com.demo.polymorphism.automation;

public class VarArgCase5 
{
	
	public void m1(int i)
	{
		System.out.println("general method");
	}
	public void m1(int...i)
	{
		System.out.println("var-arg method");
	}
	
	public static void main(String[] args) 
	{
		VarArgCase5 va = new VarArgCase5();
		va.m1();
		va.m1(10,20,30);
		va.m1(10);
	}
}
