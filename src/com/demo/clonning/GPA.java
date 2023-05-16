package com.demo.clonning;

public class GPA implements Cloneable
{
	int firstYear;
	int secondYear;
	
	public GPA(int firstYear, int secondyear)
	{
		this.firstYear = firstYear;
		this.secondYear = secondyear;
	}

	public int getFirstYear() {
		return firstYear;
	}

	public void setFirstYear(int firstYear) {
		this.firstYear = firstYear;
	}

	public int getSecondYear() {
		return secondYear;
	}

	public void setSecondYear(int secondYear) {
		this.secondYear = secondYear;
	}
	

	@Override
	public String toString() {
		return "GPA [firstYear=" + firstYear + ", secondYear=" + secondYear + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
	
		return super.clone();
	}
	
	
	
}
