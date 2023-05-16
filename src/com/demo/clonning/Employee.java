package com.demo.clonning;

public class Employee implements Cloneable
{
	String name;
	int age;
	Company company;
	
	public Employee(String name, int age, Company company)
	{
		super();
		this.name = name;
		this.age = age;
		this.company = company;
	}
	
	//default clone() method
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", company=" + company + "]";
	}
}
