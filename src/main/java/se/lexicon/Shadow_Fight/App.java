package se.lexicon.Shadow_Fight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	static List<String> log = new ArrayList<>();

	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();
	static inputNumberScann scNumber = new inputNumberScann();

	public static void main(String[] args) {

		String playAgain;

		System.out.println("===================================");
		System.out.println("===  Welcome to Shadow Fight 2  ===");
		System.out.println("===================================");
		Date date = new Date();
		System.out.println("===" + date.toString() + "====");

		System.out.println("===================================");
		System.out.println("===   Pleas Enter the namber    ===");
		System.out.println("===================================");

		String[] character = { "Warrior", "Fighters", "Mage" };

//							Fighter(String name, int strength, int fight, int defense, int health) {

		Fighter player = new Fighter("player", getRan(5, 8), getRan(2, 4), getRan(2, 4), getRan(70, 90));

		String[] enemis = { "Rintar", "Prince", "Lord", "Valon", "Tank", "Zersious" };

		Fighter enemy = new Fighter("randon", getRan(5, 8), getRan(2, 4), getRan(2, 4), getRan(70, 90));

		System.out.println("====   Enter your name:\t ====");

		String name = sc.nextLine();
		System.out.println("\nWelcome to the Shadow Fight   " + name);

		System.out.println("\n ===   Choose your Character   ===\n");
		System.out.println("\t=== 1: " + character[0] + "   ===\n\t=== 2: " + character[1] + " ===\n\t=== 3: "
				+ character[2] + "  ===");

		int section = scNumber.input(1, 3);
		player.setName(name + " " + character[section - 1]);

		int fightNumber = 1;

		boolean run = true;
		while (run) {
			enemy.setName(enemis[getRan(0, enemis.length - 1)] + " (enemy)");
			System.out.println("Your Fighting has begun  " + enemy.getName() + "\n");
			String result;
			if (getRan(0, 1) == 0) {
//			if(fightNumber%2!=0) {	
				result = Attack.calculation(player, enemy, 1);
			} else {
				result = Attack.calculation(enemy, player, 1);
			}
			log.add(result + " fight No." + fightNumber++);

			if (player.getHealth() > 0) {
				enemy.setHealth(getRan(70, 90));
				player.setHealth(getRan(70, 90));
				enemy.setFight(getRan(1, 3));
				player.setFight(getRan(1, 3 + fightNumber/5));
				System.out.println("\nDo you want play Fight 'y' to \n");
				playAgain = sc.nextLine().toLowerCase();
				if (playAgain.equals("y")) {
					run = true;
				} else {
					System.out.println(" === You seem like scared === \n\n");
					log.forEach(System.out::println);
					run = false;
				}
			} else {
				System.out.println(" === Your fighter is dead === \n\n");
				log.forEach(System.out::println);
				run = false;
			}

		}
	}

	private static int getRan(int min, int max) {
		return random.nextInt(max - min+1) + min;
	}

	public static String getP_name() {
		String p_name = sc.nextLine();
		System.out.println("\nWelcome to the Shadow Fight   " + p_name);
		return p_name;
	}

}
