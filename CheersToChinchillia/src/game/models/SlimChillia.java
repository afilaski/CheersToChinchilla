package game.models;

public class SlimChillia extends Player {
	private double hungerMultiplier = -.08;
	private double happinessMultiplier = .3;
	
	public SlimChillia(String name, int health, int age, int happiness, int hunger, int attackDamage) {
		this.setAge(age);
		this.setName(name);
		this.setHealth(health);
		this.setHappiness(happiness);
		this.setAttackDamage(attackDamage);
	}
	
	public void performMultiplers() {
		this.setHappiness(this.getHappiness()*happinessMultiplier);
		this.setHunger(this.getHunger()*hungerMultiplier);
	}
	
}
