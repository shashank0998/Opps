package com.demo.methodoverrinding;

// parent class
class Animal
{
	// method to be overridden
	public void sound()
	{
		System.out.println("animal makes a sound");
	}
}

// child class 1
class Dog extends Animal
{
	// overriding the sound() 
	public void sound()
	{
		System.out.println("dog bark");
	}
}

// child class 2
class Cat extends Animal
{
	// overriding the sound()
	public void sound()
	{
		System.out.println("cat meows");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.sound();
				
		// parent class reference child object(Dog)
		Animal dog = new Dog();
		dog.sound();
		
		// parent class reference child object(Cat)
		Animal cat = new Cat();
		cat.sound();
		

	}

}
