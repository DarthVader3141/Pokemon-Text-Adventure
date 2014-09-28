import java.lang.Math;

public class AI {
	
	Pokemon pokemon;
	
	public AI(Pokemon pokemon) { //tell the AI what pokemon it has
		
		this.pokemon = pokemon;
		
	}
	
	public Move getMove() { //choose a move to use
		
		Move move1 = pokemon.getMove1();
		Move move2 = pokemon.getMove1();
		Move chosenMove = null; //move to be returned
		
		int rand = (int) Math.random()*2; //generate a random int that is 1 or 2
		
		if (rand == 1) {
			chosenMove = move1; //return the chosen move
		}
		
		else {
			chosenMove = move2;
		}
		
		return chosenMove;
		
	}

}
