package com.demo.Interface;

class Test implements I1, I2						// create two interfaces to check multiple inheritance achieve in java
{
	public void display()
	{
		System.out.println("Second interface created");
	}
	
	
	public void show()
	{
		System.out.println("1");
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();
		t.display();
	}
}
