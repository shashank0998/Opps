package com.demo.inheritance;

public class MethodOverrideInheritance {

	public static void main(String[] args) 
	{
		D d = new D();
		d.eat();
		d.bark();
	}

}

class A
{
	public void eat()
	{
		System.out.println("I can eat");
	}
}

class D extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("I eat dog food");
	}
	
	public void bark()
	{
		System.out.println("I can Bark");
	}
}
