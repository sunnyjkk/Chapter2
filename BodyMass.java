/*ask for user name
collect user name
save user name
ask for weight(pounds)
collect weight
save weight
ask for height(inches)
collect height
save height
actual weight is weight multiplied by 703
actual height is height multiplied by height
calculate the BMI to be equal to the quotient of actual weight by actual height
save BMI
print user name and BMI
*/

import java.util.Scanner;
   public class BodyMass{
	public static void main(String... args){
		Scanner value = new Scanner(System.in);
		/*System.out.println("Please enter your name");
		String name = value.nextInt();*/
		System.out.println("Hey there\t you are welcome!");
		System.out.print("Please input your weight in pounds: ");
		int weight = value.nextInt();
		System.out.print("Please input your height in inches: ");
		int height = value.nextInt();
		int actualWeight = weight * 730;
		int actualHeight = height * height;
		int bmi = actualWeight / actualHeight;
		System.out.printf("Dear your Body Mass Index is %d\n", bmi);
		System.out.println("Thank you for checking in with us\t see you soon\t bye!");
	}
}