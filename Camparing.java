import java.util.Scanner;
	public class Camparing{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int largest = 0;
		
		System.out.print("Enter the first integer:");
		int firstInteger = input.nextInt();

		System.out.print("Enter the Second integer:");
		int secondInteger = input.nextInt();
		
		System.out.print("Enter the Third integer:");
		int thirdInteger = input.nextInt();
		
		if(firstInteger > secondInteger){
		largest = firstInteger;
		}

		if(secondInteger > firstInteger){
		largest = secondInteger;
		}

		if(largest > thirdInteger){
		largest = largest;
		}
		if(thirdInteger > largest){
		largest = thirdInteger;
		}
		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The largest number is: %d%n", largest);

	}		
}