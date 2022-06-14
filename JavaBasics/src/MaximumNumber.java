import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter any three numbers ");
		try (Scanner sc = new Scanner(System.in)) {
			{
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
			}
		}
		if (a > b && a > c)
			System.out.println("The Maximum number is = " + a);
		else {
			if (b > a && b > c)
				System.out.println("The Maximum number is = " + b);
			else
				System.out.println("The Maximum number is = " + c);
		}

	}
}
