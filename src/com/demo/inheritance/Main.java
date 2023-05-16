package com.demo.inheritance;

public class Main {

	public static void main(String[] args) 
	{
		// create object of subclass
		Dog d = new Dog();
		
		// access field of super class
		d.name = "Alex";
		d.display();
		
		// class method of superclass
		// using object of subclass
		d.eat();

	}

}

class Animal
{
	// field and method of parent class
	
	String name;
	
	public void eat()
	{
		System.out.println("I can eat");
	}

}
//inherit from animal
class Dog extends Animal
{
	public void display()
	{
		System.out.println("my name is  "+name);
	}
}
