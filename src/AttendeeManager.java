package hong;

import java.util.Scanner;

public class AttendeeManager {
	Attendee attendee;	
	Scanner input;
	AttendeeManager(Scanner input) {
		this.input = input;
		
	}
	public void addAttendee() {
		attendee = new Attendee();
		System.out.print("Attendee ID:");
		attendee.id = input.nextInt();
		System.out.print("Attendee name:");
		attendee.name = input.next();
		System.out.print("Email address:");
		attendee.email = input.next();
		System.out.print("Phone number:");
		attendee.phone = input.next();
	}
	
	public void deleteAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		if (attendee == null) {
			System.out.println("the attendee has not been registered");	
			return;
		}
		if (attendee.id == attendeeId) {
			attendee = null;
			System.out.println("the attendee is deleted");
		}
	}
	
	public void editAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		if (attendee.id == attendeeId) {
			int num = -1;
			while(num != 5) {
			System.out.println("*** AttendeeInfo Edit Menu ***");
			System.out.println("1. Edit Id");
		    System.out.println("2. Edit Name");
		    System.out.println("3. Edit Email");
		    System.out.println("4. View Phone");
		    System.out.println("5. Exit");
		    System.out.println("Select one number between 1 - 6:");
		    num = input.nextInt();
		    if (num == 1) {
		    	System.out.print("Attendee ID:");
				attendee.id = input.nextInt();
		        }
		    else if (num == 2) {
		    	System.out.print("Attendee name:");
				attendee.name = input.next();
		        }
		    else if (num == 3) {
		    	System.out.print("Email address:");
				attendee.email = input.next();
		    }
		    else if (num == 4) {
		    	System.out.print("Phone number:");
				attendee.phone = input.next();
		        }
		    else {
		    	continue;
		        }  
			}
			System.out.println("the attendee to be edited is " + attendeeId);
		}
	}
	
	public void viewAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		if (attendee.id == attendeeId) {
			attendee.printInfo();
		}	
	}

}
