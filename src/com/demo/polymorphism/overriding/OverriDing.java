package com.demo.polymorphism.overriding;

class Test
{
	public void show(int a)
	{
		System.out.println("1");
	}
}
class OverriDing extends Test 
{
	public void show(int a)
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(10);
		
		OverriDing o = new OverriDing();
		o.show(20);
		
		Test t1 = new OverriDing();
		t1.show(30);
		
	}

}
