import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen?
//Books are stored in which order?

public class Hashset {

	public static void main(String[] args) {

		Set<Book> set = new LinkedHashSet<>();
		set.add(new Book("io", 4500, "Bhanu", 4));
		set.add(new Book("tr", 749, "Shikhar", 1));
		set.add(new Book("io", 128, "Abhay", 8));
		set.add(new Book("io", 485, "Kritagya", 2));
		set.add(new Book("yu", 165, "Gaurav", 3));
		set.add(new Book("dt", 4500, "Bhanu", 4));
		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}

	}
}

//Answers:
//1. If there is no equals and hashcode method exists then duplicate values are added.
//2. If the Equals and hashcode method are created on basis of isbn then if you add a new Book with same isbn it will not be addded in the set.
//3. Books are stored in the order of insertion