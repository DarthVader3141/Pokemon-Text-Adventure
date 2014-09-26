import java.util.Scanner;
import java.io.*;
public class PokemonList {
	public static void main(String[] args) throws IOException{
		String pokemon1;
		Scanner fileScan,pokemonScan;
		fileScan = new Scanner(new File("PokemonListGen1"));
		while (fileScan.hasNext()){
			pokemon1 = fileScan.nextLine();
			pokemonScan=new Scanner(pokemon1);
			pokemonScan.useDelimiter("     ");
			while(pokemonScan.hasNext()){
				System.out.print("   " + pokemonScan.next());
			}
			System.out.println();
		}
	}
}
