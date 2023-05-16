package com.demo.AbstarctConstrctor;

public class EmployeeInfo extends Employee
{
	String address;
	
	public EmployeeInfo(int id, String name, String address)
	{
		super(id,name);
		this.address = address;
	}
}
