import java.util.Scanner;

//3. Create a functional interface Arithmetic with single abstract method double calc(double,double). 
//Write a static method calculate() in main class as follows. In main(), write a menu driven program 
//that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.

public class MainQues3 {

	interface Arithmetic {
		double calc(double a, double b);
	}

	public static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("result: " + result);
	}

	public static int menu() {
		System.out.println("----------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTILICATION");
		System.out.println("4. DIVISION");
		System.out.println("----------------------------");
		System.out.println("Enter choice");
		int choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;

		while ((choice = menu()) != 0) {
			System.out.print("Enter num1: ");
			double num1 = new Scanner(System.in).nextDouble();
			System.out.print("Enter num2: ");
			double num2 = new Scanner(System.in).nextDouble();

			switch (choice) {

			case 1:
				System.out.println("----------------------------");
				calculate(num1, num2, (a, b) -> a + b);
				break;

			case 2:
				calculate(num1, num2, (a, b) -> a - b);
				break;

			case 3:
				calculate(num1, num2, (a, b) -> a * b);
				break;

			case 4:
				calculate(num1, num2, (a, b) -> a / b);
				break;

			default:
				break;
			}
		}

	}

}
