package com.demo.Encapsulation;
/*
 * encapsulation ----> the process of hiding data and corresponding method into a single unit is known as encapsulation
 * 				
 * how to achieve encapsulation
 * 1) make field is private
 * 2) use in getter and setter method to modify variables  
 * 
 * data hiding ----> outside person can't access the internal data direct or
 * 					 internal data should not go out directly this oops feature nothing but Data Hiding. 
 * */

public class Employee
{
	private int empid;					// make field is private is called data hiding
	private String empName;
	
	public int getEmpid()				// getter method to get the value 
	{				
		return empid;
	}

	public void setEmpid(int eid)	    // setter method to set the value of current object 
	{
		this.empid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
class Company 
{
	
		public static void main(String[] args) 
		{
			Employee e = new Employee();
			e.setEmpid(101);
			e.setEmpName("Shashank");
			System.out.println(e.getEmpid());
			System.out.println(e.getEmpName());
					
		}

}
