import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_LinkedHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declare map: key=isbn, value=Student object
		Map<Integer, Student> map = new LinkedHashMap<>();
	 	
		// case 1: insert in map
		Student s = new Student(1, "Bhanu", 700);
		map.put(s.getRoll(), s);
		
		s = new Student(2, "Abhay", 200);
		map.put(s.getRoll(), s);
		
		s = new Student(3, "Shikhar", 410);
		map.put(s.getRoll(), s);
		
		s = new Student(4, "Kritagya", 800);
		map.put(s.getRoll(), s);
		
		// case 2: find in map
		System.out.print("Enter the roll of the book you want to search for student : ");
		int rollno = sc.nextInt();
		Student s1 = map.get(rollno);
		System.out.println("The student with roll no " + rollno + " is :");
		System.out.println(s1);
		sc.close();
		
		/*
		We do not need to write hashCode() and equals() because for Integer(wrapper class) these functions are 
		already provided in the wrapper classes but for user defined classes we need to write these methods.
		*/
	}

}
