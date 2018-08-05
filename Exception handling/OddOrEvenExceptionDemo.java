import java.util.Scanner;

public class OddOrEvenExceptionDemo {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		try {
			System.out.println("ODD OR EVEN ? \n\nEnter a number: ");
			int num = number.nextInt();
			if(num%2==0)
				System.out.println("'"+num + "' is an Even Number.");
			else
				System.out.println("'"+num + "' is an Odd Number.");
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Not acceptable!! Enter an integer!!");
		}
		finally {
			System.out.println("\nEnd of code.");
		
		}

	}

}