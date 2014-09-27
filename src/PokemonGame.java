import java.io.IOException;

public class PokemonGame {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        Move splash = new Move("Splash", 5, Type.WATER);
        Move flamethrower = new Move("Flamethrower", 5, Type.FIRE);
        
        StatsFile stats = new StatsFile(); //instance of the StatsFile (to avoid static methods)
        
        Pokemon communistMudkip = new Pokemon("Bob",50,2,2,2,Type.FIRE, splash, flamethrower); //defines two Pokemon following the constructor
        Pokemon enemyMudkip = new Pokemon("Steve",50,3,3,3,Type.WATER, splash, flamethrower);
        
        Battle battle = new Battle(communistMudkip, enemyMudkip);
        
        battle.runBattle();
                
//        BattleMenu bMenu = new BattleMenu(splash, flamethrower); //create a new menu with the two moves
        
/*        while (enemyMudkip.getHealth() > 0 && communistMudkip.getHealth() > 0){ //loops until one Pokemon dies
        	
        	communistMudkip.printAttributes(); //print both pokemon's stats before a move is used
            enemyMudkip.printAttributes();
            
            bMenu.displayMenu(); //displays the moves in order
            
            int input = bMenu.getInput(); //gets the next integer from command line
        
switch (input) { //different cases for each integer choice, if a case is not here, does nothing
            
                case 1:
                    enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 5)); //damage the enemy using an arbitrary multiplier
                case 2:
                    enemyMudkip.setHealth(enemyMudkip.getHealth() - (communistMudkip.getAttack() * 4));
                }
        } 
       System.out.println("You win!"); //upon one Pokemon dying, print "You win" */
    }

}


