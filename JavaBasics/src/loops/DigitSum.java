package loops;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		int a, sum = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a = sc.nextInt();
		while (a > 0) {
			rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
		System.out.println("The Digit sum is " + sum);
	}

}
