
public class Labour implements Emp {
	int hours;
	double rate;

	public Labour() {
		
	}

	public Labour(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours * rate;
	}

	@Override
	public double calcIncentives() {
		if (this.hours > 300) {
			return 0.05 * getSal();
		} else
			System.out.println("No incentive as hours : " + this.hours +  " exceeds 3");
		return 0.0;

	}
}
