package attendee;

import java.util.Scanner;

package attendee;

import java.util.Scanner;

public class UniversityAttendee extends Attendee {
	
	public UniversityAttendee(AttendeeKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAttendeeID(input);
	 	setAttendeeName(input);
	 	setAttendeeEmail(input);
	 	setAttendeePhone(input);
		setAttendeeGroup(input);
    }
	
	public void printInfo() {
		String skind = getKindString();	
		System.out.println(" kind: " + skind + " name: " + name + " id: " + id + " email: " + email + " phone: " + phone + "group: " + group);
	}

}
