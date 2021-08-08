/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */

package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class HomeScreenComponent extends JComponent {
	
	Image home_background;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		
		// background image of the app
		try {
			home_background = ImageIO.read(new File("C:\\Users\\Josh\\Desktop\\School\\Computer Science 1\\files\\pele.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("Check file path to background image");
		}
		
		g2.drawImage(home_background, 0, 0, null);

	    g2.setFont(new Font("SansSerif", Font.BOLD, 40));
	    
		g2.setColor(Color.BLACK);
		
		g2.drawString("Raumdata Football", 340, 70);
		
		
		g2.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		g2.setColor(Color.BLUE);
		
		g2.drawString("For coaches and analysts", 410, 550);                   
		
		
	}
	
	

}
