package com.demo.methodhiding;

class A
{
	static void m1()
	{
		System.out.println("inside method A");
	}
	
	//int x = 10;
}

class B extends A
{
	static void m2()
	{
		System.out.println("inside method B");
	}
	
	//int x = 20;
}

//class C extends A 
//{
//	void m1()
//	{
//		System.out.println("inside method C");
//	}
//}

public class MethodDispacth 
{

	public static void main(String[] args) 
	{
		A a = new B();
		a.m1();
		
//		A a = new A();
//		
//		B b = new B();
//		
//		C c = new C();
//		
//		A ref;
//		ref = a;
//		ref.m1();
//		
//		ref = b;
//		ref.m1();
//		
//		ref = c;
//		c.m1();
	}

}
