package com.demo.clonning;

public class Student implements Cloneable
{
	private String name;
	private GPA gpa;
	
	public Student(String name, GPA gpa) 
	{
		this.name = name;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public GPA getGpa() {
		return gpa;
	}
	
	public void setGpa(GPA gpa) {
		this.gpa = gpa;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Student s =(Student)super.clone();
		s.setGpa((GPA)s.getGpa().clone());
		return s;
	}

	
	
	
	
}
