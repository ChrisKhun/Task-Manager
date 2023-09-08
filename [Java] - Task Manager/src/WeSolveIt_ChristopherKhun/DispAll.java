package WeSolveIt_ChristopherKhun;
import java.util.ArrayList;

public class DispAll {
	
	// declare variables
	Integer SelectDay;
	String sundaytask;
	String mondaytask;
	String tuesdaytask;
	String wednesdaytask;
	String thursdaytask;
	String fridaytask;
	String saturdaytask;
	
	
	public void DisplayAllFunction() {
		
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
		
		// Displays all task avaliable
		System.out.println("Now Displaying All Days");
		System.out.println("");
		
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
			
			// Loops back to main
			returnToMain();
		}
		private void returnToMain() {
			Main.main(new String[]{});
	    }
	}
