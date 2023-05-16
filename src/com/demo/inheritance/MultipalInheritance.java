package com.demo.inheritance;

import com.demo.Interface.A;

public class MultipalInheritance
{
	
	public static void main(String[] args) 
	{
		
		C obj = new C();
		obj.display();
		obj.msg();

	}

}

interface B
{
	 public void msg();
	 
}

class C implements A
{
	public void display()
	{
		System.out.println("this implements a in class c");
	}
	
	public void msg()
	{
		System.out.println("this implements b and methos is msg");
	}
}
