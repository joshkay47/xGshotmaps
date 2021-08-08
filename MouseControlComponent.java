



package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JComponent;

public class MouseControlComponent extends JComponent  {

	HashMap <ArrayList <Integer>,  Double> xGs;

	ArrayList <Integer> key;

	public MouseControlComponent(HashMap <ArrayList <Integer>,  Double> xGs, ArrayList <Integer> key) {
		this.xGs = xGs;
		this.key = key;

	}

	public void paintComponent (Graphics g) { 

		Graphics2D g2 = (Graphics2D) g;  
		int min = key.get(1);
		int assist_method = key.get(3);
		int game_situation = key.get(4);
		int is_Goal = key.get(5);


		double xGvalue = xGs.get(key);

		String xGvalue_s = String.format("%.2f", xGvalue);

		g2.setFont(new Font("SansSerif", Font.BOLD, 20));

		g2.drawString("Min: " +min, 5, 25);

		switch (assist_method) { 

		case 0: 
			g2.drawString("Assist method: None", 5, 50);
			break;

		case 1: 
			g2.drawString("Assist method: Pass", 5, 50);
			break;


		case 2: 
			g2.drawString("Assist method: Cross", 5, 50);
			break;


		case 3: 
			g2.drawString("Assist method: Headed pass", 5, 50);
			break;


		case 4: 
			g2.drawString("Assist method: Through ball", 5, 50);
			break;


		}

		switch (game_situation) { 

		case 1: 
			g2.drawString("Game situation: Open play", 5, 75);
			break;

		case 2: 
			g2.drawString("Game situation: Set piece", 5, 75);
			break;


		case 3: 
			g2.drawString("Game situation: Corner", 5, 75);
			break;


		case 4: 
			g2.drawString("Game situation: Free kick", 5, 75);
			break;


		}


		if (is_Goal == 0) { 
			g2.drawString("Miss", 5, 100);
		}

		else  { 
			g2.drawString("Goal", 5, 100);
		}

		g2.drawString("xG: "+xGvalue_s, 5, 125);	



	}

}




