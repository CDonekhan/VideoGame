package combat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import initialization.EntityInitialization;
import initialization.GameSettings;
import entitycharacteristics.BodyRegion;
import entitycharacteristics.EnemyEntity;
import entitycharacteristics.EntityBase;
import entitycharacteristics.Organs;
import entitycharacteristics.PlayerEntity;
import main.GameLoopResources;

public class CombatResources {

   public static ArrayList<EntityBase> createLocalFightList (PlayerEntity player, EnemyEntity enemyInitiator , ArrayList<EnemyEntity> enemiesList) {
	   // Local Variables
	   ArrayList<EntityBase> localFightList = new ArrayList<EntityBase>(); // All participants of the fight
       // Getting local enemies into the fight!
	   for (EnemyEntity enemies: enemiesList) { // This for loop creates the list of local enemies that participate in the fight
		   if ((Math.abs(enemyInitiator.getxCoordinate() - enemies.getxCoordinate()) < enemyInitiator.getViewDistance()) && (Math.abs(enemyInitiator.getyCoordinate() - enemies.getyCoordinate()) < enemyInitiator.getViewDistance())) {
		   localFightList.add(enemies);
		   }
	   }
	   localFightList.add(player);

	   return localFightList;
	   
   }
   public static ArrayList<EnemyEntity> createLocalEnemiesList (PlayerEntity player, EnemyEntity enemyInitiator , ArrayList<EnemyEntity> enemiesList) {
	   // Local Variables
	   ArrayList<EnemyEntity> localEnemiesList = new ArrayList<EnemyEntity>(); // All participants of the fight
       // Getting local enemies into the fight!
	   for (EnemyEntity enemies: enemiesList) { // This for loop creates the list of local enemies that participate in the fight
		   if ((Math.abs(enemyInitiator.getxCoordinate() - enemies.getxCoordinate()) < enemyInitiator.getViewDistance()) && (Math.abs(enemyInitiator.getyCoordinate() - enemies.getyCoordinate()) < enemyInitiator.getViewDistance()) && (enemies.isDead() == false)) {
		   localEnemiesList.add(enemies);
		   }
	   }

	   return localEnemiesList;
	   
   }
   public static ArrayList<EntityBase> createSortedFightList (ArrayList<EntityBase> localFightList) {
	   ArrayList<EntityBase> adjustableLocalFightList = localFightList; // This ensures that the localFightList does not change
	   Random randGen = new Random();
	   ArrayList<EntityBase> sortedFightList = new ArrayList <EntityBase>(); // All participants of fight when sorted!
	   for (EntityBase entity: adjustableLocalFightList) { // This loop yields the order for which turns are given!
		   entity.setCombatTurn(entity.getFightSpeed() * randGen.nextInt(10));
	   }
       while (adjustableLocalFightList.size() != 0) { // This sorts the array list from smallest to largest
    	   EntityBase maxValueEntity = new EntityBase();
    	   maxValueEntity.setCombatTurn(-1);
    	   for (EntityBase entity: adjustableLocalFightList) {
    		   if (entity.getCombatTurn() >  maxValueEntity.getCombatTurn()) {
    			   maxValueEntity = entity;
    		   }
    	   }
    	   if(maxValueEntity.isDead()) { // If an entity is dead, we do not add it back into the list
    		   // We skip adding the value to the sorted list
    		   adjustableLocalFightList.remove(maxValueEntity);
    	   }
    	   else {
	    	   sortedFightList.add(maxValueEntity);
	    	   adjustableLocalFightList.remove(maxValueEntity);
    	   }
       }
       
	   return sortedFightList;
   }
   public static int endBattle (PlayerEntity player, EntityBase entity, ArrayList<EntityBase> sortedFightList) {
	   int k = 0;
	   int j = 0;
	   if (entity.getEntityType().equals("player")) { // This says if the player has a death condition true, the battle ends and the game players the death function!
		   for (BodyRegion currentRegion : entity.getBodyRegionList()) {
			   for (Organs currentOrgan : currentRegion.getOrgans()) {
				   if ((currentOrgan.getHealth() <= 0) && (currentOrgan.isCauseDeath())) {
					  GameLoopResources.endDies(player);
					  k = -1; 
					  j = -1;
					  break;
				   }

			   }
			   if (j == -1) {
				   j = 0;
				   break;
			   }
		   }
		   if (entity.getBlood() <= 0) {
				 GameLoopResources.endDies(player);
				 k = -1;
			 }
	   }
	   else if (entity.getEntityType().equals("enemy")) { // This sets the enemies death value to true if that have a death condition and skips their turn.
		   for (BodyRegion currentRegion : entity.getBodyRegionList()) {
			   for (Organs currentOrgan : currentRegion.getOrgans()) {
				   if ((currentOrgan.getHealth() <= 0) && (currentOrgan.isCauseDeath())) {
					  entity.setDead(true);
					  entity.setMapSymbol(GameSettings.getEnemyDeathSymbol());
					  k = -2; 
					  j = -1;
					  break;
				   }

			   }
			   if (j == -1) {
				   j = 0;
				   break;
			   }
		   } 
		   if (entity.getBlood() <= 0) {
				entity.setDead(true);
				entity.setMapSymbol(GameSettings.getEnemyDeathSymbol());
				k = -2;
			 }
	   }
	   for (EntityBase entityLoop : sortedFightList) { // This essentially says if there are not enemy entities in the fight list, end the battle
		   if ((entityLoop.getEntityType().equals("enemy")) && (entityLoop.isDead() != true)) {
			   j += 1;
		   }
	   }
	   if (j == 0) { 
		   k = -1;
	   }
	   return k; // Returning a zero does nothing. Return a -1 ends the battle. Returning a -2 skips that entites's turn.
   }

}
