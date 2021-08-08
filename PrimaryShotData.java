/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */

package finalproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
 * this class reads the shot data from the events data file (the primary data source for this project)
 * it then stores this data in a hash map, a data structure that can easily be reused later on 
 */

public class PrimaryShotData {

	ReadFile reader = new ReadFile ("events.csv");

	String row = reader.readLine();

	String [] data_row; 

	HashMap <ArrayList <Integer>, ArrayList <Integer>> shots = new HashMap <ArrayList <Integer>, ArrayList <Integer>> ();

	HashMap <ArrayList <Integer>, Double> xG = new HashMap <ArrayList <Integer>, Double> ();


	/*
	 * method to read all the shot data from the file into a dictionary 
	 * dictionary will map all possible shot situations to their total shots and total goals 
	 */

	public HashMap <ArrayList <Integer>, ArrayList <Integer>> readShotData () { 
		// called again so that the first row (column names is excluded)
		row = reader.readLine();

		// go through all the data rows

		while (row != null) { 

			// splitting on commas because it is a CSV file
			String [] data_row = row.split(","); 

			// to get the type of event; we're only interested in shots (event #1)
			int event_type = Integer.parseInt(data_row[4]);

			// the key will be a [location, game situation, assist method]
			ArrayList <Integer> key = new ArrayList <Integer> ();

			// the value will be [total shots, total goals]
			ArrayList <Integer> value = new ArrayList <Integer> ();

			// meaning the event was a shot

			if (event_type == 1 ) { 
				// tells you if it was a goal or not. goal is 1, no goal is 0
				int is_Goal = Integer.parseInt(data_row[15]);
				// tells you the location of the shot (number coded) 
				int location = Integer.parseInt(data_row[16]);
				// tells you the type of assist that let to the shot (number coded) 
				int assist_method = Integer.parseInt(data_row[18]);
				// tells you the game situation in which the shot was taken (number coded) 
				int game_situation = Integer.parseInt(data_row[19]);
				
				key.add(location);
				key.add(assist_method);
				key.add(game_situation);  

				// if key doesn't already exist in the dictionary then add it and its initial shot/goal values
				if (!shots.containsKey(key)) { 

					if (is_Goal == 1)  { 
						// 1 total shot 
						int total_shots = 1;
						value.add(total_shots);
						// 1 total goal
						int total_goals = 1;
						value.add(total_goals);
					}

					else { 
						// 1 total shot 
						int total_shots = 1;
						value.add(total_shots);
						// 0 total goals
						int total_goals = 0;
						value.add(total_goals);
					}

					shots.put(key, value);

				} 

				// if the key already exists in the dictionary 
				else { 

					if (is_Goal == 1)  { 

						value = shots.get(key);

						int total_shots = value.get(0);
						int total_goals = value.get(1);

						// increase total shots by 1, increase total goals by 1
						value.set(0,  total_shots+1);
						value.set(1,  total_goals+1);

						// updates the value of the key
						shots.put(key, value);

					}

					else { 

						value = shots.get(key);

						int total_shots = value.get(0);


						// only need to increase total shots by 1 since no goal was scored
						value.set(0,  total_shots+1);

						// updates the value of the key
						shots.put(key, value);

					}

				}



			}






			row = reader.readLine (); 

		}

		return shots;


	}

	/*
	 *  method that changes the values of the keys in the shot hash map to xG values (goal probabilities) 
	 *  xG values are calculated by dividing the total number of shots taken in a given match situation by the total number of goals scored from that situation 
	 *  the output of this method is ultimately what we're interested in 
	 */


	public HashMap <ArrayList <Integer>, Double> processShotData () { 

		// get the shot hashmap that hasn't been processed yet

		shots = readShotData ();   

		// loop through the shot hashmap keys and update the values 

		for(Map.Entry<ArrayList <Integer>, ArrayList <Integer>> pair : shots.entrySet()) {

			ArrayList <Integer> key = pair.getKey();
			ArrayList <Integer> value = pair.getValue();

			// total goals divided by total shots -- the definition of an xG value

			// cast one value to avoid integer division
			double xGvalue = ((double)value.get(1)/value.get(0));

			// add to the xG hashmap

			xG.put(key, xGvalue);


		}



		return xG;

	}















}
