
public class Move {
	
	String name;
	int damage;
	Type type;
	
	public Move(String name, int damage, Type type) {
		this.name = name;
		this.damage = damage;
		this.type = type;
	}
	
	public int getDamage() { //gets the move's damage
		return damage;
	}
	
	public void setDamage(int damage1) { //sets the move's damage
		damage = damage1;
	}
	
	public Type getType() { //returns type
		return type;
	}
	
	public String getName() { //returns name
		return name;
	}
	
	public void setName(String name1) { //sets name
		name = name1;
	}
	

}
