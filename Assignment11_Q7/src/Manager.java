
public class Manager implements Emp {
	double basicSalary;
	double dearanceAllowance;
	
	
	public Manager() {
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		
		return 0.20 * basicSalary;
	}
}
