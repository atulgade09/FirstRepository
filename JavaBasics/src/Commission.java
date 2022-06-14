import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		float c = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a amount");
			a = sc.nextFloat();
		}
		if (a < 10000) {
			c = (a * 2) / 100;
		} else if (a >= 10000 && a < 25000) {
			c = (a * 5) / 100;

		} else if (a >= 25000 && a < 50000) {
			c = (a * 10) / 100;
		} else if (a >= 50000) {
			c = (a * 15) / 100;

		}
		System.out.println("The commission is " + c);
	}
}
