/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */

package finalproject;

import java.util.ArrayList;
import java.util.HashMap;

/* 
 * this class takes a data file that the user enters and reads it 
 * using the hashmap created by the primary data class, it assigns xG values (probabilities) to the shot data entered by the user
 */

public class SecondaryShotData {

	// filename of the file to be read
	
	String filename;

	// stores the hashmap of all the shot situations and their associated xG values
	PrimaryShotData primary = new PrimaryShotData ();
	HashMap <ArrayList <Integer>,  Double> all_xG_values = primary.processShotData();

	// the new hashmap that will store the user's shot data and their newly assigned xG values 

	HashMap <ArrayList <Integer>,  Double> user_xG_values = new HashMap <ArrayList <Integer>,  Double> ();


	// initialize object of this class with the filename to be read
	
	public SecondaryShotData (String filename) { 
		this.filename = filename;
	}
	
	
	// read through the user's shot file and assign xG values 
	
	public HashMap <ArrayList <Integer>, Double> readUserData () {  
		
		ReadFile reader = new ReadFile (filename);

		String row = reader.readLine();

		// called again so that the first row (column names is excluded)
		row = reader.readLine();
		
		// go through all the data rows

		while (row != null) { 

			// splitting on commas because it is a CSV file
			String [] data_row = row.split(","); 

			// the search key will be used to find the xG value associated with the particular type of shot
			ArrayList <Integer> search_key = new ArrayList <Integer> ();

			// this key will be used as the unique identifier of shots from the user's file
			ArrayList <Integer> key = new ArrayList <Integer> ();

			// tells you which team had the shot (team 1 or team 2)
			int team = Integer.parseInt(data_row[0]);
			// tells you which minute the shot was attempted 
			int min = Integer.parseInt(data_row[1]);
			// tells you the location of the shot (number coded) 
			int location = Integer.parseInt(data_row[2]);
			// tells you the type of assist that let to the shot (number coded) 
			int assist_method = Integer.parseInt(data_row[3]);
			// tells you the game situation in which the shot was taken (number coded) 
			int game_situation = Integer.parseInt(data_row[4]);
			// tells you if it was a goal or not. goal is 1, no goal is 0
			int is_Goal = Integer.parseInt(data_row[5]);
			// tells you what number the shot was in the game, also serves as a unique identifier 
			int shot_no = Integer.parseInt(data_row[6]);

			search_key.add(location);
			search_key.add(assist_method);
			search_key.add(game_situation);  

			key.add(team);
			key.add(min);
			key.add(location);
			key.add(assist_method);
			key.add(game_situation);  
			key.add(is_Goal);
			key.add(shot_no);

			double xG_value = all_xG_values.get(search_key);

			user_xG_values.put(key, xG_value);
			
			row = reader.readLine();

		}

		return user_xG_values;


	}






}
