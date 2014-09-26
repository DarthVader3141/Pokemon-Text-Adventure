
public class Pokemon {
	
	String name;
	int health;
	int attack;
	int speed;
	int defense;	
	Type type; //from enum of types
	
	public Pokemon(String name, int health, int attack, int speed, int defense, Type type) { //constructor for defining a new pokemon
		this.attack = attack;
		this.speed = speed;
		this.health = health;
		this.defense = defense;
		this.name = name;
		this.type = type;
	}
	

	public void setHealth(int health1) { //sets health
		health = health1;
	}
	
	public int getHealth() { //returns current health
		return health;
	}
	
	public int getAttack() { //returns attack - may later be modifeid to scale off of level
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
