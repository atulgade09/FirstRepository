import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			a = sc.nextDouble();
			System.out.println("Enter second number");
			b = sc.nextDouble();
			System.out.println(" 1. Addition 2. Substraction 3. Multiplication 4. Division");
			c = a + b;
			d = a - b;
			e = a * b;
			f = a / b;
			int i;
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("The Addition of two numbers is =" + c);
				break;
			case 2:
				System.out.println("The Substraction of two numbers is =" + d);
				break;
			case 3:
				System.out.println("The Multiplication of two numbers is =" + e);
				break;
			case 4:
				System.out.println("The Division of two numbers is =" + f);
				break;
			default:
				System.out.println("Error");
			}
		}
	}
}
