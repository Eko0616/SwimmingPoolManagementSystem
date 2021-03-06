package attendee;
import java.util.Scanner;

import exception.EmailFormatException;

public interface AttendeeInput {

		public int getId();
		
		public void setId(int id);
		
		public String getEmail();
		
		public void setEmail(String email) throws EmailFormatException;
		
		public String getName();
		
		public void setName(String name);
		
		public String getPhone();
		
		public void setPhone(String phone);
		
		public String getGroup();
		
		public void setGroup(String group);
		
		public void getUserInput(Scanner input);
		
		public void printInfo();

		public void setAttendeeID(Scanner input);
		
		public void setAttendeeName(Scanner input);
		
		public void setAttendeeEmail(Scanner input);
		
		public void setAttendeePhone(Scanner input);
		
		 public void setAttendeeGroup(Scanner input);
		 

	}
