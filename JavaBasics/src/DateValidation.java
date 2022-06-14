import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a date");
			System.out.println("Enter the Day");
			a = sc.nextInt();
			System.out.println("Enter the Month");
			b = sc.nextInt();
			System.out.println("Enter the Year");
			c = sc.nextInt();
		}
		if (a <= 30 && b == 4 || b == 6 || b == 9 || b == 11)
			System.out.println("The date is valid");
		else if (a <= 31 && b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)
			System.out.println("The date " + a + "/" + b + "/" + c + " is valid");
		else if (a <= 28 && b == 2)
			System.out.println("The date " + a + "/" + b + "/" + c + " is valid");
		else if (a <= 29 && b == 2 && c % 4 == 0)
			System.out.println("The date " + a + "/" + b + "/" + c + " is valid");
		else
			System.out.println("The date " + a + "/" + b + "/" + c + " is invalid");
	}

}
