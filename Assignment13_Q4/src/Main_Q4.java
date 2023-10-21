import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		try (FileReader fr = new FileReader("/home/negan/Documents/Core_Java/Assignment13_Q3/4Lines.txt")) {
			try (BufferedReader bwr = new BufferedReader(fr)) {
					String line;
					
					// readLine method(method of BufferedReader class) returns null when the end 
					// of file is reached
					while ( (line = bwr.readLine()) != null ) {
						System.out.println(line);
					}
					
				}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		System.out.println("File Read succesfully!!!!!!");
	}

}

