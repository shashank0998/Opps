package comd.demo.abstraction;

public class Scooter 
{	
	void start()							// method override
	{
		System.out.println("scooter start with kick");
	}
	
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
		
//		Vehicle v = new Vehicle();			// here we try to create abstract class object but does't create abstract class object
//		v.start();

	}

}
