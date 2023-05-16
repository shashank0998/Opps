package com.demo.Interface;

public class TestInterface1 {

	public static void main(String[] args) 
	{
		Bank b = new SBI();
		System.out.println("ROI..:"+b.rateOfInterest());
		
		Bank b1 = new PNB();
		System.out.println("ROI--->"+b.rateOfInterest());

	}

}
