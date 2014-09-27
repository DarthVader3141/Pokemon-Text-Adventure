import java.util.Scanner;

public class BattleMenu {
	
	Move move1;
	Move move2;

	int input;
	
	private Scanner scanner;
	
	public BattleMenu(Move move1, Move move2){ //constructor, menu needs moves to display; will expand later
		this.move1 = move1;
		this.move2 = move2;
	}
	
	public void displayMenu() { //actually prints the menu - to be expanded later
		System.out.println();
		System.out.println("1: " + move1.getName());
		System.out.println("2: " + move2.getName());
		System.out.println();
	}
	
	public int getInput() { //returns next integer from System.in
		scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}
}
