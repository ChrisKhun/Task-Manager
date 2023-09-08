package WeSolveIt_ChristopherKhun;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanAll {
	
	// declare variables
	String sundaytask;
	String mondaytask;
	String tuesdaytask;
	String wednesdaytask;
	String thursdaytask;
	String fridaytask;
	String saturdaytask;
	
	
	public void PlanAllFunction() {
		
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
		
		// clears arraylists 
		sundayarray.clear();
		mondayarray.clear();
		tuesdayarray.clear();
		wednesdayarray.clear();
		thursdayarray.clear();
		fridayarray.clear();
		saturdayarray.clear();
		
		
		// prompts user to plan all days of the week
		System.out.println("Enter your task for Sunday: ");
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
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Monday: ");
		mondaytask = scanner.nextLine();
		System.out.println("Your entered: " + mondaytask);
		System.out.println("");
		mondayarray.add(mondaytask);
		
		while (true) {
	        System.out.println("Did you want to add another task for Monday? (y/n)");
	        String input = scanner.nextLine();
	        if (input.equalsIgnoreCase("y")) {
	            System.out.println("Please enter another Task: ");
	            sundaytask = scanner.nextLine();
	            System.out.println("You entered: " + mondaytask);
	            System.out.println("");
	            mondayarray.add(mondaytask);
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Tuesday: ");
		tuesdaytask = scanner.nextLine();
		System.out.println("Your entered: " + tuesdaytask);
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
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Wednesday: ");
		wednesdaytask = scanner.nextLine();
		System.out.println("Your entered: " + wednesdaytask);
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
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Thursday: ");
		thursdaytask = scanner.nextLine();
		System.out.println("Your entered: " + thursdaytask);
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
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Friday: ");
		fridaytask = scanner.nextLine();
		System.out.println("Your entered: " + fridaytask);
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
	        } else if (input.equalsIgnoreCase("n")) {
	        	System.out.println("You selected: n");
	        	System.out.println("");
	            break;
	        } else {
	            System.out.println("Invalid input. Please enter 'y' or 'n'.");
	            System.out.println("");
	        }
	    }
		
		
		System.out.println("Enter your task for Saturday: ");
		saturdaytask = scanner.nextLine();
		System.out.println("Your entered: " + saturdaytask);
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
		
		// Loops back to main & closes scanner
		returnToMain();
		scanner.close();
	}
	
	private void returnToMain() {
		Main.main(new String[]{});
    }
}
