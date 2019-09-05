import java.util.Scaner;
   public class Math{
	public static void main(String args []){
		Scanner input = new Scanner(System.in);
		System.out.println("To get  the modulus of two numbers");
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		System.out.printf("The modulus is %d", (num1 % num2));

	}

}
