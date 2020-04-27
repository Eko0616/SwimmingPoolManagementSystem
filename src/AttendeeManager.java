package jump;

import java.util.ArrayList;
import java.util.Scanner;

import attendee.Attendee;
import attendee.AttendeeKind;
import attendee.ElementarySchoolAttendee;
import attendee.HighSchoolAttendee;

public class AttendeeManager {
	ArrayList<Attendee> attendees = new ArrayList<Attendee>();	
	Scanner input;
	AttendeeManager(Scanner input) {
		this.input = input;	
	}
	public void addAttendee() {
		int kind = 0;
		Attendee attendee;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
		System.out.println("1 for University");
		System.out.println("2 for High School");
		System.out.println("3 for Middle School");
		System.out.println("4 for Elementary School");
		System.out.print("Select num for Attendee Kind between 1 and 4:");
		kind = input.nextInt();
		if (kind == 1) {
			attendee = new Attendee(AttendeeKind.University);
			attendee.getUserInput(input);
			attendees.add(attendee);
			break;
		}
		else if (kind ==2) {
			attendee = new HighSchoolAttendee(AttendeeKind.HighSchool);
			attendee.getUserInput(input);
			attendees.add(attendee);
			break;
		}
		else if (kind ==3) {
			attendee = new HighSchoolAttendee(AttendeeKind.HighSchool);
			attendee.getUserInput(input);
			attendees.add(attendee);
			break;
		}
		else if (kind ==4) {
			attendee = new ElementarySchoolAttendee(AttendeeKind.ElementarySchool);
			attendee.getUserInput(input);
			attendees.add(attendee);
			break;
		}
		else {
			System.out.print("Select num for Attendee Kind between 1 and 2:");
		  }		
     	}
     }
	
	public void deleteAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		int index = -1;
		for (int i = 0; i<attendees.size(); i++) {
			if (attendees.get(i).getId() == attendeeId) {
				index = i;
				break;
			}
		}
		
		if (index >=0) {
			attendees.remove(index);
		System.out.println("the attendee " +attendeeId + " is deleted");
		}
		else {
			System.out.println("the attendee has not been registered");	
			return;
		}			
	}
	
	public void editAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		for (int i = 0; i<attendees.size(); i++) {
			Attendee attendee = attendees.get(i);
		if (attendee.getId() == attendeeId) {
			int num = -1;
			while(num != 5) {
			System.out.println("*** AttendeeInfo Edit Menu ***");
			System.out.println("1. Edit Id");
		    System.out.println("2. Edit Name");
		    System.out.println("3. Edit Email");
		    System.out.println("4. View Phone");
		    System.out.println("5. Exit");
		    System.out.println("Select one number between 1 - 5:");
		    num = input.nextInt();
		    if (num == 1) {
		    	System.out.print("Attendee ID:");
				int id = input.nextInt();
				attendee.setId(id);
		        }
		    else if (num == 2) {
		    	System.out.print("Attendee name:");
				String name = input.next();
				attendee.setName(name);
		        }
		    else if (num == 3) {
		    	System.out.print("Email address:");
				String email = input.next();
				attendee.setEmail(email);
		    }
		    else if (num == 4) {
		    	System.out.print("Phone number:");
				String phone = input.next();
				attendee.setPhone(phone);
		        }
		    else if (num == 5) {
		    	System.out.print("The group:");
				String group = input.next();
				attendee.setGroup(group);
		    }
		    else {
		    	continue;
		         } //if 
			  }	//while
			break;
		   } //if
	    } //for
	}
	
	public void viewAttendee() {
//		System.out.print("Attendee ID:");
//		int attendeeId = input.nextInt();
		System.out.println(" # of registered attendees: " + attendees.size());
		for (int i = 0; i<attendees.size(); i++) {
			attendees.get(i).printInfo();
		}
	}
}
