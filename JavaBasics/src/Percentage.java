import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		float n1, n2, n3, n4, n5, grand_total, total = 500f, percentage;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter n1= ");
			n1 = sc.nextFloat();
			System.out.println("Enter n2= ");
			n2 = sc.nextFloat();
			System.out.println("Enter n3= ");
			n3 = sc.nextFloat();
			System.out.println("Enter n4= ");
			n4 = sc.nextFloat();
			System.out.println("Enter n5= ");
			n5 = sc.nextFloat();
		}
		grand_total = n1 + n2 + n3 + n4 + n5;
		System.out.println("The Grand Total is = " + grand_total);
		percentage = ((n1 + n2 + n3 + n4 + n5) * 100) / total;

		System.out.println("The Percentage is = " + percentage);
		if (percentage <= 100 && percentage >= 70)
			System.out.println("Candidate is Passed with A+ Grade");
		else if (percentage <= 60)
			System.out.println("Candidate is Passed with B+ Grade");
		else if (percentage <= 40)
			System.out.println("Candidate is failed");
	}

}
