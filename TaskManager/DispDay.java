package TaskManager;
import java.util.ArrayList;
import java.util.Scanner;

public class DispDay {
	
	// declare variables
	Integer SelectDay;
	String sundaytask;
	String mondaytask;
	String tuesdaytask;
	String wednesdaytask;
	String thursdaytask;
	String fridaytask;
	String saturdaytask;
	
	
	
	public void DisplaySpecificFunction() {
		
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
		
		// prompts user with which day they want to print
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
		
		
		// determines which day to display from selection
		if (SelectDay.equals(1)) {
			System.out.println("Sunday Task(s): ");
			if (sundayarray.isEmpty()) {
		        System.out.println("No tasks planned for Sunday.");
		        System.out.println("");
			}
		        else {
			        for (Object element : sundayarray) {
			            System.out.println(element);
			            System.out.println("");
			        }
		        }
		}
		
		
		if (SelectDay.equals(2)) {
			System.out.println("Monday Task(s): ");
			if (mondayarray.isEmpty()) {
		        System.out.println("No tasks planned for Monday.");
		        System.out.println("");
			}
		    	else {
		    		for (Object element : mondayarray) {
			        	System.out.println(element);
			            System.out.println("");
		    		}
		    	}
		}
		
		
		if (SelectDay.equals(3)) {
			System.out.println("Tuesday Task(s): ");
			if (tuesdayarray.isEmpty()) {
		        System.out.println("No tasks planned for Tuesday.");
		        System.out.println("");
			}
		        else {
		        	for (Object element : tuesdayarray) {
		        		System.out.println(element);
		        		System.out.println("");
		        	}
		        }
		}
		
		
		if (SelectDay.equals(4)) {
			System.out.println("Wednesday Task(s): ");
			if (wednesdayarray.isEmpty()) {
		        System.out.println("No tasks planned for Wednesday.");
		        System.out.println("");
			}
		    	else {
		    		for (Object element : wednesdayarray) {
		    			System.out.println(element);
		    			System.out.println("");
		    		}
		    	}
		}
		
		
		if (SelectDay.equals(5)) {
			System.out.println("Thursday Task(s): ");
			if (thursdayarray.isEmpty()) {
		        System.out.println("No tasks planned for Thursday.");
		        System.out.println("");
			}
		        else {
		        	for (Object element : thursdayarray) {
		        		System.out.println(element);
		        		System.out.println("");
		        	}
		        }
		}
		
		
		if (SelectDay.equals(6)) {
			System.out.println("Friday Task(s): ");
			if (fridayarray.isEmpty()) {
		        System.out.println("No tasks planned for Friday.");
		        System.out.println("");
			}
		        else {
		        	for (Object element : fridayarray) {
		        		System.out.println(element);
		        		System.out.println("");
		        	}
		        }
		}
		

		if (SelectDay.equals(7)) {
			System.out.println("Saturday Task(s): ");
			if (saturdayarray.isEmpty()) {
		        System.out.println("No tasks planned for Saturday.");
		        System.out.println("");
			}
		    	else {
		    		for (Object element : saturdayarray) {
		    			System.out.println(element);
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