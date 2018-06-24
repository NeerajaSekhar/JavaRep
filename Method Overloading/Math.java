class Math
{

int add(int x, int y, int z)
    {
	System.out.println("Method 1");
	int sum = x+y+z;
	System.out.println("Sum of three numbers("+x+","+y+","+z+") is :");
	return(sum);
    }

int add(int x, int y)
    {
	System.out.println("__________________________________________________________________");
	System.out.println("Method 2");
	int sum = x+y;
	System.out.println("Sum of two numbers("+x+","+y+") is :");
	return(sum);
    }

double add(double x, double y, double z)
    {
	System.out.println("__________________________________________________________________");
	System.out.println("Method 3");
	double sum = x+y+z;
	System.out.println("Sum of three floating point numbers("+x+","+y+","+z+") is :");
	return(sum);
    }

}
