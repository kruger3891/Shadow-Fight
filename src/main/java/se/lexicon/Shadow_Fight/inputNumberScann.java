package se.lexicon.Shadow_Fight;

import java.util.InputMismatchException;

import java.util.Scanner;

public class inputNumberScann {

	Scanner sc = new Scanner(System.in);

	public int input() {
		return input();
	}

	public int input(int startPosition, int endPosition) {
		int number = 0;
		boolean run = true;
		while (run) {
			while (run) {
				try {
					number = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect input, must be numbers.");
				} finally {
					sc.nextLine();
				}
			}
			if (startPosition == 0 && endPosition == 0)
				endPosition = number;
			if (number >= startPosition && number <= endPosition)
				break;
			else {
				System.out.println("Incorrect input it muste be: " + startPosition + " <=> " + endPosition + " \n");
			}
		}
		return number;
	}
}