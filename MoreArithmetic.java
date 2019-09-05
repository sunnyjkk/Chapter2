/**collect three integers and print their sum, average, product, smallest and largest numbers*/
import java.util.Scanner;
   public class MoreArithmetic{
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
		System.out.printf("\n%d is the sum \n%d is the average \n%d is the product \n", sum, avg, product);
	if(num1 > num2 && num1 > num3){
	   	System.out.printf("largest is %d", num1);	
	}
	if(num2>num1 && num2>num3){
			System.out.printf("largest is %d", num2);
	}
	if(num3>num1 && num3>num2){
			System.out.printf("largest is %d", num3);
	}
	if(num1 < num2 && num1 < num3){
	   		System.out.printf("\nsmallest is %d\n", num1);	
	}
	if(num2<num1 && num2<num3){
			System.out.printf("\nsmallest is %d\n", num2);
	}
	if(num3<num1 && num3<num2){
			System.out.printf(" \nsmallest is %d\n", num3);
	}
     }
}