package com.demo.clonning;

public class DeepClonning 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		 GPA g = new GPA(7,8);
		 Student s = new Student("shash",g);
		 System.out.println(g);
		 System.out.println(s);

		 
		 Student copy = (Student)s.clone();
		 
		 System.out.println(copy);
		 
		 System.out.println("Original object--"+s.getGpa().getFirstYear()+" "+s.getGpa().getSecondYear());
		 System.out.println("Cloned Object ---"+copy.getGpa().getFirstYear()+" "+copy.getGpa().getSecondYear());
		 
		 copy.getGpa().setFirstYear(9);
		 
		 System.out.println("\nAfter changing the deep copy");
		 
		 System.out.println(copy);
		 System.out.println(s);
		 
//		 System.out.println("Original object--"+s.getGpa().getFirstYear()+" "+s.getGpa().getSecondYear());
//		 System.out.println("Cloned object---"+copy.getGpa().getSecondYear()+" "+copy.getGpa().getSecondYear());

	}

}
