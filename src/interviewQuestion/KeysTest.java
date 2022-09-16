package interviewQuestion;

import java.util.Scanner;

public class KeysTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please press any key");

		char key = sc.next().charAt(0);

		if ((key >= 'a' && key <= 'z') || (key >= 'A' && key <= 'Z')) {
			System.out.println("Entered key is a Alphabet");
		} else if ((key >='0' && key <= '9')) {
			System.out.println("Entered key is a Numeric");
		} else {
			System.out.println("Entered key is a special character");
		}
		
		sc.close();

	}

}
