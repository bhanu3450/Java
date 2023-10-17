package solution01;

import java.util.Scanner;

public class Salesman extends Employee{
	protected float comm;	

	public Salesman()
	    {
	        super.id = 0;
	        super.sal = 0;
	        this.comm = 0;
	    }

	public Salesman(int id, float sal, float comm)
	    {
	        super.id = id;
	        super.sal = sal;
	        this.comm = comm;
	    }

	public float get_comm()
	    {
	        return this.comm;
	    }

	public void set_comm(float comm)
	    {
	        this.comm = comm;
	    }

	public void accept()
	    {
	        super.accept();
	        System.out.println("Enter the commission for the salesman: ");
	        this.comm  = new Scanner(System.in).nextFloat();
	    }

	public void display()
	    {
	        super.display();
	        System.out.println("\nThe commission for the salesman is: " + this.comm); 
	    }

	@Override
	public void totalSalary() {
		System.out.println("total salary: " + (sal + comm));
		
	}
}