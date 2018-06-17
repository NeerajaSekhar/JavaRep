
public class NewBox {

	public static void main(String[] args) {
					
		/* 
		 * creating an object of class Box - i.e., instantiating the class 
		 * NewBox is the name of the object we create- its a variable
		 * new is the keyword in java to create an object 
		 */
		Box NewBox = new Box();
		
		//the object/instance 'NewBox' is accessing the variables of 'Box'
		NewBox.length=25;
		NewBox.breadth=20; 
		NewBox.height=10;
		
		//'NewBox' is accessing the method from 'Box' and assigning it to another variable
		double x = NewBox.getWidth(), y = NewBox.getLength(), z = NewBox.getHeight(); 
				
		System.out.println("Breadth of the box = "+x);
		System.out.println("Length of the box = "+y);
		System.out.println("Height of the box = "+z);
		
		//creating another object 'b1'
		Box b1 = new Box();
		
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
