

	import java.util.Scanner;

	public class seatSelections{
		
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] seats = new String[7][4];
		for(int i =0; i<seats.length; i++) { 
				seats[i][0] = "A";
				seats[i][1] = "B";
				seats[i][2] = "C";
				seats[i][3] = "D";
		}
		int seatsFilled = 0;
		String input = " ";
		
		
		System.out.println("You will be selecting seats for this airplane");
		print(seats);
		System.out.println("You will select your seat by row number and seat letter (ex- 3B)." );
		System.out.println("Please enter the seat numbers or press Q to quit.");
		System.out.println();
		
		
		
		while(seatsFilled < 28) {
			input = scan.nextLine();
			if(input.equalsIgnoreCase("q")) {
				System.out.println("quitting program...");
				System.exit(0);
				
			}
			else {
		print(seatAssignment(seats,input,seatsFilled));
		}
			
		}
	}
	

		public static void print(String[][] seats) {
			for(int i =0; i<seats.length; i++) {
				System.out.print(i+1 + " ");
				for(int j =0; j<seats[i].length; j++) {
					System.out.print(seats[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		public static String[][] seatAssignment(String[][] seats, String input, int seatsFilled) {
	
			int row = Character.getNumericValue(input.charAt(0)) -1 ;
			String stringColumn = Character.toString(input.charAt(1));
			int column = stringtoInt(stringColumn);
			
		
			if(seats[row][column].equalsIgnoreCase("X")) {
				System.out.println("seat already assigned");
				}
			else {
				seats[row][column] = "X";
				seatsFilled++;
				
				
			}

	
	return seats;
		}
		
		public static int stringtoInt(String stringColumn) {
		int column = 0;
		
			switch (stringColumn.toUpperCase()) {
			case "A": 
				column = 0;	
				break;
			case "B":
				column = 1;
				break;
			case "C":
				column = 2;
				break;
			case "D":
				column = 3;
				break;
				
				
			}
			return column;
			
				
		}
	
	}
	 
	
			
		

				
			
		
		
			
		
	

