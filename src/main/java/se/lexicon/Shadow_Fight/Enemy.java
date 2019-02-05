package se.lexicon.Shadow_Fight;

public class Enemy {

	private String name;
	private int fight1;
	private int defense1;
	private int health1;

	public Enemy(String name, int fight1, int defense1, int health1) {
		super();
		this.name = name;
		this.fight1 = fight1;
		this.defense1 = defense1;
		this.health1 = health1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFight1() {
		return fight1;
	}

	public void setFight1(int fight1) {
		this.fight1 = fight1;
	}

	public int getDefense1() {
		return defense1;
	}

	public void setDefense1(int defense1) {
		this.defense1 = defense1;
	}

	public int getHealth1() {
		return health1;
	}

	public void setHealth1(int health1) {
		this.health1 = health1;
	}

}
