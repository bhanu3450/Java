package q1_solution;

public class tester {

	public static void main(String[] args) {
	  try {
	ProgramToReadString.createString();
	} catch (ExceptionLineTooLong e) {
		e.printStackTrace();
		System.out.println("Program executed succesfully");
	}
     
	}

}
