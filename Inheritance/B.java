public class B extends A
{	
/*
 * class B is inheriting the properties of class A.
 * B is the subclass of A.
 */	

	A objB = new A();
	int c = objB.add();
	
	void methodB() 
	{
	System.out.println("This statement is from class 'B'."
			+ " Class 'B' is inheriting Class 'A'.");
	System.out.println(a+" + "+b+" = "+	c);
	System.out.println("//methodB ends.");
	System.out.println(" ");
	}
	
}