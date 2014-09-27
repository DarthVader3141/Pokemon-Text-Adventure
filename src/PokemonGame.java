import java.io.IOException;

public class PokemonGame {

    public static void main(String[] args) throws IOException {
        
        String move1 = "Flamestrike"; //to be replaced with Move objects
        String move2 = "Thundershock";
        
        StatsFile stats = new StatsFile(); //instance of the StatsFile (to avoid static methods)
        
        Pokemon communistMudkip = new Pokemon(stats.getLine(4),50,2,2,2,Type.FIRE); //defines two Pokemon following the constructor
        Pokemon enemyMudkip = new Pokemon("Steve",50,3,3,3,Type.WATER);
        
        BattleMenu bMenu = new BattleMenu(move1,move2); //create a new menu with the two moves
        
        //      communistMudkip.setHealth(1337);
        while (enemyMudkip.getHealth()>0 && communistMudkip.getHealth()>0){ //loops until one Pokemon dies
        	
        	communistMudkip.printAttributes(); //print both pokemon's stats before a move is used
            enemyMudkip.printAttributes();
            
            bMenu.displayMenu(); //displays the moves in order
            
            int input = bMenu.getInput(); //gets the next integer
        
            switch (input) { //different cases for each integer choice, if a case is not here, does nothing
            
                case 1:
                    enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 2));
                case 2:
                    enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 3));
                }
        }
       System.out.println("You win!"); //upon one Pokmeon dying, print "You win"
    }

}


