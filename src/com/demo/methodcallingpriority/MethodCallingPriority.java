package com.demo.methodcallingpriority;

public class MethodCallingPriority
{

//	static void add(byte a) {System.out.println("***********Primitives*************"); System.out.println("byte result");}
//	
//	static void add(short a) {System.out.println("short result");}
//	
//	static void add(int a) {System.out.println("int result");}
//	
//	static void add(long a) {System.out.println("long result");}
//	
//	static void add(float a) {System.out.println("float result");}
//	
//	static void add(double a) {System.out.println("double result"); System.out.println("***********wrapper class*************");}
//	
//	
//	
//	static void add(Byte a) {System.out.println("Byte result");}
//	
//	static void add(Short a) {System.out.println("Short result");}
	
//	static void add(Integer a) {System.out.println("Integer result");}
//	
//	static void add(Long a) {System.out.println("Long result");}
//	
//	static void add(Float a) {System.out.println("Float result"); System.out.println("***********String*************");}
//	
//	
//	static void add(String a) {System.out.println("String result");}
//	
//	static void add(StringBuffer a) {System.out.println("StringBuffer result"); System.out.println("***********object*************");}
	
	static void add(Number a) {System.out.println("Number result");}
	
	static void add(Object a) {System.out.println("Object result");}
	
	public static void main(String[] args) 
	{
		//int i = 10;
		Integer i = 10;
		//Object i = 10;
//		Number i = 10;
		//String i = "shash";
		add(i);
		
	}

}
