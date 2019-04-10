package se.lexicon.Shadow_Fight.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputNumberScann {

	Scanner sc = new Scanner(System.in);

	public int input(int startPosition, int endPosition) {
		int num;

		while (true) {
			while (true) {
				try {
					num = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect input, must be numbers.");
				} finally {
					sc.nextLine();
				}
			}
			if (startPosition == 0 && endPosition == 0)
				endPosition = num;
			if (num >= startPosition && num <= endPosition)
				break;
			else {
				System.out.println("Incorrect input it muste be: " + startPosition + " <=> " + endPosition + " \n");
			}
		}
		return num;
	}
}