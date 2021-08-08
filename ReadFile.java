/* 
 * Joshua Kalenga 
 * Final Project 
 * xG shot map app
 */



package finalproject;

import java.io.*; 

/*
 * Class to make it easier to read a CSV file 
 */

public class ReadFile {

	BufferedReader br;

	// read from a file named filename
	public ReadFile (String filename){
		String path = System.getProperty("user.dir");
		path += File.separator + "files" + File.separator;
		path += filename;
		try {
			File file = new File (path); 
			FileReader reader = new FileReader (file); 
			br = new BufferedReader(reader);
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			System.out.println("File not found" + path);
		}
	}     


	public String readLine ()
	{
		try {
			return br.readLine();
		} catch (IOException e) {
			// if the file is disconnected, return null which is the same as the end of the file
			return null;
		}
	}



}



