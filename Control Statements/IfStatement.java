//trying out 'if' statements and user input

import java.util.Scanner;

public class IfStatement{
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your Roll number : ");
		int rollNumber = input.nextInt();

		if(rollNumber<10)
	    		{
    			System.out.println("Proceed to Class number 6.");
 	   		}
	    	else if(rollNumber<20)
    			{
    			System.out.println("Proceed to Class number 4.");
	    		}
	    	else if(rollNumber<30)
	    		{
    			System.out.println("Proceed to Class number 5.");
	    		}
    		else
	    		{
    			System.out.println("INCORRECT ROLL NUMBER!! Please enter the correct roll number!");
	    		}
	}
}