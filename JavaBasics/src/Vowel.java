import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an Aphabet");
		try (Scanner sc = new Scanner(System.in)) {
			char ch = sc.next().charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'O' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				System.out.println("The Entered alphabet is a vowel");
			else
				System.out.println("The Entered alphabet is a consonant");
		}
	}

}
