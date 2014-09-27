import java.io.*;

public class StatsFile {
	

	public String getLine(int line) throws IOException{ //method for returning a numbered line 
		
		String outputline = null; //initialize the line that will be returned
		int i = 0; //initialize counter

		FileInputStream fs= new FileInputStream("PokemonListGen1"); // io for getting data from files; raw stream of bits
		BufferedReader br = new BufferedReader(new InputStreamReader(fs)); //use a buffer from efficient reading
			
		while (i < line) { //run until counter reaches the desired line
//			br.readLine();
			outputline = br.readLine(); //set the next line to the string that will be returned
			i++;
		}
		
		return outputline; //return the last line read before the counter became greater than the line
	}
}
