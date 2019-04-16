package se.lexicon.Shadow_Fight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import se.lexicon.Shadow_Fight.model.Battle;
import se.lexicon.Shadow_Fight.model.Choracter;
import se.lexicon.Shadow_Fight.model.Round;

public class Fight_Test {

	private Battle testBatal = new Battle();
	private Round testRound = new Round();

	private Choracter p1, p2;

	@Before
	public void init() {
		p1 = new Choracter("Warrior", 91, 92, 93, 94);
		p2 = new Choracter("Rintar", 1, 1, 1, 1);
	}

	@Test
	public void playerDataCheck() {
		Assert.assertEquals("Warrior", p1.getName());
		Assert.assertEquals(91, p1.getStrength());
		Assert.assertEquals(92, p1.getFight());
		Assert.assertEquals(93, p1.getDefense());
		Assert.assertEquals(94, p1.getHealth());	
	}
	
	@Test
	public void calculationTest() {
		String expect = "Warrior win in 1 rounds (Warrior atack first)";
		Assert.assertEquals(expect, testBatal.calculation(p1, p2, testRound));
		
		
	}

}












