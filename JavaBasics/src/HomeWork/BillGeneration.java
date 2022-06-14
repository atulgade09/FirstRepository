package HomeWork;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		float d;
		System.out.println("Enter the Quantity of the pizza :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the number of puffs :");
		b = sc.nextInt();
		System.out.println("Enter the number of cold drinks :");
		c = sc.nextInt();
		d = (100 * a) + (20 * b) + (c * 10);
		System.out.println("Number of Pizza's :" + a);
		System.out.println("Number of puffs :" + b);
		System.out.println("Number of cold drinks :" + c);
		System.out.println("The total bill is :" + d);
		System.out.println("ENJOY THE SHOW !!!");

	}

}
