package jump;

import java.util.ArrayList;
import java.util.Scanner;

import attendee.Attendee;
import attendee.AttendeeKind;
import attendee.AttendeeInput;
import attendee.ElementarySchoolAttendee;
import attendee.HighSchoolAttendee;
import attendee.UniversityAttendee;

public class AttendeeManager {
	ArrayList<AttendeeInput> attendees = new ArrayList<AttendeeInput>();	
	Scanner input;
	AttendeeManager(Scanner input) {
		this.input = input;	
	}
	public void addAttendee() {
		int kind = 0;
		AttendeeInput attendeeInput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
		System.out.println("1 for University");
		System.out.println("2 for High School");
		System.out.println("3 for Middle School");
		System.out.println("4 for Elementary School");
		System.out.print("Select num for Attendee Kind between 1 and 4:");
		kind = input.nextInt();
		if (kind == 1) {
			attendeeInput = new UniversityAttendee(AttendeeKind.University);
			attendeeInput.getUserInput(input);
			attendees.add(attendeeInput);
			break;
		}
		else if (kind ==2) {
			attendeeInput = new HighSchoolAttendee(AttendeeKind.HighSchool);
			attendeeInput.getUserInput(input);
			attendees.add(attendeeInput);
			break;
		}
		else if (kind ==3) {
			attendeeInput = new HighSchoolAttendee(AttendeeKind.HighSchool);
			attendeeInput.getUserInput(input);
			attendees.add(attendeeInput);
			break;
		}
		else if (kind ==4) {
			attendeeInput = new ElementarySchoolAttendee(AttendeeKind.ElementarySchool);
			attendeeInput.getUserInput(input);
			attendees.add(attendeeInput);
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
		int index = findIndex(attendeeId);
		removefromAttendees(index, attendeeId);
					
	}
	
	public int findIndex(int attendeeId) {
		int index = -1;
		for (int i = 0; i<attendees.size(); i++) {
			if (attendees.get(i).getId() == attendeeId) {
				index = i;
				break;
			}
		}
		return index;
	}
			
	public int removefromAttendees(int index, int attendeeId) {
		if (index >= 0) {
			attendees.remove(index);
		System.out.println("the attendee " +attendeeId + " is deleted");
		return 1;
		}
		else {
			System.out.println("the attendee has not been registered");	
			return -1;
		}
		
	}
	
	public void editAttendee() {
		System.out.print("Attendee ID:");
		int attendeeId = input.nextInt();
		for (int i = 0; i<attendees.size(); i++) {
			AttendeeInput attendee = attendees.get(i);
		if (attendee.getId() == attendeeId) {
			int num = -1;
			while(num != 5) {
				showEditMenu();			
		    num = input.nextInt();
		    switch(num) {
		    case 1:
		    	attendee.setAttendeeID(input);
		    	break;
		    case 2:
		    	attendee.setAttendeeName(input);
		    	break;
		    case 3:
		    	attendee.setAttendeeEmail(input);
		    	break;
		    case 4:
		    	attendee.setAttendeePhone(input);
		    	break;
		    case 5:
		    	attendee.setAttendeeGroup(input);
		    	break;
		    default:
		    	continue;
		        }
			  }	//while
			break;
		   } //if
	    } //for
	}
	
	public void viewAttendee() {
		System.out.println(" # of registered attendees: " + attendees.size());
		for (int i = 0; i<attendees.size(); i++) {
			attendees.get(i).printInfo();
	   }
	}
    public void schedulecheck () {
    	System.out.println("스케줄을 확인하세요");
    	System.out.println(" A group (M W F) 18:30 - 19:50 ");
    	System.out.println(" B group (M W F) 16:30 - 17:50 ");
    	System.out.println(" C group (Tue S) 18:30 - 19:50 ");
    	System.out.println(" D group (Tue S) 16:30 - 17:50 ");
    	System.out.println(" F group (W F) 15:30 - 16:50 ");
    	System.out.println(" WK group (S) 11:30 - 12:50 , 13:30 - 14:50 ");
	}
    
   


	public void showEditMenu() {
		System.out.println("*** AttendeeInfo Edit Menu ***");
		System.out.println("1. Edit Id");
	    System.out.println("2. Edit Name");
	    System.out.println("3. Edit Email");
	    System.out.println("4. View Phone");
	    System.out.println("5. Exit");
	    System.out.println("Select one number between 1 - 5:");
		
	  }
	}
