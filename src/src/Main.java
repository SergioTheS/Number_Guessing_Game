package src;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Menu menu =  new Menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.");
		int numToGuess = (int)(Math.random()*101);
		menu.printMenu();
		System.out.print("Please enter your guess: ");
		int guess = sc.nextInt();
		int count = 1;
		int numberOfAttempts = 10;
		switch(menu.getOption()) {
		case 1:
			numberOfAttempts = 10;
			while(count < numberOfAttempts && guess != numToGuess) {
					if(numToGuess < guess) {
						System.out.println("Incorrect! The number is less than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}else {
						System.out.println("Incorrect! The number is more than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}
				count++;
			}
			if(guess != numToGuess) {
				System.out.println("Oh no! You couldn't guess the number.\n");
				System.out.println("The number was: "+ numToGuess);
				
			}else {
				System.out.println("Congratulations! You guessed the correct number in "+ count +" attempts.");
			}
			break;
		case 2:
			numberOfAttempts = 5;
			while(count < numberOfAttempts && guess != numToGuess) {
					if(numToGuess < guess) {
						System.out.println("Incorrect! The number is less than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}else {
						System.out.println("Incorrect! The number is more than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}
				count++;
			}
			if(guess != numToGuess) {
				System.out.println("Oh no! You couldn't guess the number.\n");
				System.out.println("The number was: "+ numToGuess);
				
			}else {
				System.out.println("Congratulations! You guessed the correct number in "+ count +" attempts.");
			}
			break;
		case 3:
			numberOfAttempts = 3;
			while(count < numberOfAttempts && guess != numToGuess) {
					if(numToGuess < guess) {
						System.out.println("Incorrect! The number is less than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}else {
						System.out.println("Incorrect! The number is more than "+ guess + ".\n");
						System.out.print("Please enter your guess: ");
						guess = sc.nextInt();
					}
				count++;
			}
			if(guess != numToGuess) {
				System.out.println("Oh no! You couldn't guess the number.\n");
				System.out.println("The number was: "+ numToGuess);
				
			}else {
				System.out.println("Congratulations! You guessed the correct number in "+ count +" attempts.");
			}
			break;
		}
		System.out.println(numToGuess);
	}
	
	
}
