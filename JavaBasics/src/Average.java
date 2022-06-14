import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first value");
			a = sc.nextInt();
			System.out.println("Enter the second value");
			b = sc.nextInt();
			System.out.println("Enter the third value");
			c = sc.nextInt();
			System.out.println("Enter the fourth value");
			d = sc.nextInt();
			System.out.println("Enter the fifth value");
			e = sc.nextInt();
		}
		f = (a + b + c + d + e) / 5;
		System.out.println("The Average of the numbers is " + f);
	}

}
