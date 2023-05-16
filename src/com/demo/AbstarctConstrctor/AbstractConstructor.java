package com.demo.AbstarctConstrctor;

abstract class Content
{
	int a;
	public Content(int a)
	{
		this.a = a;										// refer current object
	}
	abstract int multiply(int val);
}

class GFG extends Content
{
	GFG()
	{
		super(2);										// pass parent class object		
	}
	public int multiply(int val)
	{
		return this.a*val;
	}

}
public class AbstractConstructor 
{

	public static void main(String[] args) 
	{
		Content c = new GFG();
		System.out.println(c.multiply(3));
	}

}
