package WeSolveIt_ChristopherKhun;
import java.util.Scanner;

public class Main {
	
	// if open first time then true
	private static boolean firstTime = true;
	
	/**
	* Manages Daily Tasks
	* @author Christopher S. Khun
	* @version v1.0
	*/
	
	
	public static void main(String[] args) {
		
		// initiate scanner
	    Scanner scanner = new Scanner(System.in);
	    
	    // declare variables and links classes
	    PlanDay plandayobj = new PlanDay();
	    PlanAll planallobj = new PlanAll();
	    DispDay dispdayobj = new DispDay();
	    DispAll dispallobj = new DispAll();
	    Delete deleteobj = new Delete();
	    Integer Selection;

	    // determines the user's choices
	    do {
	        if (firstTime) {
	            System.out.println("Welcome to the Task Manager!");
	            System.out.println("");
	            firstTime = false;
	        }
	        System.out.println("Select option: ");
	        System.out.println("1) Plan Specific Day");
	        System.out.println("2) Plan All Days");
	        System.out.println("3) Display Specific Days");
	        System.out.println("4) Display All");
	        System.out.println("5) Delete Day");
	        System.out.println("6) QUIT");
	        System.out.println("");

	        Selection = scanner.nextInt();
	        scanner.nextLine();

	        if (Selection.equals(6)) {
	            System.out.println("You selected: " + Selection);
	            System.out.println("Thanks for planning with us!");
	            scanner.close();
	            System.exit(0);
	        }

	        else if (Selection < 1 || Selection > 6) {
	            System.out.println("You selected: " + Selection);
	            System.out.println("Sorry, " + Selection + " is not a valid option.");
	            System.out.println("");
	        }

	        else {
	            System.out.println("You selected: " + Selection);
	            System.out.println("");
	            break;
	            
	        }
	    } while (true);

	    // calls function that user has chosen
	    if (Selection.equals(1)) {
	        plandayobj.PlanSpecificFunction();
	    }

	    if (Selection.equals(2)) {
	        planallobj.PlanAllFunction();
	    }

	    if (Selection.equals(3)) {
	        dispdayobj.DisplaySpecificFunction();
	    }

	    if (Selection.equals(4)) {
	        dispallobj.DisplayAllFunction();
	    }

	    if (Selection.equals(5)) {
	        deleteobj.DeleteDayTaskFunction();
	    }

	    scanner.close();
	}

}
