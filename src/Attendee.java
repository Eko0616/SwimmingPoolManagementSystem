package attendee;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class  Attendee implements AttendeeInput{
	protected AttendeeKind kind = AttendeeKind.University;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String group;
	
	public Attendee() {
	}
	
	public Attendee(AttendeeKind kind) {
		this.kind = kind;
	}
	
	public Attendee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Attendee(String name, int id, String email, String phone, String group) {		
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.group = group;
	}
	
	public Attendee(AttendeeKind kind,String name, int id, String email, String phone, String group) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.group = group;
	}
	public AttendeeKind getKind() {
		return kind;
	}

	public void setKind(AttendeeKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {			
			throw new EmailFormatException();
		}
		
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public abstract void printInfo();
	
	 public void setAttendeeID(Scanner input) {
	    	System.out.print("Attendee ID:");
			int id = input.nextInt();
			this.setId(id);
	    }
	    
	    public void setAttendeeName(Scanner input) {
	    	System.out.print("Attendee name:");
			String name = input.next();
			this.setName(name);
	    }

	    public void setAttendeeEmail(Scanner input) {
	    	String email = "";
	    	while(!email.contains("@")) {
	    	System.out.print("Email address:");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			  }
	       }
	    }
	    
	    public void setAttendeePhone(Scanner input) {
	    	System.out.print("Phone number:");
			String phone = input.next();
			this.setPhone(phone);
	    }
	    
	    public void setAttendeeGroup(Scanner input) {
	    	System.out.print("The group:");
			String group = input.next();
			this.setGroup(group);
	    }
	    
	    public String getKindString() {
			String skind = "none";
			switch(this.kind) {
			case University:
				skind = "Univ.";
				break;
			case HighSchool:
				skind = "High";
				break;
			case MiddleSchool:
				skind = "Middle";
				break;
			case ElementarySchool:
				skind = "Elementary";
				break;
			default:
			}
			return skind;
		}
}

