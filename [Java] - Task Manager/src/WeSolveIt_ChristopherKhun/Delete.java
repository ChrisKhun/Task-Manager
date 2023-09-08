package WeSolveIt_ChristopherKhun;
import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
	
	// declare variables
	Integer SelectDay;
	
	
	public void DeleteDayTaskFunction() {
		
		// initiates scanner
		Scanner scanner = new Scanner(System.in);
		
		// links planday class
		PlanDay plandayobj = new PlanDay();
		
		// links arraylists
		ArrayList<Object> sundayarray = plandayobj.getsundayarray();
		ArrayList<Object> mondayarray = plandayobj.getmondayarray();
		ArrayList<Object> tuesdayarray = plandayobj.gettuesdayarray();
		ArrayList<Object> wednesdayarray = plandayobj.getwednesdayarray();
		ArrayList<Object> thursdayarray = plandayobj.getthursdayarray();
		ArrayList<Object> fridayarray = plandayobj.getfridayarray();
		ArrayList<Object> saturdayarray = plandayobj.getsaturdayarray();
		
		// prompts user with which day they want to delete
		do {
			System.out.println("Please select a day: ");
			System.out.println("1) Sunday");
			System.out.println("2) Monday");
			System.out.println("3) Tuesday");
			System.out.println("4) Wednesday");
			System.out.println("5) Thursday");
			System.out.println("6) Friday");
			System.out.println("7) Saturday");
			System.out.println("");
			
			SelectDay = scanner.nextInt();
	        scanner.nextLine();
	        
	        if(SelectDay > 7 || SelectDay < 1) {
	        	System.out.println("I'm sorry but that's an invalid selection.");
	        	System.out.println("Try Again!");
	        	System.out.println("");
	        }
	        
	        else {
	        	System.out.println("You selected: " + SelectDay);
	        	System.out.println("");
	        	break;
	        } 
		} while (true);
		
		// determines which day to delete from selection
		if (SelectDay.equals(1)) {
			System.out.println("Are you sure you wanted to DELETE Sunday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING SUNDAY'S TASK(S)!");
					System.out.println("");
					sundayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	
		
		
		if (SelectDay.equals(2)) {
			System.out.println("Are you sure you wanted to DELETE Monday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING MONDAY'S TASK(S)!");
					System.out.println("");
					mondayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	
		
		
		if (SelectDay.equals(3)) {
			System.out.println("Are you sure you wanted to DELETE Tuesday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING TUESDAY's TASK(S)!");
					System.out.println("");
					tuesdayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	
		
		
		if (SelectDay.equals(4)) {
			System.out.println("Are you sure you wanted to DELETE Wednesday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING WEDNESDAY'S TASK(S)!");
					System.out.println("");
					wednesdayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	

		
		if (SelectDay.equals(5)) {
			System.out.println("Are you sure you wanted to DELETE Thursday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING THURSDAY'S TASK(S)!");
					System.out.println("");
					thursdayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	
		
		
		if (SelectDay.equals(6)) {
			System.out.println("Are you sure you wanted to DELETE Friday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING FRIDAY's TASK(S)!");
					System.out.println("");
					fridayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}	
		
		
		if (SelectDay.equals(6)) {
			System.out.println("Are you sure you wanted to DELETE Saturday's Task(s)? (y/n)");
			String input = scanner.nextLine();
			
			while (true) {
				if (input.equalsIgnoreCase("y")) {
					System.out.println("");
					System.out.println("DELETING SATURDAY'S TASK(S)!");
					System.out.println("");
					saturdayarray.clear();
					break;
				}
				else if (input.equalsIgnoreCase("n")) {
					System.out.println("You selected: n");
		        	System.out.println("");
		            break;
				}
				else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
				
				
			}
		}
		
		// Loops back to main & closes scanner
		returnToMain();
		scanner.close();
	}
	private void returnToMain() {
		Main.main(new String[]{});
    }
}
