import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	float p; //Principle
	float r;//Interest rate
	float t;//Time
	float si;
	System.out.println("Enter the Principle ");
	try (Scanner sc = new Scanner(System.in)) {
		p = sc.nextFloat();
		System.out.println("Enter the Interest Rate ");
		r = sc.nextFloat();
		System.out.println("Enter the Time Period");
		t = sc.nextFloat();
	}
	si=(p*r*t)/100;
	System.out.println("The Simple Interest is = "+si);

	}

}
