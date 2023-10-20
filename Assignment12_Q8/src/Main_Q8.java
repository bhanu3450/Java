import java.util.stream.IntStream;

public class Main_Q8 {

	public static void main(String[] args) {
	//   Stream<Integer> Wrapper type->stream, IntStream-> primitive type stream
		IntStream strm1 = IntStream.range(1, 10);  //1,2,3,4,5,6,7,8,9
		int total = strm1.sum();
		System.out.println("total is " + total);
		
		IntStream strm2 = IntStream.range(1, 10);
		System.out.println(strm2.summaryStatistics());
	}
	
}
