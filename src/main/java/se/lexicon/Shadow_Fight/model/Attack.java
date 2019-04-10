package se.lexicon.Shadow_Fight.model;

import se.lexicon.Shadow_Fight.service.Fighter;

public class Attack {

	public static String calculation(Fighter p1, Fighter p2, int round) {

		System.out.println(p1.getName() + " atack first");

		while (p1.getHealth() > 0 && p2.getHealth() > 0) {

			int outcome = (p1.getFight() + p1.getStrength()) - p2.getDefense();
			int outcome1 = 2 * outcome;
			p2.setHealth(p2.getHealth() - outcome1);
			System.out.println("\n " + p1.getName() + " attack " + p2.getName() + " " + outcome1 + " damage!\n "
					+ p2.getName() + "'s" + " Health: is " + p2.getHealth());

			if (p2.getHealth() <= 0) {
				break;
			}

			outcome = (p2.getFight() + p2.getStrength()) - p1.getDefense();
			outcome1 = 2 * outcome;
			p1.setHealth(p1.getHealth() - outcome1);
			System.out.println("\n " + p2.getName() + " attack " + p1.getName() + " " + outcome1 + " damage!\n "
					+ p1.getName() + "'s" + " Health: is " + p1.getHealth());
			System.out.println(" ==== Round " + round++ + "   ====");

		}
		if (p2.getHealth() <= 0 && p1.getHealth() >= 0) {
			System.out.println(" ==== " + p1.getName() + " You win! ====");
			System.out.println("================================");
			return p1.getName() + " win in " + round + " rounds (" + p1.getName() + " atack first)";

		}
		if (p1.getHealth() <= 0 && p2.getHealth() >= 0) {
			System.out.println(" ==== " + p2.getName() + " You win! ====");
			System.out.println("================================");
			return p2.getName() + " win in " + round + " rounds (" + p1.getName() + " atack first)";

		}
		return null;

	}

}
