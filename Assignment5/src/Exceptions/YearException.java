package Exceptions;

public class YearException extends Exception {

	public YearException() {
		super("Invalid year, please reenter valid year \n");
	}
	
	public YearException(String message) {
		super(message + "\n");
	}
}
