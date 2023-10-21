
import java.util.ListIterator;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. 1. Add new book in List\n" + "If book not present, then add a new book\n"
				+ "If book is present, increment its quantity.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn ");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with a given index.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");
		System.out.println("7. Save books in a file");
		System.out.println("8. load books from file");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {

		int choice, index;
		Book key;
		String isbn;
		Scanner sc = new Scanner(System.in);

		ArrayList<Book> bookList = new ArrayList<>();
		Book b;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Add a book");
				b = new Book();
				b.acceptBook();

				if (bookList.contains(b)) {
					index = bookList.indexOf(b);
					Book bk = bookList.get(index);
					bk.setQuantity(bk.getQuantity() + 1);
				} else
					bookList.add(b);
				break;

			case 2:
				Collections.shuffle(bookList);
				ListIterator<Book> itr = bookList.listIterator();
				while (itr.hasNext()) {
					Book e = itr.next();
					System.out.println(e);
				}

//				for (Book book : bookList) {
//					System.out.println(book);
//				}
				break;
			case 3:

				System.out.println("Enter isbn for searching = ");
				isbn = sc.next();
				key = new Book();
				key.setisbn(isbn);
				index = bookList.indexOf(key);
				if (index == -1) {
					System.out.println("Book not found");
				} else {
					System.out.println("book found at index: " + index);
					b = bookList.get(index);
					System.out.println(b);
				}
				break;

			case 4:
				System.out.println("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 || index > bookList.size()) {
					System.out.println("Wrong Index...:(");

				} else {
					bookList.remove(index);
					System.out.println("Book at given index deleted");
				}
				break;

			case 5:
				bookList.clear();
				System.out.println("All books in list are deleted.");
				break;

			case 6:
				System.out.print("Enter Isbn : ");
				isbn = sc.nextLine();
				key = new Book();
				key.setisbn(isbn);
				if (bookList.contains(key)) {
					index = bookList.indexOf(key);
					bookList.remove(index);
					System.out.println("The Book with Isbn :  " + isbn + " deleted!!");
				}
				break;

			case 7:
//				try (FileOutputStream fout = new FileOutputStream("/home/negan/Documents/Core_Java/Assignmen13_Q1/src/Books.txt");)
				try (FileOutputStream fout = new FileOutputStream("Books.txt");) {
					try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {
						
						 oout.writeObject(bookList);
						 
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Movies saved.");
				break;

			case 8:
				List<Book> list;
//				try (FileInputStream fin = new FileInputStream("/home/negan/Documents/Core_Java/Assignmen13_Q1/src/Books.txt");)
				try (FileInputStream fin = new FileInputStream("Books.txt");) {
					try (ObjectInputStream oin = new ObjectInputStream(fin)) {
						list =  (List<Book>) oin.readObject(); 
						list.forEach( bho-> System.out.println(bho) );
						
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("File succesfully read.");
				break;

			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");
	}
}
