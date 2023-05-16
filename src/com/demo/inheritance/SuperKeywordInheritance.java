package com.demo.inheritance;

public class SuperKeywordInheritance {

	public static void main(String[] args) 
	{
		E e = new E();
		e.eat();
		e.bark();
	}

}

class F 
{
	public void eat()
	{
		System.out.println("I can eat");
	}
}

class E extends F
{
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("i can eat dog food");
	}
	
	public void bark()
	{
		System.out.println("I can Bark");
	}
}
