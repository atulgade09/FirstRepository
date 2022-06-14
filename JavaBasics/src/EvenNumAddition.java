import java.util.Scanner;

public class EvenNumAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, i, b = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			a = sc.nextInt();
		}
		for (i = 1; i <= a; i++) {
			if (i % 2 == 0)

				b = b + i;

		}
		System.out.println("The Addition of the even numbers upto " + a + " is " + b);
	}

}
