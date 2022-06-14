import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		float a, b;
		System.out.println("COnversion of Farenhieght to Celcius");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the temperature value to covert into celcius");
			a = sc.nextFloat();
		}
		b = (5 * (a - 32)) / 9;
		System.out.println("The temperature in Celcius is " + b);

	}

}
