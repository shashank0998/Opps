package com.demo.methodoverrinding;

import java.io.FileNotFoundException;
import java.io.IOException;

class ParentDemo
{
	public void display() throws IOException
	{
		System.out.println("parent class display method ");
	}
}

class ChildDemo extends ParentDemo
{
	public void display() throws IOException
	{
		System.out.println("child class display method");
	}
}


class ChildNoException extends ParentDemo
{
	public void display()
	{
		System.out.println("child class display method without exceptions");
	}
}

class ChildNarrowerException extends ParentDemo
{
	public void display() throws FileNotFoundException
	{
		System.out.println("child class display method with narrower exceptions");
	}
}


public class MethodOverridingWithCheckedExp 
{

	public static void main(String[] args) 
	{
		ParentDemo parent = new ParentDemo();
		ParentDemo child = new ChildDemo();
		
		ParentDemo childNoException = new ChildNoException();
		ParentDemo childNarrower = new ChildNarrowerException();
		
		try
		{
			parent.display();				//	calls parents display
			child.display();				//	calls child display
			childNoException.display();  	//  calls childNoException
			childNarrower.display();		//	calls childNarrowerException
		}
		catch (IOException e)
		{
			System.out.println("caught exceptions : "+e);
		}
		
	}
	
	
	
/*	
 *     invalid exception
 * 
 * 
	class Parent {
	    public void display() throws IOException {
	        System.out.println("Parent class: Display method");
	    }
	}

	class InvalidChild extends Parent {
	    @Override
	    public void display() throws Exception { // ERROR: Exception is broader than IOException
	        System.out.println("Child class: Invalid display method");
	    }
	}
*/
	
	
	
	
	
	
	
	
	
	
	

}
