package com.demo.clonning;

public class Company
{
	String companyName;
	String location;
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + "]";
	}

	public Company(String companyName, String location)
	{
		super();
		this.companyName = companyName;
		this.location = location;
	}
}
