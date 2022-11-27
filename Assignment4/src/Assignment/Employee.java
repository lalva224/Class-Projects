package Assignment;

public class Employee {

	private int employeeID;
	private double salary;
	private String name;
	private String department;
	private String designation;
	
	public Employee() {
		this(0,0," no name", " no department", "no designation");
	}
	public Employee(int employeeID ,double salary, String name, String department, String designation) {
		this.employeeID = employeeID;
		this.salary = salary;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}
	public Employee(Employee otherEmployee) {
		this(otherEmployee.employeeID, otherEmployee.salary, otherEmployee.name,
				otherEmployee.department,otherEmployee.designation);
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void display() {
		System.out.println("Employee ID:  " + getEmployeeID());
		System.out.println("Employee Name:" + getName());
		System.out.println("Department Name: " + getDepartment());
		System.out.println("Salary: " + getSalary());
		System.out.println("Designation:" + getDesignation());
		System.out.println("Salary after adding bonus: " + addBonus());
		System.out.println();
	}
	
	public double addBonus() {
		return 0;
	}
	
	// salary is only deducted from original amount, not the bonus.
	
	public double deductedSalary(int daysOff) {
		double payPerDay = getSalary() / 20 ; 
		return payPerDay*daysOff;
	}
	
	public boolean equals(Object otherObject) {
		if(getClass() != otherObject.getClass())
			return false;
		else if((!(otherObject instanceof Employee)))
				return false;
		else {
			Employee e1 = (Employee) otherObject;
			return getEmployeeID() == e1.getEmployeeID()  && getSalary() == e1.getSalary()
					&& getName().equals(e1.getName()) && getDepartment().equals(e1.getDepartment())
					&& getDesignation().equals(e1.getDesignation());
		}
	}
	
}
