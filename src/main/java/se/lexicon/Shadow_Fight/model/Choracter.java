package se.lexicon.Shadow_Fight.model;

public class Choracter {

	private String name;
	private int strength;
	private int fight;
	private int defense;
	private int health;

	public Choracter(String name, int strength, int fight, int defense, int health) {
		this.strength=strength;
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

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
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
