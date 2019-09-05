/*Calculates diameter, circumference and area
import class java.math.lang though you dont need to create a method for it to be active
ask user for radius
calculate diameter as 2*r
calculate circumference as 2*pi*r
calculate area as pi*r^2
print the result for diameter, circumference and area*/

import java.util.Scanner;
import java.lang.Math.*;
   public class Circles{
      public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("enter radius of the circle:");
	int r = input.nextInt();// where r is radius
	/*int diameter = r * 2;
	int circum = 2 * 3 * r;
	int area = 3 * (r*r);
	System.out.printf("The diameter is %d%nThe circumference is %d%nThe Area is %d%n", diameter, circum, area);*/
	System.out.printf("The diameter is %d%nThe circumference is %f%nThe Area is %f%n", (r * 2), (2 * Math.PI * r), (Math.PI * (r*r)));
      }

}