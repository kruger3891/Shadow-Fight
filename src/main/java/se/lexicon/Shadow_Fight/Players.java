package se.lexicon.Shadow_Fight;

public class Players {

	private String name;
	private int fight;
	private int defense;
	private int health;

	public Players(String name, int fight, int defense, int health) {
		super();
		this.name = name;
		this.fight = fight;
		this.defense = defense;
		this.health = health;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFight() {
		return fight;
	}

	public void setFight(int fight) {
		this.fight = fight;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
