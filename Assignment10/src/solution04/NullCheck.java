package solution04;

import java.util.ArrayList;
import java.util.Collection;

public class NullCheck {
	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();// Multiple Nulls are allowed
		// Collection<String> c = new HashSet<>(); //Duplicating Nulls is not allowed
		// Collection<String> c = new LinkedHashSet<>(); //Duplicating Nulls is not
		// allowed
		// Collection<String> c = new TreeSet<>(); //Null value Not allowed
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
