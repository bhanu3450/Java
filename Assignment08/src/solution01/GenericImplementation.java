package solution01;

public class GenericImplementation {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		s.accept();
		s.display();
		Box<Person> p1 = new Box<Person>();
		p1.set(s);
		p1.getTotalSalary();

		Manager m = new Manager();
		m.accept();
        m.dispaly_manager();
		Box<Person> p2 = new Box<Person>();
		p2.set(m);
		p2.getTotalSalary();
		
		SalesManager salesManager = new SalesManager();
		Box<Person> p3 = new Box<Person>();
		p3.set(salesManager);
		p3.getTotalSalary();

	}
}
