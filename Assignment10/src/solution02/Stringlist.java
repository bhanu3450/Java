package solution02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stringlist {
     public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		class Compare implements Comparator<String>{

			@Override
			public int compare(String s1, String s2) {
				int diff = s1.length() - s2.length();
				return 0;
			}
			
		}
		list.add("Bhanu Pratap");
		list.add("Kanu");
		list.add("sanu");
		list.add("shailu");
		list.add("shikhar");
//		String longest = Collections.max(list, (s1, s2) -> s1.length() - s2.length());
//		System.out.println(longest);
        Compare compare = new Compare();
        String ele = Collections.max(list, compare);
        System.out.println(ele);
	}
}
