package com.demo.polymorphism.automation;

public class IntCase1 
{
	/*public void methodOne(int i)
	{
		System.out.println("int arg method");
	}*/
	public void methodOne(float f)
	{
		System.out.println("float arg method");
	}
	public static void main(String[] args) 
	{
		IntCase1 c=new IntCase1();
		int i=100;
		
		c.methodOne(i);

	}

}
