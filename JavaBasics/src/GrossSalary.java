import java.util.Scanner;

public class GrossSalary {
	public static void main(String[] args) {
		float a, b = 0, c = 0, d = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Salary amount");
			a = sc.nextFloat();
		}
		if (a <= 10000) {
			b = (a * 20) / 100;
			c = (a * 80) / 100;
			System.out.println("The HRA is " + b);
			System.out.println("The DA is " + c);
		} else if (a <= 20000) {
			b = (a * 25) / 100;
			c = (a * 90) / 100;
			System.out.println("The HRA is " + b);
			System.out.println("The DA is " + c);
		} else if (a > 20000) {
			b = (a * 30) / 100;
			c = (a * 95) / 100;
			System.out.println("The HRA is " + b);
			System.out.println("The DA is " + c);
		} else
			System.out.println("Wrong value");
		d = a + b + c;
		System.out.println("The Gross Salary Value is " + d);

	}

}