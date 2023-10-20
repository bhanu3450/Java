//5. In above assignment, create one more array of Double (constant values) where few 
//elements are repeated.Input a key from user and check how many times key is repeated 
//in the array using appropriate lambda expression.

public class MainQ5 {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T ele : arr) {
			if (c.compare(ele, key)) 
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Double [] arr = {4.4, 7.7, 9.9,9.9, 2.2,5.5, 5.5, 6.6};
		Double key = 5.5;
		
		int cnt = countIf(arr, key, (e,k)-> e.equals(k));		
//		int cnt = countIf(arr,key,(e,k) -> Double.compare(e, k) == 0);
		System.out.println("The element = " + key + " is repeated -- " + cnt + " times");
	}
}
