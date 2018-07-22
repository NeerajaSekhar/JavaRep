class TryStatic
{
	static int staticVariableX;
	int nonStaticVariableY;
	
	void count()
	{
		staticVariableX++;
		nonStaticVariableY++;
	}
}

public class TryStaticDemo
{
	public static void main(String[] args)
	{
		TryStatic t1 = new TryStatic();
		TryStatic t2 = new TryStatic();
		TryStatic t3 = new TryStatic();
		
		t1.count();
		System.out.println("Static variable X = "+t1.staticVariableX+"\n"+"Non Static Variable Y = "+t1.nonStaticVariableY+"\n");
		t2.count();
		System.out.println("Static variable X = "+t1.staticVariableX+"\n"+"Non Static Variable Y = "+t1.nonStaticVariableY+"\n");
		t3.count();
		System.out.println("Static variable X = "+t1.staticVariableX+"\n"+"Non Static Variable Y = "+t1.nonStaticVariableY);
		
	}
}
