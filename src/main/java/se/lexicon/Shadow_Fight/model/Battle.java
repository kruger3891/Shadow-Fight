package se.lexicon.Shadow_Fight.model;

public class Battle {

	public String calculation(Choracter p1, Choracter p2, Round r) {

		r.addToLog(p1.getName() + " atack first");
		
		r=r.roud(p1, p2, r);
		
		if (p2.getHealth() <= 0 && p1.getHealth() >= 0) {
			r.addToLog(" ==== " + p1.getName() + " You win! ====");
			r.addToLog("================================");
			return p1.getName() + " win in " + r.getRoundNumber() + " rounds (" + p1.getName() + " atack first)";

		}
		if (p1.getHealth() <= 0 && p2.getHealth() >= 0) {
			r.addToLog(" ==== " + p2.getName() + " You win! ====");
			r.addToLog("================================");
			return p2.getName() + " win in " + r.getRoundNumber() + " rounds (" + p1.getName() + " atack first)";

		}
		return null;

	}

}
