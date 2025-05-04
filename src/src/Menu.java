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
		System.out.println("3. Hard (3 chances)");
		System.out.print("Please enter your choice: ");
		option = scanner.nextInt();
		while(option < 1 || option > 3) {
			System.out.print("Please enter a valid option: ");
			option = scanner.nextInt();
		}
		switch(option) {
		case 1:
			System.out.println("Great! You have selected the Easy difficulty level.");
			break;
		case 2:
			System.out.println("Great! You have selected the Medium difficulty level.");
			break;
		case 3:
			System.out.println("Great! You have selected the Hard difficulty level.");
			break;
		}
	}
}
