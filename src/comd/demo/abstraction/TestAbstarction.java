/*
 * 
 * 	
 * 
 * */

package comd.demo.abstraction;

public class TestAbstarction {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Shape s = new Rectangle();
		s.draw();
		
		Shape s1 = new Circle();
		s1.draw();

	}

}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drwaing circle");
	}
}