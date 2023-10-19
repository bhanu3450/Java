import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


//3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book.
//If any book with duplicate isbn is added, what will happen? Books are stored in which order?

public class Treeset {

	public static void main(String[] args) {

		Set<Book> set = new TreeSet<>();
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

	}
}

//Answers:
//Without Using hashCode() the elements cannot be Duplicated Because it requires 
//Comparable interface or Comparator interface functions to compare and without providing them 
//we can not compare and classCast exception error will occur.
//
//Books are Stored in the Sorted Order
//
//Implementing Comparable or Comparator functions TreeSet Removes duplicate values 