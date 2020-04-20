package attendee;

import java.util.Scanner;

public class Attendee {
	protected AttendeeKind kind = AttendeeKind.University;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String group;
	
	public Attendee() {
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

	public void setEmail(String email) {
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

	public void printInfo() {
		System.out.println(" name: " + name + " id: " + id + " email: " + email + " phone: " + phone + "group: " + group);
	}


    public void getUserInput(Scanner input) {
    	System.out.print("Attendee ID:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Attendee name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Email address:");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("The group:");
		String group = input.next();
    	this.setGroup(group);
    }
 
}

