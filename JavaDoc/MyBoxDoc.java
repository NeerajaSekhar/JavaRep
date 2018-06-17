/**
	 * Java Documentation
	 * @author Neeraja Sekhar
	 * @version 1.0.0
	 * @since June 16-2018
	 * 
	 */

class BigBox {
	
	//instance variable declaration - i.e., state of the class Box
	
	double length;
	double breadth;
	double height;
	
	/*
	 * creating instance method - i.e., behavior of the class Box
	 * all these methods return a value
	 */
	public double getWidth()
	{
		return breadth;
		
	}
	public double getLength()
	{
		return length;
		
	}
	public double getHeight()
	{
		return height;
		
	}
	
	public double calculateVolume()
	{
		return length*breadth*height;  //formula l*b*h
	}

}

public class MyBoxDoc {
	
	public static void main(String[] args) {
					
		/* 
		 * creating an object of class Box - i.e., instantiating the class 
		 * NewBox is the name of the object we create- its a variable
		 * new is the keyword in java to create an object 
		 */
		BigBox MyBox = new BigBox();
		
		//the object/instance 'NewBox' is accessing the variables of 'Box'
		MyBox.length=25;
		MyBox.breadth=20; 
		MyBox.height=10;
		
		//'NewBox' is accessing the method from 'Box' and assigning it to another variable
		double x = MyBox.getWidth(), y = MyBox.getLength(), z = MyBox.getHeight(); 
				
		System.out.println("Breadth of the box = "+x);
		System.out.println("Length of the box = "+y);
		System.out.println("Height of the box = "+z);
		
		//creating another object 'b1'
		BigBox b1 = new BigBox();
		
		/* if you write Box b2 = b1; 'b1' and 'b2' will refer to the same memory location
		 * System.out.println(b2);  and this line prints just the memory address they are sharing
		 */
		
		b1.height = 25;
		b1.length = 20;
		b1.breadth = 10;
		
		double vol = b1.calculateVolume(); //calling the method which returns a value after l*b*h formula
		System.out.println("Volume of box = "+vol);
	}

}
