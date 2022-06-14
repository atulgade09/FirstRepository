import java.util.Scanner;

public class AreaOfaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r;
		float area;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the radius of the circle ");
			r = sc.nextFloat();
		}
		area = (22 / 7) * r * r;
		System.out.println("The area of the circle is =" + area);

	}

}
