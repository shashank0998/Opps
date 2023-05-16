package com.demo.Interface;

public class Test3 implements Test1,Test2
{
	/*public void m1()
	{
		
	}*/
	public static void main(String[] args)throws Exception 
	{
		//System.out.println(a);										ambiguous problem
		
		
		
		
//		System.out.println(Test1.a);
//		System.out.println(Test2.a);
//				
//		
		Test3 t = new Test3();
		t.m1();
	}
	
	@Override
	public void m1()
	{
		System.out.println("test");
	}
}
