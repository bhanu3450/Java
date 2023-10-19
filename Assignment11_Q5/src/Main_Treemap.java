import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main_Treemap {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Map<String, Book> map = new HashMap();
		Book b = new Book("b1", 4500, "Bhanu", 4);
		map.put(b.getisbn(), b);
		
		
		 b = new Book("b1",100.0,"Shikhar",10);
		map.put(b.getisbn(), b);
		
		b = new Book("b2",120.0,"Prajwal",9);
		map.put(b.getisbn(), b);
		
		b = new Book("b3",140.0,"Abhey",8);
		map.put(b.getisbn(), b);
		
		b = new Book("b4",160.0,"Bhanu",11);
		map.put(b.getisbn(), b);
		

		System.out.print("Enter the Isbn of the book you want to search : ");
		String str = scan.next();
		Book b1 = map.get(str);
		System.out.println("The Book with Isbn " + str + " is " + b1);
		
		scan.close();
		
//		Iterator<Book> itr = map.iterator();
//		while (itr.hasNext()) {
//			Book b = itr.next();
//			System.out.println(b);
	}
}
