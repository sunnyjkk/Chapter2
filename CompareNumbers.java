/*to compare two integers*/

import java.util.Scanner;
   public class CompareNumbers{
      public static void main(String args[]){	
	Scanner value = new Scanner(System.in);
	System.out.print("Please enter first number: ");
	int num1 = value.nextInt();
	System.out.print("Please enter second number: ");
	int num2 = value.nextInt();
	if(num1 > num2){
	 System.out.printf("%d is larger", num1);
	}
	if(num2 > num1){
	 System.out.printf("%d is larger", num2);
	}
	if(num1 == num2){
	 System.out.print("These numbers are equal");
	}
      }
}