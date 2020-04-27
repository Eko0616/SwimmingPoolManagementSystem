package jump;

import java.util.Scanner;

public class MenuManager {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      AttendeeManager attendeeManager = new AttendeeManager(input);
	      
	      int num = -1;
	      while(num != 6) {
	      System.out.println("*** SwimmingPool Attendee Management System Menu ***");
	      System.out.println("1. Add Attendee");
	       System.out.println("2. Delete Attendee");
	       System.out.println("3. Edit Attendee");
	       System.out.println("4. View Attendee");
	       System.out.println("5. Schedule Line");
	       System.out.println("6. Exit");
	       System.out.println("Select one number between 1 - 6:");
	       num = input.nextInt();
	       if (num == 1) {
	          attendeeManager.addAttendee();
	           }
	       else if (num == 2) {
	          attendeeManager.deleteAttendee();
	           }
	       else if (num == 3) {
	          attendeeManager.editAttendee();
	       }
	       else if (num == 4) {
	          attendeeManager.viewAttendee();
	           }
	       else if (num == 5) {
	    	   attendeeManager.schedulecheck();
	    	   
	       }
	       else {
	          continue;
	           }  
	       }
	  }
}
