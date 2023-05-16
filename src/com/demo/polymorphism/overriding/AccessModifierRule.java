package com.demo.polymorphism.overriding;

class Test3
{
//	public void show()
//	{
//		System.out.println("public access modifier");
//	}
	
//	protected void show()
//	{
//		System.out.println("protected access modifier");
//	}
	
//	void show()
//	{
//		System.out.println("default access modifier");
//	}
	
	private void show()
	{
		System.out.println("private access modifier");
	}
}

class AccessModifierRule extends Test3
{
//	public void show()
//	{
//		System.out.println("public .access modifier");
//	}

//	protected void show()
//	{
//		System.out.println("protected access modifier");
//	}
	
//	void show()
//	{
//		System.out.println("default access modifier");
//	}
	
	private void show()
	{
		System.out.println("private access modifier");
	}

	
	public static void main(String[] args) 
	{
		
		AccessModifierRule am = new AccessModifierRule();
		am.show();
		
//		Test3 t = new Test3();
//		t.show();
		
	}
}
