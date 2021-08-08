/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */

package finalproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShotMapFrame implements ActionListener {

	JFrame oldframe;


	public ShotMapFrame(JFrame oldframe) {
		this.oldframe = oldframe;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		oldframe.dispose();

		JFrame frame = new JFrame ();

		frame.setBounds(0, 0, 700, 490);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String file_name;

		file_name = JOptionPane.showInputDialog("Enter the filename"); 

		SecondaryShotData get_data = new SecondaryShotData (file_name);

		HashMap <ArrayList <Integer>,  Double> xGs = get_data.readUserData();

		ShotMapComponent comp = new ShotMapComponent (xGs);

		frame.add(comp);

		frame.setVisible(true);

		frame.setResizable(false);  

		MouseController m_control = new MouseController (xGs);

		comp.addMouseMotionListener(m_control);
		






	}

}
