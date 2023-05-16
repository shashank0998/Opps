package com.demo.polymorphism.overriding;
/***
 * 
 * case 5 :Invoking overridden method from child class---->
 * 								we can call parent class method in overriding method using super keyword.
 * 
 * 
 * case 6 :
 * 			Which method cannot override ?
 * 		
 * 			1) final() cannot be override ?
 * 			----> If we don't want a method to be overridden we declare it as final. 
 * 
 * 			2) static() cannot be override ?
 * 			----> (Method overriding vs Method Hiding)
 * 					when you defines a static method with same signature as a static method in base class it is known as method hiding
 * 
 * 			3) private() methods cannot be overridden ?
 * 			----> private() cannot be overridden as they are bonded during compile-time.
 * 				  therefore we can't even override private() in a child class. 
 * 
 * 
 * case 7 :
 * 			Overriding and synchronized / stritFp() ?
 * 			----> The presence of synchronized / strictFp modifier with method have no effect on the rule of overriding 
 * 					it's possible that a synchronized / strictFp method can overriden a non synchronized / strictFp one and vice-versa.
 * 
 * **/

class Test6
{
	 void show()
	{
		System.out.println("1");
	}
}
public class InvokingChildclass extends Test6
{
	void show()
	{
		super.show();
		System.out.println("2");
	}

	public static void main(String[] args)
	{
		InvokingChildclass ic = new InvokingChildclass();
		ic.show();
	}

}
