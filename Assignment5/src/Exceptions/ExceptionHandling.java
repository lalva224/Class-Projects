package Exceptions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExceptionHandling {

	public static void main(String[] args) {
		boolean done = false;
		while(!done) {
		try {
			tester();
			done = true;
		}
		catch(MonthException e) {
			System.out.println(e.getMessage());
		}
		catch(DayException e) {
			System.out.println(e.getMessage());
		}
		catch(YearException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Please type in correct format!");
			System.out.println();
		}
		}
		

	}
	
	public static void tester() throws MonthException, DayException, YearException {
		
		//input + conversion
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date to Parse MM/DD/YYYY");
		String[] values = sc.nextLine().split("/");
		
		int month = Integer.valueOf(values[0]);
		int day = Integer.valueOf(values[1]);
		int year = Integer.valueOf(values[2]);
		String stringMonth = "";
		
		// exception conditions
		if(month < 1 || month > 12)
			throw new MonthException();
		else
		 stringMonth = intMonthtoString(month);
		
		
		int maxDays = maxDaysInMonth(month);
		
		if(day<1 || day> maxDays)
			throw new DayException();
		
		if(year<1000 || year>3000)
			throw new YearException();
		
		System.out.println("Parsed date: " + stringMonth + " " + day + ", " + year);
		System.out.println();
		
		
		
			
		
		
	
	}
	public static int maxDaysInMonth(int month) {
		int maxDays = 0;
		switch(month) {
		case 1 :
			return maxDays = 31;
		case 2:
			return maxDays = 28;
		case 3:
			return maxDays = 31;
		case 4:
			return maxDays = 30;
		case 5:
			return maxDays = 31;
		case 6:
			return maxDays = 30;
		case 7:
			return maxDays = 31;
		case 8:
			return maxDays = 31;
		case 9:
			return maxDays = 30;
		case 10:
			return maxDays = 31;
		case 11:
			return maxDays = 30;
		case 12:
			return maxDays = 31;
		}
		return maxDays;
	}
	
	public static String intMonthtoString(int month) {
		String stringMonth = "";
		switch(month) {
		case 1:
			return stringMonth = "January";
		case 2:
			return stringMonth = "Feburary";
		case 3:
			return stringMonth = "March";
		case 4:
			return stringMonth = "April";
		case 5:
			return stringMonth = "May";
		case 6:
			return stringMonth = "June";
		case 7 :
			return stringMonth = "July";
		case 8:
			return stringMonth = "August";
		case 9:
			return stringMonth = "September";
		case 10:
			return stringMonth = "October";
		case 11:
			return stringMonth = "November";
		case 12:
			return stringMonth = "December";
		
		}
		return stringMonth;
	}

}
