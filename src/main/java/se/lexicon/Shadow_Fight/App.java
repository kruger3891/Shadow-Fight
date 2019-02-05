package se.lexicon.Shadow_Fight;

import java.util.Random;
import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();
	static inputNumberScann scNumber = new inputNumberScann();

	public static void main(String[] args) {

		String playAgain;
// 		Players(String name, int fight, int defense, int health)

		Players[] players = new Players[3];

		players[0] = new Players("Halk", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		players[1] = new Players("Avatar", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		players[2] = new Players("Titan", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		Players fighting;

		Enemy[] enemis = new Enemy[5];
		enemis[0] = new Enemy("Rintar", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		enemis[1] = new Enemy("Prince", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		enemis[2] = new Enemy("Zersious", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		enemis[3] = new Enemy("Lord", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		enemis[4] = new Enemy("Valon", getRan(7, 10), getRan(3, 5), getRan(40, 50));
		Enemy toFight;

		System.out.println("============================================");
		System.out.println("===     Welcome to Shadow Fight 2        ===");
		System.out.println("============================================");
		System.out.println("===   	  Pleas Enter the namber         ===");
		System.out.println("============================================");

		boolean run = true;
		while (run) {
			System.out.println("Choose your Character\n");
			System.out.println("=== 1: " + players[0].getName() + "   ===\n=== 2: " + players[1].getName()
					+ " ===\n=== 3: " + players[2].getName() + "  ===");

			toFight = enemis[random.nextInt(4)];
			int section = scNumber.input(1, 3);
			fighting = players[section - 1];

			System.out.println("Are You Ready To Fight " + toFight.getName());
			Attack.calculation(fighting, toFight, 1);

			toFight.setHealth1(getRan(40, 50));
			fighting.setHealth(getRan(40, 50));

			System.out.println("\nDo you want play again 'y' to \n");
			playAgain = sc.nextLine().toLowerCase();
			if (playAgain.equals("y")) {
				run = true;
			} else {
				System.out.println("Program is terminated");
				run = false;
			}
		}
	}

	private static int getRan(int min, int max) {
		return random.nextInt(max - min) + min;
	}

}
