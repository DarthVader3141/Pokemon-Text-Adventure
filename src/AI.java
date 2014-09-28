import java.util.Random;

public class AI {
	
	Pokemon pokemon;
	
	public AI(Pokemon pokemon) { //tell the AI what pokemon it has
		
		this.pokemon = pokemon;
		
	}
	
	public Move getMove() { //choose a move to use
		
		Move move1 = pokemon.getMove1();
		Move move2 = pokemon.getMove2();
		Move chosenMove = null; //move to be returned
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(2) + 1;; //generate a random int that is 1 or 2
		
		if (randInt == 1) {
			chosenMove = move1; //set the move to be returned to the choice
		}
		
		else {
			chosenMove = move2;
		}
		
		return chosenMove;
		
	}

}
