package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import attendee.AttendeeInput;
import jump.AttendeeManager;

public class AttendeeViewer extends JPanel{
	
	WindowFrame frame;
	
	AttendeeManager attendeeManager;

	public AttendeeViewer(WindowFrame frame, AttendeeManager attendeeManager) {
		this.frame = frame;
		this.attendeeManager = attendeeManager;
		
		System.out.println("****" + attendeeManager.size() + "****");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("E-mail");
		model.addColumn("Contact Info.");
		model.addColumn("Group");
		
		for (int i=0; i< attendeeManager.size(); i++) {
			Vector row = new Vector();
			AttendeeInput ai = attendeeManager.get(i);
			row.add(ai.getId());
			row.add(ai.getName());
			row.add(ai.getEmail());
			row.add(ai.getPhone());
			row.add(ai.getGroup());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
