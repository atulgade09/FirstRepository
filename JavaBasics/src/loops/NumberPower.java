package loops;

import java.util.Scanner;

public class NumberPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		a = sc.nextInt();
		System.out.println("Enter the power");
		b = sc.nextInt();
		for(int i=1;i<=b;i++)
			c=c*a;
		
System.out.println("The power of the number is :"+c);
	}

}
