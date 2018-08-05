public class AverageOfNumbers {

	public static void main(String[] args) {
		
		double number[] = {4,2,12,5,10};
		double total = 0;
		
		for(int i =0; i<number.length; i++)
		{
			total = total + number[i];
		}
		
		double average = total / number.length;
		
		System.out.println("Average of numbers = " + average);
		
	}

}
