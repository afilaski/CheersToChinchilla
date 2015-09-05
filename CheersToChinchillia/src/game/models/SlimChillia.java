package game.models;

public class SlimChillia extends Player {
	// Attributes
	private double hungerMultiplier = -.08;
	private double happinessMultiplier = .3;

	// Constructor
	public SlimChillia(String name, double health, int age, double happiness, double hunger, double attackDamage) {
		this.setAge(age);
		this.setName(name);
		this.setHealth(health);
		this.setHappiness(happiness);
		this.setAttackDamage(attackDamage);
	}

	// Behaviors
	public void performMultiplers() {
		this.setHappiness(this.getHappiness() * happinessMultiplier);
		this.setHunger(this.getHunger() * hungerMultiplier);
	}

}
