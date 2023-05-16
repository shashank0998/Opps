/*
 * 	Abstarct Class that has an Abstract Method	
 * 
 * */


package comd.demo.abstraction;

public class AbstractionDemo extends Bike {

	public static void main(String[] args) 
	{
		Bike obj = new AbstractionDemo();
		obj.run();

	}

	@Override
	void run() 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("running safety");
	}

}

abstract class Bike
{
	abstract void run();
}
