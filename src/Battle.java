import java.io.IOException;


public class Battle {
	
	Pokemon friendlyPokemon; //create the two Pokemon battling
	Pokemon enemyPokemon;
	
	public Battle(Pokemon friendlyPokemon, Pokemon enemyPokemon) {
		
		this.friendlyPokemon = friendlyPokemon; //assign each Pokemon passed by the call to a local Pokemon
		this.enemyPokemon = enemyPokemon;
		
	}
	
	public void runBattle() throws IOException, InterruptedException {
		
		Move move1 = friendlyPokemon.getMove1();
		Move move2 = friendlyPokemon.getMove2();
		
	//	BattleMenu bmenu = new BattleMenu(move1,move2); //create a new BattleMenu with the moves availale to the player
		
		while (friendlyPokemon.getHealth() > 0 && enemyPokemon.getHealth() > 0) { //loop until one pokemon dies
			
			friendlyPokemon.printAttributes(); //print the stats of both pokemon
			enemyPokemon.printAttributes();
			
			BattleMenu bmenu = new BattleMenu(move1,move2);
			
			bmenu.displayMenu(); //display the moves available to the player
			
			Move choice = new Move(null, 0, null);
			
			choice = bmenu.getInput(); //assign the chosen move from the menu to 'choice'
			
			System.out.println("" + friendlyPokemon.getName() + " uses " + choice.getName() + " and does " + friendlyPokemon.getAttack() * choice.getDamage() + " damage.");
			
			enemyPokemon.setHealth(enemyPokemon.getHealth()- friendlyPokemon.getAttack() * choice.getDamage()); //set the health of the enemy to it's current health - the friendly's attack * the damage of the move		
					
			Thread.sleep(2000);
			
			System.out.println();
			
//			Runtime.getRuntime().exec("cls"); //clear the console
		}
		
		
		
		
	
	}

}
