package jump;

import java.util.Scanner;

public class MenuManager {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      AttendeeManager attendeeManager = new AttendeeManager(input);
	      
	      int num = -1;
	      while(num != 6) {
	    	  showMenu();
	       num = input.nextInt();
	       switch(num) {
	       case 1:
	    	   attendeeManager.addAttendee();
	    	   break;
	       case 2:
	    	   attendeeManager.deleteAttendee();
	    	   break;
	       case 3:
	    	   attendeeManager.editAttendee();
	    	   break;
	       case 4:
	    	   attendeeManager.viewAttendee();
	    	   break;
	       case 5:
	    	   attendeeManager.schedulecheck();
	    	   break;
	       default:
	    	   continue;
	           }  
	       }
	  }
	   
	   public static void showMenu() {
		   System.out.println("*** SwimmingPool Attendee Management System Menu ***");
		      System.out.println("1. Add Attendee");
		       System.out.println("2. Delete Attendee");
		       System.out.println("3. Edit Attendee");
		       System.out.println("4. View Attendee");
		       System.out.println("5. Schedule Line");
		       System.out.println("6. Exit");
		       System.out.println("Select one number between 1 - 6:");  
	   }
}
