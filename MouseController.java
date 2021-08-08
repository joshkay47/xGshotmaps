package finalproject;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseController implements MouseMotionListener{
	HashMap <ArrayList <Integer>,  Double> xGs;
	public MouseController(HashMap <ArrayList <Integer>,  Double> xGs) {
		this.xGs = xGs;

	}
	@Override
	public void mouseMoved(MouseEvent e) {
		Point mouse_location = e.getPoint();
		// location 1, team 1 
		if (mouse_location.x >= 380 && mouse_location.x <= 385 && mouse_location.y ==  240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				// if there really is a location 1, team 1 in this dataset
				if (location == 1 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 1, team 2 
		if (mouse_location.x >= 320 && mouse_location.x <= 330 && mouse_location.y >=  260) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				// if there really is a location 1, team 2 in this dataset
				if (location == 1 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 2, team 1 
		if (mouse_location.x >= 320 && mouse_location.x <= 325 && mouse_location.y ==  240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 2 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 2, team 2
		if (mouse_location.x >= 380 && mouse_location.x <= 385 && mouse_location.y ==  260) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 2 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 3, team 1
		if (mouse_location.x >= 570 && mouse_location.x <= 585 && mouse_location.y ==  210) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 3 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 3, team 2
		if (mouse_location.x >= 90 && mouse_location.x <= 105 && mouse_location.y == 205) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 3 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 4, team 1
		if (mouse_location.x >= 580 && mouse_location.x <= 595 && mouse_location.y == 80) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 4 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}


		// location 4, team 2
		if (mouse_location.x >= 110 && mouse_location.x <= 125 && mouse_location.y == 400) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 4 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 5, team 1
		if (mouse_location.x >= 580 && mouse_location.x <= 595 && mouse_location.y == 400) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 5 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 5, team 2
		if (mouse_location.x >= 110 && mouse_location.x <= 125 && mouse_location.y == 80) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 5 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 6, team 1
		if (mouse_location.x >= 490 && mouse_location.x <= 505 && mouse_location.y == 100) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 6 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 6, team 2
		if (mouse_location.x >= 200 && mouse_location.x <= 215 && mouse_location.y == 100) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 6 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 7, team 1
		if (mouse_location.x >= 530 && mouse_location.x <= 545 && mouse_location.y == 130) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 7 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 7, team 2
		if (mouse_location.x >= 160 && mouse_location.x <= 175 && mouse_location.y == 350) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 7 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 8, team 1
		if (mouse_location.x >= 530 && mouse_location.x <= 545 && mouse_location.y == 350) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 8 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 8, team 2
		if (mouse_location.x >= 160 && mouse_location.x <= 175 && mouse_location.y == 130) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 8 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}


		// location 9, team 1
		if (mouse_location.x >= 580 && mouse_location.x <= 595 && mouse_location.y == 150) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 9 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 9, team 2
		if (mouse_location.x >= 110 && mouse_location.x <= 125 && mouse_location.y == 330) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 9 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 10, team 1
		if (mouse_location.x >= 620 && mouse_location.x <= 635 && mouse_location.y == 200) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 10 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 10, team 2
		if (mouse_location.x >= 70 && mouse_location.x <= 85 && mouse_location.y == 280) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 10 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 11, team 1
		if (mouse_location.x >= 580 && mouse_location.x <= 595 && mouse_location.y == 330) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 11 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 11, team 2
		if (mouse_location.x >= 110 && mouse_location.x <= 125 && mouse_location.y == 150) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 11 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 12, team 1
		if (mouse_location.x >= 620 && mouse_location.x <= 635 && mouse_location.y == 280) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 12 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 12, team 2
		if (mouse_location.x >= 150 && mouse_location.x <= 165 && mouse_location.y == 200) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 12 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}


		// location 13 for team 1
		if (mouse_location.x >= 630 && mouse_location.x <= 645 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 13 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 13 for team 2
		if (mouse_location.x >= 55 && mouse_location.x <= 70 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 13 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}


		// location 14 for team 1
		if (mouse_location.x >= 570 && mouse_location.x <= 585 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 14 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 14 for team 2
		if (mouse_location.x >= 90 && mouse_location.x <= 105 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 14 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 15 for team 1
		if (mouse_location.x >= 530 && mouse_location.x <= 545 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 15 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 15 for team 2
		if (mouse_location.x >= 160 && mouse_location.x <= 185 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 15 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 16 for team 1
		if (mouse_location.x >= 490 && mouse_location.x <= 505 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 16 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 16 for team 2
		if (mouse_location.x >= 200 && mouse_location.x <= 215 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 16 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 17 for team 1
		if (mouse_location.x >= 450 && mouse_location.x <= 455 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 17 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 17 for team 2
		if (mouse_location.x >= 240 && mouse_location.x <= 255 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 17 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 18 for team 1
		if (mouse_location.x >= 410 && mouse_location.x <= 425 && mouse_location.y == 240) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 18 && team == 1) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}

		// location 18 for team 2
		if (mouse_location.x >= 280 && mouse_location.x <= 295 && mouse_location.y == 235) { 
			for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {
				ArrayList <Integer> key = data_point.getKey();
				int location = key.get(2);
				int team = key.get(0);
				if (location == 18 && team == 2) { 
					JFrame frame = new JFrame ();
					MouseControlComponent comp = new MouseControlComponent (xGs, key);
					frame.setBounds(0, 0, 330, 200);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(comp);
					frame.setVisible(true);
					frame.setResizable(false);  
				}
			}
		}




	}


	@Override
	public void mouseDragged(MouseEvent e) {



	}



}
