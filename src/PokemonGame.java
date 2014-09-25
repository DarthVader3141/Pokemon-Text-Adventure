public class PokemonGame {

	public static void main(String[] args) {
		
		String move1 = "Flamestrike";
		String move2 = "Thundershock";
		
		Pokemon communistMudkip = new Pokemon("Joe",50,2,2,2);
		Pokemon enemyMudkip = new Pokemon("Steve",50,3,3,3);
		
		BattleMenu bMenu = new BattleMenu(move1,move2);
		
//		communistMudkip.setHealth(1337);
		

		communistMudkip.printAttributes();
		enemyMudkip.printAttributes();
		
		bMenu.displayMenu();
	
		int input = bMenu.getInput();
		
		switch (input) {
			
			case 1:
				enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 2));
			case 2:
				enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 3));
		}
		
		communistMudkip.printAttributes();
		enemyMudkip.printAttributes();
		
	}

}

