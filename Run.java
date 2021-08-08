/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */

package finalproject;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run  {

	public static void main(String[] args) {

		JFrame frame = new JFrame ();

		HomeScreenComponent comp1 = new HomeScreenComponent();

		frame.add(comp1);

		frame.setBounds(0, 0, 1000, 600);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		frame.setResizable(false);

		JPanel home_panel = new JPanel ();

		home_panel.setBounds(30, 500, 20, 20);

		JButton home_input_file = new JButton ("Input file for analysis");

		ShotMapFrame listener1 = new ShotMapFrame (frame);

		home_input_file.addActionListener(listener1);

		home_panel.add(home_input_file, BorderLayout.EAST); 

		frame.add(home_panel);
		
		home_panel.setVisible(true);

		home_input_file.revalidate();
		
		


	}

}
