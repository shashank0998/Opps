package com.demo.polymorphism.overriding;

class Test1
{
	Number show()
	{
		System.out.println("1");
		return null;
	}
}
class CovariantReturnType extends Test1
{
	Integer show()
	{
		System.out.println("2");
		return null;
	}

	public static void main(String[] args) 
	{
		
		Test1 t = new Test1();
		t.show();

	}

}
