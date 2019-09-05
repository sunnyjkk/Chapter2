import java.util.Scanner;
   public class MoreArithmetic2{
     public static void main(String args []){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();
	System.out.print("Enter third number: ");
	int num3 = input.nextInt();
	int sum = num1 + num2 + num3;
	int avg = sum / 3;
	int product = num1 * num2 * num3;
	System.out.printf("%d is the sum %d is the average %d is the product", sum, avg, product);
	}
}