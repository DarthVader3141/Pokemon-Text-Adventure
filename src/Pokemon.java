
public class Pokemon {
	
	int attack;
	int speed;
	int defense;
	int health;
	
	public Pokemon(int attack, int speed, int defense, int health) {
		this.attack = attack;
		this.speed = speed;
		this.health = health;
		this.defense = defense;
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
	
}
