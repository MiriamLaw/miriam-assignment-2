package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		int minNumber = 1;
		int maxNumber = 100;

		Random random = new Random();
		int randomNumber = random.nextInt(maxNumber) + minNumber;

		Scanner scanner = new Scanner(System.in);

		int guesses = 0;
		while (guesses < 5) {
			System.out.println("Pick a number between " + minNumber + " and " + maxNumber);

			int guess = scanner.nextInt();

			if (guess < minNumber || guess > maxNumber) {
				System.out
						.println("Your guess is not between " + minNumber + " and " + maxNumber + ", please try again");
				continue;

			} else if (guess == randomNumber) {
				System.out.println("You win!");
				scanner.close();
				return;
			} else {
				if (guess < randomNumber) {
					System.out.println("Please pick a higher number");
				} else if (guess > randomNumber) {
					System.out.println("Please pick a lower number");

				}
				guesses++;
			}

			if (guesses == 5) {
				System.out.println("You lose. The number to guess was: " + randomNumber);

			}

		}
		scanner.close();
	}
}
