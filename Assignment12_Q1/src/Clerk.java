
public class Clerk implements Emp {
	double salary;

	public Clerk() {

	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}
}
