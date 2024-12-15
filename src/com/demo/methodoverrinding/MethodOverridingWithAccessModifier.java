package com.demo.methodoverrinding;


class Parent
{
	protected void display()
	{
		System.out.println("parent display method");
	}
}

class Child extends Parent
{
	public void display()					// access modifier is less restrictive {protected -> public}
	{
		System.out.println("child display method");
	}
}


public class MethodOverridingWithAccessModifier 
{

	public static void main(String[] args) 
	{
		Parent obj = new Child();
		obj.display();		

	}

}
