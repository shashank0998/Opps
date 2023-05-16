package com.demo.polymorphism.overriding;
/**
 *	Exception handling rule----> 
 * 							1) if the parent class overridden method does not throws exception,
 * 							   child class overriding method can only throws the unchecked exception,
 * 								throwing checked exception will lead to compile-time error.
 * 
 * 							2) if the parent class overridden method does throws exception,
 * 								child class overriding method can only throw some, child exception.
 * 							   Throwing parent exception in Exception hierarchy will lead to compile-time error.
 * 								also there is no issue if child class overridden nethod is not throwing any exception.
 * */

class Test4
{
	void show() throws RuntimeException					// parent exception(unchecked)
	{
		System.out.println("1");
	}
}
class ExceptionRule extends Test4
{

	void show() throws StringIndexOutOfBoundsException  // child exception(unchecked)
	{
		System.out.println("2");
	}
	
	
	public static void main(String[] args) 
	{
//		Test4 t = new Test4();
//		t.show();
		
		ExceptionRule er = new ExceptionRule();
		er.show();

	}

}
