package solution03;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Student[] arr = new Student[3];
		arr[0] = new Student(8, "Arslan", "London", 40);
		arr[1] = new Student(5, "UrekMazino", "USA", 70);
		arr[2] = new Student(3, "Zephyr", "Korea", 100);

		System.out.println("Before Sort: ");
		for (Student student : arr) {
			System.out.println(student);
		}

		// sort by rollno -- Comparable
		Arrays.sort(arr);
		System.out.println("After Sort by rollno: ");
		for (Student student : arr) {
			System.out.println(student);
		}

		// local class
		class StudentCityComparator implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());
				return diff;
			}
		}

		// sort by city -- Comparator
		StudentCityComparator cityComparator = new StudentCityComparator();
		Arrays.sort(arr, cityComparator);
		System.out.println("After Sort by city desc: ");
		for (Student student : arr) {
			System.out.println(student);
		}

		// local class
		class StudentMarksComparator implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {
				int diff = Double.compare(s1.getMarks(), s2.getMarks());
				return -diff;
			}
		}
		// sort by marks -- Comparator
		StudentMarksComparator marksComparator = new StudentMarksComparator();
		Arrays.sort(arr, marksComparator);
		System.out.println("After Sort by marks desc: ");
		for (Student student : arr) {
			System.out.println(student);
		}
		
		
		// local class
		class StudentNameComparator implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {
				int diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		
		// sort by name -- Comparator
		StudentNameComparator nameComparator = new StudentNameComparator();
		Arrays.sort(arr, nameComparator);
		System.out.println("After Sort by name asc: ");
		for (Student student : arr) {
			System.out.println(student);
		}
		
	}

}
