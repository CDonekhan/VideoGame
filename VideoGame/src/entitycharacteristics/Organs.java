package entitycharacteristics;

public class Organs {
   private String name;
   private double health;
   private boolean causeDeath;
   

public boolean isCauseDeath() {
	return causeDeath;
}
public void setCauseDeath(boolean causeDeath) {
	this.causeDeath = causeDeath;
}  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHealth() {
	return health;
}
public void setHealth(double health) {
	this.health = health;
}
   
   
}
