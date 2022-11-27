package Assignment;

public class Clerk extends Employee {
	public Clerk() {
		super();
	}
	public Clerk(int employeeID ,double salary, String name, String department, String designation) {
		super(employeeID , salary, name,department, designation);
	}
	public Clerk(Clerk otherClerk) {
		super(otherClerk);
	}

	public double addBonus() {
		return getSalary() + 100;
	}
	
}
