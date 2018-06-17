
public class Box {
	
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
