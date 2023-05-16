package com.demo.clonning;

public class ShallowCopy 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// creating original copy object
		
		Company cmp = new Company("Google", "pune");
		Employee emp = new Employee("banda", 29, cmp);
		
		System.out.println("--"+emp.name+" "+"--"+emp.age+" "+"--"+cmp.companyName+" "+"--"+cmp.location);

		// creating shallow copy of original object
		
		Employee emp1 = (Employee) emp.clone();
		
		// changing the reference the company name field in referenced filed of clone object
		
		emp1.company.companyName = "Amazon";
		
		System.out.println("After changing company name of copy object");
		System.out.println("Original object");
		System.out.println(emp.name+" "+emp.age+" "+cmp.companyName+" "+cmp.location);
		
		System.out.println("Clone object (shallow copy)");
		System.out.println(emp1.name+" "+emp1.age+" "+cmp.companyName+" "+cmp.location);
		
		
	}

}
