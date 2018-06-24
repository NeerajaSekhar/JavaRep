public class C extends B    //class C is subclass of class B
{		
     public static void main(String[] args) 
	{
	B objC = new B();
	
	System.out.println("//Calling 'methodB' from Class 'B' to class 'C' : "
				+ "objC.methodB() >> ");
	System.out.println(" ");
	objC.methodB();
	System.out.println("!!End of Code!!");	
	}

}