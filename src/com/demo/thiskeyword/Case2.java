package com.demo.thiskeyword;
/***
 * 
 * case 2 ---> this keyword can be used to invoke current class method(implicitly)
 * 
 * 
 * */

public class Case2
{
	void display()
	{
		System.out.println("hello");
	}
	
	void show()
	{
		display();
	}

	public static void main(String[] args) 
	{
		Case2 c = new Case2();
		//c.display();
		c.show();
	}
}
