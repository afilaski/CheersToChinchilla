package game.models;

import game.models.interfaces.AttackBehavior;
import game.models.interfaces.HealthBehavior;

public class PlayerE {
	private String name;
	private AttackBehavior attack;
	private HealthBehavior health;
	
	public AttackBehavior getAttack() {
		return attack;
	}

	public void setAttack(AttackBehavior attack) {
		this.attack = attack;
	}

	public HealthBehavior getHealth() {
		return health;
	}

	public void setHealth(HealthBehavior health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
