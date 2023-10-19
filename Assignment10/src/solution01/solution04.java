package solution01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class solution04 {
	
	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>();
		Collection<String> c = new HashSet<>();
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
