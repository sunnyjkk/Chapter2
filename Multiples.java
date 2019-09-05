/*Application reads two integers determines if the first is a multiple of the second or not
ask user for integer
collect and save first integer
ask user for second integer
collect and save second integer
check if the second interger is divisible by the first without remainder
print the result from the relation
*/

import java.util.Scanner;
   public class Multiples{
	public static void main(String args[]){
	   Scanner insert = new Scanner(System.in);
	   System.out.print("Enter first number: ");
	   int num1 = insert.nextInt();
	   System.out.print("Enter second number: ");
	   int num2 = insert.nextInt();
	if((num2 % num1) == 0){
		System.out.printf("%d is a multiple of %d", num1, num2);
	}
	if((num2 % num1) != 0){
		System.out.printf("%d is not a multiple of %d", num1, num2);
	}
	
     }
}