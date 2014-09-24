public class PokemonGame {

	public static void main(String[] args) {
		
		Pokemon[] pokemon = new Pokemon[10];

		for (int n = 0; n < 3; n ++ ){
			pokemon[n] = new Pokemon();
			pokemon[n].speed = Pokemon.Charizard.baseSpeed;
			pokemon[n].attack = Pokemon.Charizard.baseAttack;
			pokemon[n].defense =  Pokemon.Charizard.baseDefense;	
		}
		
		for (int n = 3; n < 6; n ++ ){
			pokemon[n] = new Pokemon();
			pokemon[n].speed = Pokemon.Bulbasaur.baseSpeed;
			pokemon[n].attack = Pokemon.Bulbasaur.baseAttack;
			pokemon[n].defense =  Pokemon.Bulbasaur.baseDefense;			
		}
		
		for (int n = 6; n < 10; n ++ ){
			pokemon[n] = new Pokemon();
			pokemon[n].speed = Pokemon.Squirtle.baseSpeed;
			pokemon[n].attack = Pokemon.Squirtle.baseAttack;
			pokemon[n].defense =  Pokemon.Squirtle.baseDefense;			
		}
		
		for (int n = 0; n < 10; n ++ ){
			System.out.println("Pokemon #" + n);
			System.out.println("Speed = " + pokemon[n].speed);
			System.out.println("Attack = " + pokemon[n].attack);
			System.out.println("Defense = " + pokemon[n].defense);
			System.out.println();
		}
	}

}
