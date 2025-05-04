package src;
import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	public Menu() {
		
		this.scanner = new Scanner(System.in);
		
	}
	public Scanner getScanner() {
		return scanner;
	}
	
	public void printMenu(int option) {
		System.out.println("Please select the difficulty level:");
		System.out.println("1. Easy (10 chances)");
		System.out.println("2. Medium (5 chances)");
		System.out.println("3. Hard (3 chances)");
		System.out.print("Please enter your choice: ");
		int a = scanner.nextInt();
		while(a < 1 || a > 3) {
			System.out.print("Please enter a valid option: ");
			a = scanner.nextInt();
		}
		switch(a) {
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
