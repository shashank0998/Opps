package com.demo.Interface;

interface I1 
{
	//public static final int a = 19;				// also variable are declared 
	
	public abstract void show();
	
	

	// default abstract void display();			// illegal combination of modifier: abstract and default
	
//	void display()								//	interface abstract method cannot have body
//	{
//		
//	}
	
	/*static,default void display()				// we can create default and static method in interface that program is compile 
	{											// java 8 new feature add to default access modifier add
												// java 9 also provide private access modifier
		
	}*/
}

// create another interface to check multiple inheritance achieve
interface I2
{
	public abstract void display();
}
