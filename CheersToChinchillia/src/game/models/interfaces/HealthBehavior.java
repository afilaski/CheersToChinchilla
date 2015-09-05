package game.models.interfaces;

public interface HealthBehavior {
	public void removeHealth(Double remove);
	public Double gainHealth(Double gain);
	public Double getHealth();
	public void setHealth(Double health);
}
