import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("ODD OR EVEN ? \n\nEnter an integer number: ");
		int num = number.nextInt();
		
		if(num%2==0)
			System.out.println("\nEven Number.");
		else
			System.out.println("\nOdd Number.");

	}

}