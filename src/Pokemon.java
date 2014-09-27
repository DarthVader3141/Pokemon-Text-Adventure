
public class Pokemon {
	
	String name;
	
	int health;
	int attack;
	int speed;
	int defense;
	
	Move move1;
	Move move2;
	
	Type type; //from enum of types
	
	public Pokemon(String name, int health, int attack, int speed, int defense, Type type, Move move1, Move move2) { //constructor for defining a new pokemon
		this.attack = attack;
		this.speed = speed;
		this.health = health;
		this.defense = defense;
		this.name = name;
		this.type = type;
		this.move1 = move1;
		this.move2 = move2;
	}
	

	public void setHealth(int health1) { //sets health
		health = health1;
	}
	
	public int getHealth() { //returns current health
		return health;
	}
	
	public int getAttack() { //returns attack - may later be modified to scale off of level
		return attack;
	}
	
	public int getSpeed() { //""
		return speed;
	}
	
	public int getDefense() { //""
		return defense;
	}
	
	public Type getType() { //returns type from enum Type
		return type;
	}
	
	public Move getMove1() { //""
		return move1;
	}
	
	public Move getMove2() { //""
		return move2;
	}
	
	public String getName() { //""
		return name;
	}
	
	public void printAttributes() { //prints to command line, possibly rethink this and have it return a string for printing
		System.out.println("Name: " + name);
		System.out.println("Type : " + type);
		System.out.println("Health: " + health);
		System.out.println("Attack: " + attack);
		System.out.println("Speed: " + speed);
		System.out.println("Defense: " + defense);
		System.out.println();
	}
	
}
