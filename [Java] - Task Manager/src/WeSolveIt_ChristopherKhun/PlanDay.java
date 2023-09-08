package WeSolveIt_ChristopherKhun;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanDay {
	
	// declare variables
	Integer SelectDay;
	String sundaytask;
	String mondaytask;
	String tuesdaytask;
	String wednesdaytask;
	String thursdaytask;
	String fridaytask;
	String saturdaytask;
	
	// creates and stores the arrays
	private static ArrayList<Object> sundayarray = new ArrayList<Object>();
	private static ArrayList<Object> mondayarray = new ArrayList<Object>();
	private static ArrayList<Object> tuesdayarray = new ArrayList<Object>();
	private static ArrayList<Object> wednesdayarray = new ArrayList<Object>();
	private static ArrayList<Object> thursdayarray = new ArrayList<Object>();
	private static ArrayList<Object> fridayarray = new ArrayList<Object>();
	private static ArrayList<Object> saturdayarray = new ArrayList<Object>();
	
	public void PlanSpecificFunction() {
		// initiates scanner
		Scanner scanner = new Scanner(System.in);
		
		// Determines which day user wants to plan
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
		
		
		// adds specific task to specific arraylist for each day that user picks
		if (SelectDay.equals(1)) {
		    System.out.println("Please enter a Task: ");
		    sundaytask = scanner.nextLine();
		    System.out.println("You entered: " + sundaytask);
		    System.out.println("");
		    sundayarray.add(sundaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Sunday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            sundaytask = scanner.nextLine();
		            System.out.println("You entered: " + sundaytask);
		            System.out.println("");
		            sundayarray.add(sundaytask);
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
		    System.out.println("Please enter a Task: ");
		    mondaytask = scanner.nextLine();
		    System.out.println("You entered: " + mondaytask);
		    System.out.println("");
		    mondayarray.add(mondaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Monday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            mondaytask = scanner.nextLine();
		            System.out.println("You entered: " + mondaytask);
		            System.out.println("");
		            mondayarray.add(mondaytask);
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
		    System.out.println("Please enter a Task: ");
		    tuesdaytask = scanner.nextLine();
		    System.out.println("You entered: " + tuesdaytask);
		    System.out.println("");
		    tuesdayarray.add(tuesdaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Tuesday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            tuesdaytask = scanner.nextLine();
		            System.out.println("You entered: " + tuesdaytask);
		            System.out.println("");
		            tuesdayarray.add(tuesdaytask);
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
		    System.out.println("Please enter a Task: ");
		    wednesdaytask = scanner.nextLine();
		    System.out.println("You entered: " + wednesdaytask);
		    System.out.println("");
		    wednesdayarray.add(wednesdaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Wednesday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            wednesdaytask = scanner.nextLine();
		            System.out.println("You entered: " + wednesdaytask);
		            System.out.println("");
		            wednesdayarray.add(wednesdaytask);
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
		    System.out.println("Please enter a Task: ");
		    thursdaytask = scanner.nextLine();
		    System.out.println("You entered: " + thursdaytask);
		    System.out.println("");
		    thursdayarray.add(thursdaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Thursday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            thursdaytask = scanner.nextLine();
		            System.out.println("You entered: " + thursdaytask);
		            System.out.println("");
		            thursdayarray.add(thursdaytask);
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
		    System.out.println("Please enter a Task: ");
		    fridaytask = scanner.nextLine();
		    System.out.println("You entered: " + fridaytask);
		    System.out.println("");
		    fridayarray.add(fridaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Friday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            fridaytask = scanner.nextLine();
		            System.out.println("You entered: " + fridaytask);
		            System.out.println("");
		            fridayarray.add(fridaytask);
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
		
		if (SelectDay.equals(7)) {
		    System.out.println("Please enter a Task: ");
		    saturdaytask = scanner.nextLine();
		    System.out.println("You entered: " + saturdaytask);
		    System.out.println("");
		    saturdayarray.add(saturdaytask);
		    
		    while (true) {
		        System.out.println("Did you want to add another task for Saturday? (y/n)");
		        String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("y")) {
		            System.out.println("Please enter another Task: ");
		            saturdaytask = scanner.nextLine();
		            System.out.println("You entered: " + saturdaytask);
		            System.out.println("");
		            saturdayarray.add(saturdaytask);
		        } else if (input.equalsIgnoreCase("n")) {
		        	System.out.println("You selected: n");
		        	System.out.println("");
		            break;
		        } else {
		            System.out.println("Invalid input. Please enter 'y' or 'n'.");
		            System.out.println("");
		        }
		    }
		}
		
		// Loops back to main & closes scanner
		returnToMain();
		scanner.close();
		
	}
	
	// allows ArrayLists to be used in other classes
	public ArrayList<Object> getsundayarray() {
		return sundayarray;
	}
	public ArrayList<Object> getmondayarray() {
		return mondayarray;
	}
	public ArrayList<Object> gettuesdayarray() {
		return tuesdayarray;
	}
	public ArrayList<Object> getwednesdayarray() {
		return wednesdayarray;
	}
	public ArrayList<Object> getthursdayarray() {
		return thursdayarray;
	}
	public ArrayList<Object> getfridayarray() {
		return fridayarray;
	}
	public ArrayList<Object> getsaturdayarray() {
		return saturdayarray;
	}
	
	private void returnToMain() {
		Main.main(new String[]{});
    }
}
