package entitycharacteristics;
import java.util.ArrayList;
import combat.AttackType;

public class EntityBase {
   // General Status Fields
   private String entityType;
   private String region;
   private String name;
   private String gender;
   private boolean dead;
   // Map Fields
   private int xCoordinate;
   private int yCoordinate;
   private char mapSymbol;
   private int viewDistance;
   private int combatDistance;
   private int movementSpeed;
   // Combat Fields
   private int baseAttackDamage;
   private String landedAttackType;
   private ArrayList<AttackType> attackList;
   private double fightSpeed;
   private double combatTurn;
   // Status Fields
   private double blood;
   private ArrayList<BodyRegion> bodyRegionList;
   // Bleed Variables Player
   private int numGraze;
   private int numLightCut;
   private int numMediumCut;
   private int numHeavyCut;
   private int numHemorrhage;
   private int numLostLimb;
   
   // Default Constructor
   public EntityBase() {
	   gender = "None";
	   entityType = "None";
	   combatTurn = 0;
	   dead = false;
	   combatDistance = 0;
	   movementSpeed = 0;
	   viewDistance = 0;
	   mapSymbol = ' ';
	   xCoordinate = 0 ;
	   yCoordinate = 0;
	   region = "NoWhere";
	   name = "NoName";
	   baseAttackDamage = 0;
	   landedAttackType = "NoAttackType";
	   attackList = null;
	   blood = 0;
	   numGraze = 0;
	   numLightCut = 0;
	   numMediumCut = 0;
	   numHeavyCut = 0;
	   numLostLimb = 0;
   }

   // Setters and Getters
   
   
	public ArrayList<BodyRegion> getBodyRegionList() {
	    return bodyRegionList;
}
    public void setBodyRegionList(ArrayList<BodyRegion> bodyRegionList) {
		this.bodyRegionList = bodyRegionList;
}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public double getCombatTurn() {
		return combatTurn;
	}
	public void setCombatTurn(double combatTurn) {
		this.combatTurn = combatTurn;
	}
	public double getFightSpeed() {
		return fightSpeed;
	}
	public void setFightSpeed(double fightSpeed) {
		this.fightSpeed = fightSpeed;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public int getCombatDistance() {
		return combatDistance;
	}
	public void setCombatDistance(int combatDistance) {
		this.combatDistance = combatDistance;
	}
	public int getMovementSpeed() {
		return movementSpeed;
	}
	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}
	public int getViewDistance() {
		return viewDistance;
	}
	public void setViewDistance(int viewDistance) {
		this.viewDistance = viewDistance;
	}
	public char getMapSymbol() {
		return mapSymbol;
	}
	public void setMapSymbol(char mapSymbol) {
		this.mapSymbol = mapSymbol;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseAttackDamage() {
		return baseAttackDamage;
	}
	public void setBaseAttackDamage(int baseAttackDamage) {
		this.baseAttackDamage = baseAttackDamage;
	}
	public String getLandedAttackType() {
		return landedAttackType;
	}
	public void setLandedAttackType(String landedAttackType) {
		this.landedAttackType = landedAttackType;
	}
	public ArrayList<AttackType> getAttackList() {
		return attackList;
	}
	public void setAttackList(ArrayList<AttackType> attackList) {
		this.attackList = attackList;
	}
	public double getBlood() {
		return blood;
	}
	public void setBlood(double blood) {
		this.blood = blood;
	}
	public int getNumGraze() {
		return numGraze;
	}
	public void setNumGraze(int numGraze) {
		this.numGraze = numGraze;
	}
	public int getNumLightCut() {
		return numLightCut;
	}
	public void setNumLightCut(int numLightCut) {
		this.numLightCut = numLightCut;
	}
	public int getNumMediumCut() {
		return numMediumCut;
	}
	public void setNumMediumCut(int numMediumCut) {
		this.numMediumCut = numMediumCut;
	}
	public int getNumHeavyCut() {
		return numHeavyCut;
	}
	public void setNumHeavyCut(int numHeavyCut) {
		this.numHeavyCut = numHeavyCut;
	}
	public int getNumHemorrhage() {
		return numHemorrhage;
	}
	public void setNumHemorrhage(int numHemorrhage) {
		this.numHemorrhage = numHemorrhage;
	}
	public int getNumLostLimb() {
		return numLostLimb;
	}
	public void setNumLostLimb(int numLostLimb) {
		this.numLostLimb = numLostLimb;
	}
   
   public void printStatus () {
	   System.out.println("-----------");
       System.out.println("Name: " + name + "---" + "Blood Level: " + blood);
   }
   
}
 /*
   # List of all in-game body targets!
   list_all_body_sections = ['right arm', 'left arm', 'right leg', 'left leg', 'head', 'torso']

   # Weapon Type Values
   weapon_tuple = namedtuple('Weapon', ['name','damage', 'bleed_modifier', 'attack_list'])
   #List of all weapons in game!
   Dagger = weapon_tuple('Dagger', 60, 2, ['swing', 'thrust'])
   weapon_list = [Dagger]

   #Attack Type Values
   attack_tuple = namedtuple('Attack', ['name','damage', 'bleed_modifier'])
   # List of all basic attacks in the game!
   #Note to update these you need to update the attack_damage_function inside the Combat_Module_damage Module!
   Swing = attack_tuple('Swing', 10, 2)
   Scratch = attack_tuple('Scratch', 5, 2)
   list_all_attack_types = ['swing', 'scratch', 'thrust']
*/
