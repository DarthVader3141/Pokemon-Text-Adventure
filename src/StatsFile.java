import java.util.Scanner;
import java.io.*;

public class StatsFile {
	

	public String getLine(int line) throws IOException{
		
		String linetoread = null;
		int i = 0;
/*		String pokemon1;
		
		Scanner fileScan,pokemonScan;
		fileScan = new Scanner(new File("PokemonListGen1"));
		
		while (fileScan.hasNext()){
			
			pokemon1 = fileScan.nextLine();
			pokemonScan=new Scanner(pokemon1);
			pokemonScan.useDelimiter("     ");
			while(pokemonScan.hasNext()){
				System.out.print("   " + pokemonScan.next());
			}
			*/
		FileInputStream fs= new FileInputStream("PokemonListGen1");
		BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			
		while (i < line) {
			br.readLine();
			linetoread = br.readLine();
			i++;
		}
		
		return linetoread;
	}
}
