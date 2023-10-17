package solution01;

import java.util.Scanner;

public class SalesManager extends Employee {
	protected float comm;
	protected float bonus;

	public SalesManager() {
		super();
		this.comm = 0;
		this.bonus = 0;
	}

	SalesManager(int id, float sal, float bonus, float comm)
	    { 
	        super.id = id;
	        super.sal = sal;
	        this.bonus = bonus;
	        this.comm = comm;
	    }

	public void accept()
	    {
	        super.accept();
	        System.out.print("Enter comm: ");
	        this.comm = new Scanner(System.in).nextFloat();
	        this.bonus = new Scanner(System.in).nextFloat();
	    }

	public void display()
	    {
	        super.display();
	        System.out.println("Comm is: " + comm);
	        System.out.println("Bonus is: " + bonus);
	    }

	@Override
	public void totalSalary() {
		System.out.println("Total salary: " + (sal + comm + bonus));

	}
}