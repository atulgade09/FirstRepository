import java.util.Scanner;

public class DaysIntoYearsWeeks {
	public static void main(String[] args) {
		int days;
		float year;
		float month;
		float week;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the days you want to convert into year and weeks ");
			days = sc.nextInt();
		}
		year = days / 365;
		month = days / 30;
		week = days / 7;
		System.out.println("Years = " + year);
		System.out.println("months = " + month);
		System.out.println("weeks = " + week);
	}
}
