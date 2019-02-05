package se.lexicon.Shadow_Fight;

public class Attack {

	public static void calculation(Players p, Enemy e, int round) {

		while (p.getHealth() > 0 && e.getHealth1() > 0) {

			int outcome = p.getFight() - e.getDefense1();
			int outcome1 = 2 * outcome;
			e.setHealth1(e.getHealth1() - outcome1);
			System.out.println("\n"+p.getName()+" attack "+e.getName() + outcome + 
					" damage!\n"+ e.getName() +" Health: " + e.getHealth1());

			if (e.getHealth1() <= 0) {
				break;
			}

			outcome = e.getFight1() - p.getDefense();
			outcome1 = 2 * outcome;
			p.setHealth(p.getHealth() - outcome1);
			System.out.println("\n"+e.getName()+" attack "+ p.getName() + outcome1 + 
					" damage!\n"+p.getName()+" Health: " + p.getHealth());
			System.out.println(" Round " + round++);

		}
		if (e.getHealth1() <= 0 && p.getHealth() > 0) {
			System.out.println("You win!");

		}
		if (p.getHealth() <= 0 && e.getHealth1() > 0) {
			System.out.println("You lose!");

		}

	}

}