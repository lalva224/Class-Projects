package Exceptions;

public class DayException extends Exception{
	
	public DayException() {
		super("Invalid day, please reenter a valid day. \n");
	}
	
	public DayException(String message) {
		super(message + "\n");
	}

}
