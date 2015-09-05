package game.models;

import game.models.interfaces.HealthBehavior;

public class BasicHealth implements HealthBehavior {
	private Double health;
	private Double healthStregth;
	
	public Double getHealth() {
		return health;
	}
	public void setHealth(Double health) {
		this.health = health;
	}
	public Double getHealthStregth() {
		return healthStregth;
	}
	public void setHealthStregth(Double healthStregth) {
		this.healthStregth = healthStregth;
	}
	@Override
	public void removeHealth(Double remove) {
		this.health = (this.health * this.healthStregth) - remove;
		
	}
	@Override
	public Double gainHealth(Double gain) {
		this.health = gain;
		return this.health;
	}
}
