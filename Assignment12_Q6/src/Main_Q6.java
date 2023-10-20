import java.util.Scanner;
import java.util.stream.Stream;

public class Main_Q6 {

	public static void main(String[] args) {
		System.out.print("Enter a number to calculate its factorial: ");
		int num = new Scanner(System.in).nextInt();
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1).limit(num);
		int result = strm.reduce(1, (a, e) -> a * e);
		System.out.println("factorial is: " + result);
	}

}
