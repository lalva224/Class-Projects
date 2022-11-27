package Assignment;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]daysOff = new int[3];
		double[] deductedSalary = new double[3];
		double totalDeductions = 0;
		
		
		Manager mike = new Manager(3456,9500,"Mike", "Accounting", "Manager" );
		Manager john = new Manager(8790,10700, "John", "Engineering", "Manager");
		Clerk ronald = new Clerk(4453,3400, "Ronald","HR", "Clerk");
		Employee[] employees = {mike,john,ronald};
		
		mike.display();
		john.display();
		ronald.display();
		System.out.println();
		
		// using for loops to make it useful for larger amounts of Employees.
		// receives days off from user input and uses it right away for each employee deducted salary method
		
		for(int i = 0; i<employees.length; i++) {
			System.out.printf("Enter the amount of days Employee %3s took off out of 20 \n", employees[i].getEmployeeID());
			daysOff[i] = scan.nextInt();
			 deductedSalary[i] = employees[i].deductedSalary(daysOff[i]);
		}
		
		System.out.println();
		System.out.printf("%-10s %-10s %-10s %-10s", "Employee ID", "Present", "Absent", "Deductions \n" );
		
		
		for(int i =0; i<employees.length; i++) {
			System.out.printf("%-10s  %-10d %-10d $%-10.1f \n", employees[i].getEmployeeID(),20- daysOff[i], daysOff[i],
					deductedSalary[i] );
			totalDeductions += deductedSalary[i];
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Total Deducted Salary: " + totalDeductions);
		
	
		

	}

}
