package attendee;

import java.util.Scanner;

public class HighSchoolAttendee extends Attendee {

public void getUserInput(Scanner input) {
 	System.out.print("Attendee ID:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Attendee name:");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
		System.out.print("Do you have an Email address? (Y/N)");
		answer = input.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
			System.out.print("Email address:");
			String email = input.next();
			this.setEmail(email);
			break;
			
		}
		else if (answer == 'n' || answer == 'N') {
			this.setEmail("");
			break;
		}
		else {
		}
		}
		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("The group:");
		String group = input.next();
    	this.setGroup(group);
		}

    }
