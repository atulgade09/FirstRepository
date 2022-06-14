import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		float a, b = 3.14f, c;
	Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the diameter of the circle");
			a = sc.nextFloat();
		
		c = b * a;
		System.out.println("The Perimeter of the circle is " + c);

	}

}
