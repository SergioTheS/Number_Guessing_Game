package src;


public class Main {
	public static void main(String[] args) {
		Menu menu =  new Menu();
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("You have 5 chances to guess the correct number.");
		int numToGuess = (int)(Math.random()*101);
		int option = 0;
		menu.printMenu(option);
		System.out.println(numToGuess);
	}
	
	
}
