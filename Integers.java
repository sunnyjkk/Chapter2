import java.util.Scanner;
	public class Integers{
		public static void main(String... args){
			Scanner input = new Scanner(System.in);
			System.out.println("To check which FIVE Integers is smallest or bigest");
			System.out.print("Enter first number:");
			int num1 = input.nextInt();
			System.out.print("Enter second number:");
			int num2 = input.nextInt();
			System.out.print("Enter third number:");
			int num3 = input.nextInt();
			System.out.print("Enter fourth number:");
			int num4 = input.nextInt();
			System.out.print("Enter fifth number:");
			int num5 = input.nextInt();
			Scanner higher = new Scanner(System.in);
			if(num1 > num2){
				System.out.print("first number is the largest");
			} else if(num1 > num3){
				System.out.print("first number is not the largest but more than num3");
			} else if(num1 > num4){
				System.out.print("first number is not the largest but more than num4");
			} else if(num1 > num5){
				System.out.print("first number is not the largest but more than num5");
			}
		}
}