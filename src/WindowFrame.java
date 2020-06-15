package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import jump.AttendeeManager;

public class WindowFrame extends JFrame {
	
	AttendeeManager attendeeManager;
	
	MenuSelection menuselection;
	AttendeeAdder attendeeadder;
	AttendeeViewer attendeeviewer;
	
	
	public WindowFrame(AttendeeManager attendeeManager) {
		this.attendeeManager = attendeeManager;
		this.menuselection  = new MenuSelection(this);
		this.attendeeadder  = new AttendeeAdder(this);
		this.attendeeviewer  = new AttendeeViewer(this, this.attendeeManager);
		
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AttendeeAdder getAttendeeadder() {
		return attendeeadder;
	}

	public void setAttendeeadder(AttendeeAdder attendeeadder) {
		this.attendeeadder = attendeeadder;
	}

	public AttendeeViewer getAttendeeviewer() {
		return attendeeviewer;
	}

	public void setAttendeeviewer(AttendeeViewer attendeeviewer) {
		this.attendeeviewer = attendeeviewer;
	}
}
