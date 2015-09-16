package game.models;

import game.models.interfaces.AttackBehavior;

public class BasicAttack implements AttackBehavior {

	private Double attack = 1.0;
	private Double attackStrength = .08;
	
	public Double getAttack() {
		return attack;
	}

	public void setAttack(Double attack) {
		this.attack = attack;
	}

	public Double getAttackStrength() {
		return attackStrength;
	}

	public void setAttackStrength(Double attackStrength) {
		this.attackStrength = attackStrength;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double damageDealt() {
		// TODO Auto-generated method stub
		return null;
	}

}
