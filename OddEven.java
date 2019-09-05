/*reads an integer and determine if its odd or even
ask user for integer
collect and save number
check if integer divided by 2 has remainder
print it as odd
check if integer divided by 2 is without remainder
print it as even
*/

import java.util.Scanner;
    public class OddEven{
	public static void main(String args[]){
	Scanner value = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = value.nextInt();
	if((number % 2) == 0){
		System.out.printf("%d is an even number", number);
	}
	if((number % 2) != 0){
		System.out.printf("%d is an odd number", number);
	}


        }
}