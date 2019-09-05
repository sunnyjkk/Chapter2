/* ask user for number
collect and save the number 
divide the entered number e.g num by its digit base line e.g for num = 23451  we have num / 10000,
its value which will be 2
also perform modulus e.g 23451 % 10000 in order to obtain the remaining four digits i.e 3451 save the value as num2
perform modulus on num2 to obtain the last 3 digits i.e num2 % 1000 which yields 451 and save as num3
perform modulus on num3 to obtain the last 2 digits i.e num3 % 100 which yields 51 and save as num4
perform modulus on num4 to obtain the last 3 digits i.e num2 % 100 which yields 1 and save as num5
print formatted num1 as it is, num2 as ( num2/1000), num3 as (num3/100			
/

import java.util.Scanner;
   public class SeparateDigits{
     public static void main(String args[]){
     Scanner value = new Scanner(System.in);
	System.out.print("Enter 5 integers: ");
	int num = value.nextInt();
	int num1 = num / 10000;
	int num2 = num % 10000;
	int num3 = num % 1000;
	int num4 = num % 100;
	int num5 = num % 10;
	System.out.printf("%d   %d   %d   %d   %d", num1, (num2/1000), (num3/100), (num4/10), num5);
	
     }

}