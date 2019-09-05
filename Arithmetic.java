/*A program that performs addition, subtraction, division and multiplication of two numbers*/

import java.util.Scanner;
   public class Arithmetic{
      public static void main(String args []){
	Scanner value = new Scanner(System.in);
	System.out.print("please enter first interger: ");
	int num1 = value.nextInt();
	System.out.print("please enter second integer: ");
	int num2 = value.nextInt();
	int sum = num1 + num2;
	int product = num1 * num2;
	int diff = num1 - num2;
	int quotient = num1 / num2;
	System.out.printf("The sum is %d\nThe product is %d\nThe difference is %d\nThe quotient is %d\n", sum, product, diff, quotient);
	/*System.out.printf("The sum is %d\n", sum);
	System.out.printf("The product is %d\n", product);
	System.out.printf("The difference is %d\n", diff);
	System.out.printf("The quotient is %d\n", quotient);*/
      }
}