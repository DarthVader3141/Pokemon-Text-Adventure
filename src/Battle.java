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
		
		AI ai = new AI(enemyPokemon);
		
	//	BattleMenu bmenu = new BattleMenu(move1,move2); //create a new BattleMenu with the moves availale to the player
		
		while (friendlyPokemon.getHealth() > 0 && enemyPokemon.getHealth() > 0) { //loop until one pokemon dies
			
			friendlyPokemon.printAttributes(); //print the stats of both pokemon
			enemyPokemon.printAttributes();
			
			BattleMenu bmenu = new BattleMenu(move1,move2);
			
			bmenu.displayMenu(); //display the moves available to the player
			
			Move choice = bmenu.getInput(); //assign the chosen move from the menu to 'choice'
			Move aiChoice = ai.getMove(); //get the AI's move
			
			System.out.println("" + friendlyPokemon.getName() + " uses " + choice.getName() + " and does " + friendlyPokemon.getAttack() * choice.getDamage() + " damage."); //tell the user what it used
			
			enemyPokemon.setHealth(enemyPokemon.getHealth()- friendlyPokemon.getAttack() * choice.getDamage()); //set the health of the enemy to it's current health - the friendly's attack * the damage of the move		
			
			if (enemyPokemon.getHealth() <= 0) {
				
				System.out.println();
				System.out.println(enemyPokemon.getName() + " has fainted. You win!");
				return;
				
			}
			
			Thread.sleep(1000); //wait for 1 second
			
			System.out.println("" + enemyPokemon.getName() + " uses " + choice.getName() + " and does " + enemyPokemon.getAttack() * aiChoice.getDamage() + " damage.");//tell which move the AI used and how much damag it did
			
			friendlyPokemon.setHealth(friendlyPokemon.getHealth()- enemyPokemon.getAttack() * aiChoice.getDamage()); //set the player's pokemon's health based on the ai's move and attack
			
			if (friendlyPokemon.getHealth() <= 0) { //if you have than 0 HP, print "You lose" and return 
				
				System.out.println();
				System.out.println(friendlyPokemon.getName() + " has fainted. You lose!");
				return;
			
			}
			
			Thread.sleep(1000); //wait for 1 second
			
			System.out.println(); //add a blank line for aesthetics
			
		}
		
		
		
		
	
	}

}
