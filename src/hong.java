package hong;

import java.util.Scanner;

public class hong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AttendeeManager attendeeManager = new AttendeeManager(input);
		
		int num = -1;
		while(num != 5) {
		System.out.println("*** Attendee Management System Menu ***");
		System.out.println("1. Add Attendee");
	    System.out.println("2. Delete Attendee");
	    System.out.println("3. Edit Attendee");
	    System.out.println("4. View Attendee");
	    System.out.println("5. Exit");
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
	    else {
	    	continue;
	        }  
		}
	}
	
	public static void addAttendee() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Attendee ID: ");
		int AttendeeId = input.nextInt();
		System.out.print(" Attendee name: ");
	    String AttendeeName = input.next();
		System.out.print(" Email address: ");
		String AttendeeEmail = input.next();
		System.out.println(AttendeeEmail);
		System.out.print(" Phone number: ");
		String AttendeePhone = input.next();
	}
	
	public static void deleteAttendee() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Attendee ID: ");
		int AttendeeId = input.nextInt();
		
	}
	
	public static void editAttendee() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Attendee ID: ");
		int AttendeeId = input.nextInt();
		
	}
	
	public static void viewAttendee() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Attendee ID: ");
		int AttendeeId = input.nextInt();
		
	}
}
	
		
	
