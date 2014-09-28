import java.io.IOException;

public class PokemonGame {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        Move splash = new Move("Splash", 4, Type.WATER);
        Move flamethrower = new Move("Flamethrower", 5, Type.WATER);
        
 //     StatsFile stats = new StatsFile(); //instance of the StatsFile (to avoid static methods) (not used unless Pokemon are defined with the file)
        
        Pokemon communistMudkip = new Pokemon("Bob",50,3,3,3,Type.FIRE, splash, flamethrower); //defines two Pokemon following the constructor
        Pokemon enemyMudkip = new Pokemon("Steve",50,3,3,3,Type.WATER, splash, flamethrower);
        
        Battle battle = new Battle(communistMudkip, enemyMudkip);//create an instance of Battle with the two Pokemon, the first being player-controlled
        
        battle.runBattle(); //run the battle
        
    }

}


