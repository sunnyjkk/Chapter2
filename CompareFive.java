import java.util.Scanner;
   public class CompareFive{
     public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();
	System.out.print("Enter third number: ");
	int num3 = input.nextInt();
	System.out.print("Enter fourth number: ");
	int num4 = input.nextInt();
	System.out.print("Enter fifth number: ");
	int num5 = input.nextInt();
	int biggest = 0;
	if(num1 > num2){
		biggest = num1;
	}
	if(num2 > num1){
		biggest = num2;
	}
	if(biggest > num3){
		biggest = biggest;
	}
	if(num3 > biggest){
		biggest = num3;
	}
	if(biggest > num4){
		biggest = biggest;
	}
	if(num4 > biggest){
		biggest = num4;
	}
	if(biggest > num5){
		biggest = biggest;
	}
	if(num5 > biggest){
		biggest = num5;
	}
	System.out.printf("Largest number is %d%n", biggest);
	int smallest = 0;
	if(num1 < num2){
		smallest = num1; 
	}
	if(num2 < num1){
		smallest = num2;
	}
	if(smallest < num3){
		smallest = smallest;
	}
	if(num3 < smallest){
		smallest = num3;
	}
	if(smallest < num4){
		smallest = smallest;
	}
	if(num4 < smallest){
		smallest = num4;
	}
	if(smallest < num5){
		smallest = smallest;
	}
	if(num5 < smallest){
		smallest = num5;
	}
	System.out.printf("The least number is %d", smallest);
     }

}