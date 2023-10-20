
public class Main {

	public static void main(String[] args) {
	
		Manager manager = new Manager(50000, 4000);
		System.out.println("Manager salary: " + manager.getSal());
		System.out.println("Manager incentives: " + manager.calcIncentives());
		
		Labour labour = new Labour(8, 600);
		System.out.println("Labour salary " + labour.getSal());
		System.out.println("Labour incentives: " + labour.calcIncentives());
		
		Clerk clerk = new Clerk(25000);
		System.out.println("Clerk salary " + clerk.getSal());		
		
		Emp[] arr = new Emp[3];
		arr[0] = new Manager(50000, 4000);
		arr[1] = new Labour(8, 600);
		arr[2] = new Clerk(25000);
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println("total income of all the Employees : " + totalIncome);

	}

}
