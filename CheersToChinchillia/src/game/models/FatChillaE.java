package game.models;

public class FatChillaE extends PlayerE {
	
	public FatChillaE(String name) {
		BasicAttack basicAttack = new BasicAttack();
		BasicHealth basicHealth = new BasicHealth();
		basicHealth.setHealth(10.0);
		basicHealth.setHealthStregth(0.2);
		basicAttack.setAttack(1.0);
		basicAttack.setAttackStrength(0.2);
		super.setAttack(basicAttack);
		super.setHealth(basicHealth);
		super.setName("George");
	}
}
