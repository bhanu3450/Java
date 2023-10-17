package solution01;

import java.util.Scanner;

public class Manager extends Employee{
	protected float bonus;

	protected void accept_manager() {
		System.out.println("Enter the bonus: ");
		this.bonus = new Scanner(System.in).nextFloat();
	}

	protected void dispaly_manager() {
		System.out.println("The bonus is: " + this.bonus);
	}

	public Manager()
	    {
	        super();
	        
	        this.bonus = 0;
	    }

	public Manager(int id, float sal, float bonus, String name)
	    {
	        super.id = id;
	        super.sal = sal;
	        super.name = name;
	        this.bonus = bonus;
	    }

	public float get_bonus()
	    {
	        return this.bonus;
	    }

	public void set_bonus(float bonus)
	    {
	        this.bonus = bonus;
	    }

	public void accept()
	    {
	      super.accept();
	        System.out.println("Enter the bonus: ");
	        this.bonus = new Scanner(System.in).nextFloat();
	    }

	public void display()
	    {
	        super.display();
	        System.out.println("The bonus is: " + this.bonus);
	    }

	@Override
	public void totalSalary() {
		
		System.out.println("total salary: " + (sal + bonus));
	}
}