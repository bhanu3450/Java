import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//4. Use TreeSet to store all books in descending order of price. Natural ordering for the Book 
//should be isbn (do not change it). Display them using iterator() and descendingIterator().

public class Treeset {

	public static void main(String[] args) {

		TreeSet<Book> set = new TreeSet<>();
		set.add(new Book("b1", 4500, "Bhanu", 4));
		set.add(new Book("b2", 749, "Shikhar", 1));
		set.add(new Book("b2", 128, "Abhay", 8));
		set.add(new Book("b3", 485, "Kritagya", 2));
		set.add(new Book("b4", 165, "Gaurav", 3));
		set.add(new Book("b1", 4500, "Bhanu", 4));
		
		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		
		Iterator<Book> itr1 = set.descendingIterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		

	}
}

//Answers: