package q1_solution;

import java.util.Scanner;

public class ProgramToReadString {

	 static void createString() throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		if (s1.length() > 80) {
			throw new ExceptionLineTooLong("String length exceeded 80", 1);
		}
	}

}
