package se.lexicon.Shadow_Fight.model;

import java.util.ArrayList;
import java.util.List;

public class Round {
	
	private int roundNumber;
	private List<String> battleLog=new ArrayList<>();
	
	public int goNextRound() {
		return ++roundNumber;
	}
	public void resetRound() {
		roundNumber=0;
		battleLog=new ArrayList<>();
	}
	public void addToLog(String s) {
		battleLog.add(s);
	}
	
	public int getRoundNumber() {
		return roundNumber;
	}	

	public List<String> getBattleLog() {
		return battleLog;
	}
	
	public void roud(Character p1, Character p2, Round r) {
		while (p1.getHealth() > 0 && p2.getHealth() > 0) {

			int outcome = (p1.getFight() + p1.getStrength()) - p2.getDefense();
			int outcome1 = 2 * outcome;
			p2.setHealth(p2.getHealth() - outcome1);
			r.addToLog("\n " + p1.getName() + " attack " + p2.getName() + " " + outcome1 + " damage!\n "
					+ p2.getName() + "'s" + " Health: is " + p2.getHealth());

			if (p2.getHealth() <= 0) {
				break;
			}

			outcome = (p2.getFight() + p2.getStrength()) - p1.getDefense();
			outcome1 = 2 * outcome;
			p1.setHealth(p1.getHealth() - outcome1);
			r.addToLog("\n " + p2.getName() + " attack " + p1.getName() + " " + outcome1 + " damage!\n "
					+ p1.getName() + "'s" + " Health: is " + p1.getHealth());
			r.addToLog(" ==== Round " + r.goNextRound() + "   ====");

		}
	}

}
