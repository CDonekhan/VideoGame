package entitycharacteristics;
import java.util.*;

import combat.AttackType;

public class PlayerEntity extends EntityBase {
   // General Fields
   private String discoveredLocations;
   // Player Gear
      // Player Weapons
   private String shield;
   private String mainWeapon;
   private String offHandWeapon;
      //Player Clothes
   private String socks;
   private String underwear;
   private String shirt;
   private String pants;
   private String gloves;
   private String cape;
   private String scarf;
      // Player Jewelry
   private String bracelet;
   private String glasses;
   private String earrings;
   private String rings;
   private String necklace;
      // Player Armor
   private String legArmor;
   private String chestArmor;
   private String boots;
   private String helmet;
   private String gauntlet;
   
   // Default Constructor
   public PlayerEntity() {
	   super();
	   discoveredLocations = "NoLocations";
	   shield = "NoItem";
	   mainWeapon = "NoItem"; 
	   offHandWeapon = "NoItem";
	   socks = "NoItem";
	   underwear = "NoItem";
	   shirt = "NoItem";
	   pants = "NoItem";
	   gloves = "NoItem";
	   cape = "NoItem";
	   scarf = "NoItem";
	   bracelet = "NoItem";
	   glasses = "NoItem";
	   earrings = "NoItem";
	   rings = "NoItem";
	   necklace = "NoItem";
	   legArmor = "NoItem";
	   chestArmor = "NoItem";
	   boots = "NoItem";
	   helmet = "NoItem";
	   gauntlet = "NoItem";
   }
	
	// Setters and Getters
	public String getDiscoveredLocations() {
		return discoveredLocations;
	}
	public void setDiscoveredLocations(String discoveredLocations) {
		this.discoveredLocations = discoveredLocations;
	}
	public String getShield() {
		return shield;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	public String getMainWeapon() {
		return mainWeapon;
	}
	public void setMainWeapon(String mainWeapon) {
		this.mainWeapon = mainWeapon;
	}
	public String getOffHandWeapon() {
		return offHandWeapon;
	}
	public void setOffHandWeapon(String offHandWeapon) {
		this.offHandWeapon = offHandWeapon;
	}
	public String getSocks() {
		return socks;
	}
	public void setSocks(String socks) {
		this.socks = socks;
	}
	public String getUnderwear() {
		return underwear;
	}
	public void setUnderwear(String underwear) {
		this.underwear = underwear;
	}
	public String getShirt() {
		return shirt;
	}
	public void setShirt(String shirt) {
		this.shirt = shirt;
	}
	public String getPants() {
		return pants;
	}
	public void setPants(String pants) {
		this.pants = pants;
	}
	public String getGloves() {
		return gloves;
	}
	public void setGloves(String gloves) {
		this.gloves = gloves;
	}
	public String getCape() {
		return cape;
	}
	public void setCape(String cape) {
		this.cape = cape;
	}
	public String getScarf() {
		return scarf;
	}
	public void setScarf(String scarf) {
		this.scarf = scarf;
	}
	public String getBracelet() {
		return bracelet;
	}
	public void setBracelet(String bracelet) {
		this.bracelet = bracelet;
	}
	public String getGlasses() {
		return glasses;
	}
	public void setGlasses(String glasses) {
		this.glasses = glasses;
	}
	public String getEarrings() {
		return earrings;
	}
	public void setEarrings(String earrings) {
		this.earrings = earrings;
	}
	public String getRings() {
		return rings;
	}
	public void setRings(String rings) {
		this.rings = rings;
	}
	public String getNecklace() {
		return necklace;
	}
	public void setNecklace(String necklace) {
		this.necklace = necklace;
	}
	public String getLegArmor() {
		return legArmor;
	}
	public void setLegArmor(String legArmor) {
		this.legArmor = legArmor;
	}
	public String getChestArmor() {
		return chestArmor;
	}
	public void setChestArmor(String chestArmor) {
		this.chestArmor = chestArmor;
	}
	public String getBoots() {
		return boots;
	}
	public void setBoots(String boots) {
		this.boots = boots;
	}
	public String getHelmet() {
		return helmet;
	}
	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}
	public String getGauntlet() {
		return gauntlet;
	}
	public void setGauntlet(String gauntlet) {
		this.gauntlet = gauntlet;
	}

   
   
}

