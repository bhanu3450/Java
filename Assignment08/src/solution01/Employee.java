package solution01;

import java.util.Scanner;

abstract public class Employee implements Person {
	String name;
	protected int id;
	protected float sal;

	public Employee() {
		this.id = 0;
		this.sal = 0;
		this.name = "";
	}

	public Employee(int id, float sal) {
		this.id = id;
		this.sal = sal;
	}

	int get_id()
	    {
	        return this.id;
	    }

	float get_sal()
	    {
	        return this.sal;
	    }

	void set_id(int id)
	    {
	        this.id = id;
	    }

	void set_sal(float sal)
	    {
	        this.sal = sal;
	    }

	public void accept()
	    {
	        System.out.println("Enter the id: ");
	        this.id = new Scanner(System.in).nextInt();
	        System.out.println("Enter the Salary: ");
	       this.sal = new Scanner(System.in).nextFloat();
	       System.out.println("enter name");
	       this.name = new Scanner(System.in).nextLine();
	       
	    }

	public void display()
	    {
	        System.out.println("The details are: ");
	        System.out.println("The id is: " + this.id);
	        System.out.println("The salary is: " + this.sal);
	        System.out.println("name: " + this.name);
	    }

     public abstract void totalSalary() ;
		
		
	
}