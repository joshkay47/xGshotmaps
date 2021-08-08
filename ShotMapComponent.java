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
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/* 
 * this class draws an xG shot map using the data file that the user inputs 
 * number coded locations are transformed into locations on the screen 
 * circles are drawn on each location a shot was taken; circle size is proportional to xG value
 * home team is drawn in red, away team is drawn in blue
 */

public class ShotMapComponent extends JComponent {

	HashMap <ArrayList <Integer>,  Double> xGs = new HashMap <ArrayList <Integer>,  Double> ();

	Image pitch_background;

	public ShotMapComponent (HashMap <ArrayList <Integer>,  Double> xGs) { 

		this.xGs = xGs;

	}


	public void paintComponent(Graphics g) {
		
		// total xG for home team
		double H_totalxG = 0;

		// total xG for away team
		double A_totalxG = 0;

		Graphics2D g2 = (Graphics2D) g;  

		// background (football pitch) on which the xG shot map will be drawn
		try {
			pitch_background = ImageIO.read(new File("C:\\Users\\Josh\\Desktop\\School\\Computer Science 1\\files\\pitch.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("Check file path to pitch image");
		}

		g2.drawImage(pitch_background, 0, 0, null);

		// loop through the hashmap to get the necessary data points and present them visually

		for(Map.Entry<ArrayList <Integer>,  Double> data_point : xGs.entrySet()) {

			ArrayList <Integer> key = data_point.getKey();
			Double xGvalue = data_point.getValue();

			// if the data point is for team 1 
			if (key.get(0) == 1) { 

				// a slightly transparent red
				int alpha = 140; 
				Color red = new Color(255, 0, 0, alpha);
				
				g2.setPaint(red);
				int location = key.get(2); 

				g2.setFont(new Font("SansSerif", Font.BOLD, 20));

				// to represent the home team
				g2.drawString("H", 320, 260);

				// transforming number coded locations into locations on the screen 

				
				// attacking half (right past the halfway line)
				
				if (location == 1) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(380, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;   
					
				
					

				}

				// defensive half (right before the halfway line)
				else if (location == 2) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(320, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;


				}

				// centre of the box
				else if (location == 3) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(570, 210, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// left wing
				else if (location == 4) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(580, 80, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;


				}

				// right wing

				else if (location == 5) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(580, 400, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// difficult angle, long range

				else if (location == 6) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(490, 100, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}


				// difficult angle on the left
				else if (location == 7) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(530, 130, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;


				}

				// difficult angle on the right
				else if (location == 8) { 


					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(530, 350, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;


				}

				// left side of box

				else if (location == 9) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(580, 150, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// left side of six yard box
				else if (location == 10) { 

					Ellipse2D.Double circle = new Ellipse2D.Double(620, 200, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// right side of the box
				else if (location == 11) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(580, 330, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// right side of six yard box

				else if (location == 12) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(620, 280, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// very close range

				else if (location == 13) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(630, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}


				// penalty spot
				else if (location == 14) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(570, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// outside of the box

				else if (location == 15 ) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(530, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;


				}

				// long range

				else if (location == 16 ) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(490, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// more than 35 yards 
				else if (location == 17) { 


					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(450, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}

				// more than 40 yards 
				else if (location == 18) { 


					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(410, 240, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					H_totalxG += xGvalue;

				}


			}

			// if the data point is for team 2 


			else { 

				// a slightly transparent blue
				int alpha = 140; 
				Color blue = new Color(0, 0, 255, alpha);
				
				g2.setPaint(blue);

				int location = key.get(2);

				// to represent the away team

				g2.setFont(new Font("SansSerif", Font.BOLD, 20));

				g2.drawString("A", 370, 260);

				// transforming number coded locations into locations on the screen

				// attacking half (just past halfway line)

				if (location == 1) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(320, 260, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// defensive half (just before the halfway line)

				else if (location == 2) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(380, 260, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// centre of the box
				else if (location == 3) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(90, 205, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// left wing
				else if (location == 4) { 

					Ellipse2D.Double circle = new Ellipse2D.Double(110, 400, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				//right wing

				else if (location == 5) { 

					Ellipse2D.Double circle = new Ellipse2D.Double(110, 80, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// difficult angle, long range
				else if (location == 6) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(200, 100, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// difficult angle on the left

				else if (location == 7) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(160, 350, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// difficult angle on the right

				else if (location == 8) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(160, 130, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;


				}

				// left side of the box
				else if (location == 9) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(110, 330, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;


				}

				// left side of six yard box

				else if (location == 10) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(70, 280, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// right side of box
				else if (location == 11) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(110, 150, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// right side of six yard box
				else if (location == 12) { 

					Ellipse2D.Double circle = new Ellipse2D.Double(150, 200, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// very close range
				else if (location == 13) { 


					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(55, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}


				// penalty spot
				else if (location == 14) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(90, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// outside of the box
				else if (location == 15 ) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(160, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;


				}

				// long range
				else if (location == 16 ) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(200, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;


				}

				// more than 35 yards 

				else if (location == 17) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(240, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

				// more than 40 yards
				else if (location == 18) { 

					// size of the circle will be a multiple of the xG value
					Ellipse2D.Double circle = new Ellipse2D.Double(280, 235, 10+40*xGvalue, 10+40*xGvalue);

					g2.draw(circle);

					g2.fill(circle);

					A_totalxG += xGvalue;

				}

			}




		}


		// write out the total xG value (sum of probabilities) for the away team
		g2.setColor(Color.BLUE);
		String A_totalxGs = String.format("%.2f", A_totalxG);
		g2.setFont(new Font("SansSerif", Font.BOLD, 15));
		g2.drawString("total xG: "+A_totalxGs, 350, 230);	
		

		// write out the total xG value (sum of probabilities) for the home team
		g2.setColor(Color.RED);
		String H_totalxGs = String.format("%.2f", H_totalxG);
		g2.setFont(new Font("SansSerif", Font.BOLD, 15));
		g2.drawString("total xG: "+H_totalxGs, 261, 290);	




	}
}
