public class Exercise1{
	public static void main(String... args){
		int x = 2;
		int y = 3;
		System.out.printf("x = %d%n", x);// x = 2
		System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));// value of x + x is 4
		System.out.printf("x = \n");// x =
		System.out.printf("%d = %d%n", (x + y), (y + x));// 5 = 5
	}
}