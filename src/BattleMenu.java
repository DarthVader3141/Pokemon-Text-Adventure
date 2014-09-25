public class BattleMenu {
	
	String move1;
	String move2;
	
	public BattleMenu(String move1, String move2){
		this.move1 = move1;
		this.move2 = move2;
	}
	
	public void displayMenu() {
		System.out.println();
		System.out.println("1: " + move1);
		System.out.println("2: " + move2);
		System.out.println();
	}
	
	public void getInput() {
		
	}
}
