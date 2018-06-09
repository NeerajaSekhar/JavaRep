//take three numbers from user and find the greatest number

import java.util.Scanner;

public class GreatestNumber
  {
    public static void main(String[] args)
      {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int num1 = input.nextInt();  //user enters first number
	System.out.println("Enter second number : ");
	int num2 = input.nextInt();  //user enters second number
	System.out.println("Enter third number : ");
	int num3 = input.nextInt();  //user enters third number
	
	if(num1>num2)
	   {
		if(num1>num3)
		{
		System.out.println("The greatest number is : "+num1);
		}
		else
		{
		System.out.println("The greatest number is : "+num3);
		}
	   }
	else if(num2>num3)
	   {
	   System.out.println("The greatest number is : "+num2);
	   }
	else
	   {
	   System.out.println("The greatest number is : "+num3);
	   }
    }
 }
