package src;
import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private int option;
	public Menu() {
		
		this.scanner = new Scanner(System.in);
		this.option = 0;
		
	}
	
	public Scanner getScanner() {
		return scanner;
	}
	
	public int getOption() {
		return option;
	}
	
	public void printMenu() {
		System.out.println("Please select the difficulty level:");
		System.out.println("1. Easy (10 chances)");
		System.out.println("2. Medium (5 chances)");
		System.out.println("3. Hard (3 chances)\n");
		System.out.print("Please enter your choice: ");
		option = scanner.nextInt();
		while(option < 1 || option > 3) {
			System.out.print("Please enter a valid option: ");
			option = scanner.nextInt();
		}
		switch(option) {
		case 1:
			System.out.println("\nGreat! You have selected the Easy difficulty level.");
			System.out.println("You have 10 chances to guess the correct number.\n");
			break;
		case 2:
			System.out.println("\nGreat! You have selected the Medium difficulty level.");
			System.out.println("You have 5 chances to guess the correct number.\n");
			break;
		case 3:
			System.out.println("\nGreat! You have selected the Hard difficulty level.");
			System.out.println("You have 3 chances to guess the correct number.\n");
			break;
		}
		System.out.println("Let's start the game!\n");
	}
	
}
