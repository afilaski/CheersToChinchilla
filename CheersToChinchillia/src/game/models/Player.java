package game.models;

public class Player {
	// Private Attributes
	private String name;
	private int age;
	private double health;
	private double happiness;
	private double hunger;
	private double attackDamage;
	
	// Object Behaviors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getHappiness() {
		return happiness;
	}
	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}
	public double getHunger() {
		return hunger;
	}
	public void setHunger(double hunger) {
		this.hunger = hunger;
	}
	public double getAttackDamage() {
		return attackDamage;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
}
