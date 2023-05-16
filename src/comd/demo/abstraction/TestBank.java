package comd.demo.abstraction;

public class TestBank 
{
	public static void main(String[] args) 
	{
		
		Bank b = new Sbi();
		System.out.println("Rate of interest is "+b.getRateOfInterest()+"%");
		
		b = new PNB();
		System.out.println("Rate of interest is "+b.getRateOfInterest()+"%");
		
	}
}

class Sbi extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class PNB extends Bank
{
	int getRateOfinterest()
	{
		return 8;
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}

}
