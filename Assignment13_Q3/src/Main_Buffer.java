import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Main_Buffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (FileWriter fwr = new FileWriter("4Lines.txt")) {
			try (BufferedWriter bwr = new BufferedWriter(fwr)) {
				for (int i = 1; i <= 4; i++) {
					System.out.println("Enter a new Line");
					String line = sc.nextLine();
					bwr.write(line + "\n");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Saved");
	}

//			
//			String line = sc.nextLine();
//			try(FileOutputStream fout = new FileOutputStream("4Lines.txt")) {
//				try(BufferedOutputStream bwr = new BufferedOutputStream(fout)){
//					try(DataOutputStream dout = new DataOutputStream(bwr)) {
//	                  for (int i = 1; i <= 4; i++) {
// 	                    System.out.println("Enter a Line (string) ");
//	                    int num = sc.nextInt();
//						bwr.write(num);
////				    bwr.write(line);
	// }
//					}
//					
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}		

}
