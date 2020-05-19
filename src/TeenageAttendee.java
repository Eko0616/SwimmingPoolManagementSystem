package attendee;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class TeenageAttendee extends Attendee {
	
	public TeenageAttendee(AttendeeKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
		
	@Override
	public void printInfo() {
		String skind = getKindString();
	System.out.println(" kind: " + skind + " name: " + name + " id: " + id + " email: " + email + " phone: " + phone + "group: " + group);
	}
	
	public void setAttendeeEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
		System.out.print("Do you have an Email address? (Y/N)");
		answer = input.next().charAt(0);
		try {
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
		catch(EmailFormatException e) {
			System.out.println("Incorrect Email Format. put the e-mail address that contains @");
	      }
		}
		}
}
