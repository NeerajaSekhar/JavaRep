class Operations
{
double x;
double y; // x and y are the instance variables

	double add(double x, double y)
	{
	return x+y;
	}

	double subtract(double x,double y)
	{
	return x-y;
	}

	double multiply(double x,double y)
	{
	return x*y;
	}

	double devide(double x,double y)
	{
	return x/y;
	}

	/*
	* these methods are taking parameters
	* they have to return a value of data type double
	*
	*/
}

public class ArithOperations
{
	public static void main(String[] args)
	  {

	  Operations op1 = new Operations(); //an object is created
	  System.out.println("First number is 10 and second number is 5.");
	  
	   double a = op1.add(10,5);
	   System.out.println("Addition : "+a);

	   double b = op1.subtract(10,5);
	   System.out.println("Subtraction : "+b);

	   double c = op1.multiply(10,5);
	   System.out.println("Multiplication : "+c);

	   double d = op1.devide(10,5);
	   System.out.println("Division : "+d);
	/*
	* the methods are called using the '.' operator
	* and arguments are passed
	*
	*/	
	  }
}




