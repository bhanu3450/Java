import java.util.Scanner;

public class NumberConversion_Q1 {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		String resultBinary = Integer.toBinaryString(num);
		String resultOctal = Integer.toOctalString(num);
		String resultHex = Integer.toHexString(num);
		System.out.println("Integer = " + num + " to Binary = " + resultBinary);
		System.out.println("Integer = " + num + " to Octal = " + resultOctal);
		System.out.println("Integer = " + num + " to HexaDecimal = " + resultHex);

	}

}
