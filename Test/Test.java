//getting familiar with data types, variables, conversion and casting 

public class Test{

	public static void main(String[] args) {
		//variable name rules-
		int num;
		int _number;
		int $num;
		int num123;
		int numOfCars;
		// wrong name - int 12per;
		
		//data types

		byte b = 8;
		short sh = 11;
		int a = 10;
		long l = 18273647888890009L;
		float  f = 20.3f;
		double c = 3.154637;
		float h = Float.MAX_VALUE;
		String s = "\\Neeraja Sekhar\\";
		String s1= "\'Neeraja Sekhar\'";
		
		System.out.println(b);
		System.out.println(sh);		
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(c);
		System.out.println(s);
		System.out.println(s1);

	//datatype conversion

		int xo = 10;
		System.out.println(xo);
		long lo = xo;
		System.out.println(lo);
				
	//datatype casting

		byte by=(byte)140;  //byte cannot hold values higher than 127. hence (byte) keyword is used
		System.out.println(by);

		char ch = 'A';
		int bh = (int) ch;
		System.out.println(bh);
		ch = (char) (bh+2);
		System.out.println(ch);
		char dh = (char) ((int) ch + 1);
		System.out.println(dh);
		
	}

}
