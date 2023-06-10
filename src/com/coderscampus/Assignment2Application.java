package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int guesses = 1; guesses <= 5; guesses++ ) {
		
		System.out.println("Pick a number between 1 and 100");
		
		
		
		System.out.println("Your guess is not between 1 and 100, please try again");
		
		System.out.println("Please pick a higher number");
		
		System.out.println("Please pick a lower number");
		
		System.out.println("You win!");
		
		System.out.println("You lose. The number to guess was: " + randomNumber);

	}
		scanner.close();
	
		

}
}
