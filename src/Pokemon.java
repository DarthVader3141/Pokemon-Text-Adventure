
public class Pokemon {
	
	String name;
	int health;
	int attack;
	int speed;
	int defense;	
	Type type;
	
	public Pokemon(String name, int health, int attack, int speed, int defense, Type type) {
		this.attack = attack;
		this.speed = speed;
		this.health = health;
		this.defense = defense;
		this.name = name;
		this.type = type;
	}
	

	public void setHealth(int health1) {
		health = health1;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public Type getType() {
		return type;
	}
	
	public void printAttributes() {
		System.out.println("Name: " + name);
		System.out.println("Type : " + type);
		System.out.println("Health: " + health);
		System.out.println("Attack: " + attack);
		System.out.println("Speed: " + speed);
		System.out.println("Defense: " + defense);
		System.out.println();
	}
	
}
