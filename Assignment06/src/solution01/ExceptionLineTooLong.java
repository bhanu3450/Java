package q1_solution;

public class ExceptionLineTooLong extends Exception{
    String fieldName;
    int fieldValue;
    
    public ExceptionLineTooLong() {
    	
    }
	public ExceptionLineTooLong(String fieldName, int fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
	}
    
}
