package attendee;

import java.util.Scanner;

public class HighSchoolAttendee extends TeenageAttendee{
	
	public HighSchoolAttendee(AttendeeKind kind) {
		super(kind);
	}

public void getUserInput(Scanner input) {
		setAttendeeID(input);
		setAttendeeName(input);
		setAttendeePhone(input);
		setAttendeeGroup(input);
		setAttendeeEmailwithYN(input);
		}

	
