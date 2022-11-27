package Exceptions;

public class MonthException extends Exception{
	
	public MonthException() {
		super("invalid month. Reenter a valid monthc \n");
	}
	public MonthException(String message) {
		super(message + "\n");
	}

}
