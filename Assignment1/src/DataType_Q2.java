import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class DataType_Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
//		String type1 = ((Object)num1).getClass().getSimpleName();
//		String type2 = ((Object)num2).getClass().getSimpleName();
		System.out.println("Enter two numbers");
		System.out.println("Enter First double");
//		if (!sc.hasNextInt() || !sc.hasNext()) {
		if( sc.hasNextDouble() && !sc.hasNextInt()) {
			
			num1 = sc.nextDouble();

			System.out.println("enter 2nd no.");
			if (sc.hasNextDouble() && !sc.hasNextInt()) {
				num2 = sc.nextDouble();

				double avg = (num1 + num2) / 2;
				System.out.println("average = " + avg);
			}
			else {
				System.out.println("Error");
		
			}

		}

		else {
			System.out.println("Error: The input is not a double value.");
		}

//		System.out.println("double value1 = " + num1 + "double value1 = " + num2);
//		}else
//		System.out.println("Error: The First input is not a double value.");

	}

}
