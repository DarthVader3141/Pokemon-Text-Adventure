public class PokemonGame {

	public static void main(String[] args) {
		
//		Pokemon[] pokemon = new Pokemon[10];
		
		Pokemon poke = new Pokemon();
		
		poke = assignBaseStats();
		
		System.out.println("Pokemon #0");
		System.out.println("Species = " + poke.speciesName);
		System.out.println("Max HP = " + poke.maxHP);
		System.out.println("Current HP = " + poke.currentHP);
		System.out.println("Speed = " + poke.speed);
		System.out.println("Attack = " + poke.attack);
		System.out.println("Defense = " + poke.defense);		

	}
	
	public static Pokemon assignBaseStats() {

			Pokemon pokemonassign = new Pokemon();
			
//			if (type == "Charmander") {
				pokemonassign.speed = 10;
				pokemonassign.attack = Pokemon.Charmander.baseAttack;
				pokemonassign.defense = Pokemon.Charmander.baseDefense;
				pokemonassign.maxHP = Pokemon.Charmander.baseMaxHP;
				pokemonassign.speciesName = "Charmander";
				pokemonassign.currentHP = pokemonassign.maxHP;
//			}
			
		return pokemonassign;
	}

}

