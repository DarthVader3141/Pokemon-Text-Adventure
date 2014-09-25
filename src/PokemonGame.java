public class PokemonGame {

	public static void main(String[] args) {
		
		String move1 = "Flamestrike";
		String move2 = "Thundershock";
		
		Pokemon communistMudkip = new Pokemon(1,2,3,4);
		BattleMenu bMenu = new BattleMenu(move1,move2);
		
//		communistMudkip.setHealth(1337);
		
		bMenu.displayMenu();
		
		System.out.println("hello "+ communistMudkip.getHealth());
	}

}

