package Assignment;

public class Manager extends Employee {
	
	public Manager() {
		super();
	}
	public Manager(int employeeID ,double salary, String name, String department, String designation) {
		super(employeeID , salary, name,department, designation);
	}
	public Manager(Manager otherManager) {
		super(otherManager);
	}

	
	public double addBonus(){
		return getSalary() + 300 ;
	}
	


}
