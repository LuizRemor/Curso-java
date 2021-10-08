package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\Temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			//OU ---- br = new BufferedReader(fr = new FileReader(path));
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			
				try {
				
				if (br != null) {
					br.close();
					}
				if (br != null) {
					fr.close();
					}
				}
				catch (IOException e ) {
					e.printStackTrace();
					}
		}
	}

}
