package com.demo.thiskeyword;

class Test7
{
	int i;
	void setValue(int i)
	{
		this.i = i;								// this.i refer to instance variable ------ i refer to local variable int i
	}
	void show()
	{
		System.out.println(i);
	}
}
public class ThisKeyword
{
	public static void main(String[] args) 
	{
		Test7 t = new Test7();
		t.setValue(10);
		t.show();

	}

}
