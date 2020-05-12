package attendee;

import java.util.Scanner;

public class ElementarySchoolAttendee extends TeenageAttendee {
	
	protected String parentPhone;
	protected String parentEmail;
	
	public ElementarySchoolAttendee(AttendeeKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
	 	setAttendeeID(input);
	 	setAttendeeName(input);
	 	setAttendeeEmailwithYN(input);		
	 	setParentEmailwithYN(input);
		setAttendeePhone(input);
		setAttendeeGroup(input);
			}
	
	public void setParentEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
		System.out.print("Do you have a parent's Email address? (Y/N)");
		answer = input.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
			setAttendeeEmail(input);
			break;
			
		}
		else if (answer == 'n' || answer == 'N') {
			this.setEmail("");
			break;
		}
		else {
		}
	}
		
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println(" kind: " + skind + " name: " + name + " id: " + id + " email: " + email + " phone: " + phone + " parent's email: " + email + " parent's phone: " + phone + " group: " + group);
	}
	

}
