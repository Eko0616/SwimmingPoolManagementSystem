package jump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	   static EventLogger Logger = new EventLogger("log.txt");
	   public static void main(String[] args) {
		  
	      Scanner input = new Scanner(System.in);
	      AttendeeManager attendeeManager = getObject("attendeemanager.ser");
	      if (attendeeManager == null) {
	    	  attendeeManager = new AttendeeManager(input);
	      }
	      else {
	    	  attendeeManager.setScanner(input);
	      }
	     selectMenu(input, attendeeManager);
	     putObject(attendeeManager, "attendeemanager.ser");
	  }
	  
	  public static void selectMenu(Scanner input, AttendeeManager attendeeManager )  {
		  int num = -1;
	      while(num != 6) {
	    	  try {
	    	  showMenu();
	       num = input.nextInt();
	       switch(num) {
	       case 1:
	    	   attendeeManager.addAttendee();
	    	   Logger.log("add a attendee");
	    	   break;
	       case 2:
	    	   attendeeManager.deleteAttendee();
	    	   Logger.log("delete a attendee");
	    	   break;
	       case 3:
	    	   attendeeManager.editAttendee();
	    	   Logger.log("edit a attendee");
	    	   break;
	       case 4:
	    	   attendeeManager.viewAttendee();
	    	   Logger.log("view a attendee");
	    	   break;
	       case 5:
	    	   attendeeManager.schedulecheck();
	    	   Logger.log("schedulecheck");
	    	   break;
	       default:
	    	   continue;
	           }  
	       }
	    	  catch(InputMismatchException e) {
	    		  System.out.println("Please put an integer between 1 and 6!");
	    		  if(input.hasNext()) {
	    			  input.next();
	    		  }
	    		  num = -1;	  
	    	  }
	      }
	  }
	     
	   public static void showMenu() {
		   System.out.println("*** SwimmingPool Attendee Management System Menu ***");
		      System.out.println("1. Add Attendee");
		       System.out.println("2. Delete Attendee");
		       System.out.println("3. Edit Attendee");
		       System.out.println("4. View Attendee");
		       System.out.println("5. Schedule Line");
		       System.out.println("6. Exit");
		       System.out.println("Select one number between 1 - 6:");  
	   }
	  public static AttendeeManager getObject(String filename) {
			AttendeeManager attendeeManager = null;
		try {
				FileInputStream file = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(file);
				
				attendeeManager = (AttendeeManager) in.readObject();
				
				in.close();
				file.close();
		} catch (FileNotFoundException e) {
				return attendeeManager;
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

			return attendeeManager;
		}

	public static void putObject(AttendeeManager attendeeManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(attendeeManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
