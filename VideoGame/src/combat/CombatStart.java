package combat;
import entitycharacteristics.*;
import main.GameLoopResources;
import tools.GeneralTools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entitybehavior.EnemyBehavior;
import initialization.EntityInitialization;
public class CombatStart {
   public static void combatLoop(PlayerEntity player, EnemyEntity enemyInitiator, Scanner userInput, ArrayList<EnemyEntity> enemiesList) {
	   ArrayList<EnemyEntity> localEnemiesList = CombatResources.createLocalEnemiesList(player, enemyInitiator, enemiesList);
	   ArrayList<EntityBase> localFightList = CombatResources.createLocalFightList(player, enemyInitiator, enemiesList);
	   ArrayList<EntityBase> sortedFightList = CombatResources.createSortedFightList(localFightList);
	   System.out.println();
	   System.out.print("You were attacked by: ");
	   System.out.println();
	   System.out.print("   ");
	   int loopVariable = 1;
	   for (EnemyEntity enemy: localEnemiesList) {
	       if (loopVariable == localEnemiesList.size()) {
	    	   System.out.print("and " + enemy.getName() + ".");
	       }
		   else {
			   System.out.print(enemy.getName() + ", ");
	   }
	       if (loopVariable % 4 == 0) {
	    	   System.out.println();
	    	   System.out.print("   ");
	       }
	       loopVariable += 1;
	   }
	   System.out.println();
	   System.out.println("Enter any key to continue");
	   userInput.nextLine();
	   
       while (true) {  
	    	 localEnemiesList = CombatResources.createLocalEnemiesList(player, enemyInitiator, enemiesList);
	    	 localFightList = CombatResources.createLocalFightList(player, enemyInitiator, enemiesList);
	    	 sortedFightList = CombatResources.createSortedFightList(localFightList);
             int breakInt = 0;
    	     for (EntityBase entity : sortedFightList) { // Here we start the main loop for combat
    	    	 // This code ends the battle if player dies or if all enemy entities are dead.
				localEnemiesList = CombatResources.createLocalEnemiesList (player, enemyInitiator , enemiesList);
				localFightList = CombatResources.createLocalFightList(player, enemyInitiator, enemiesList);
		    	sortedFightList = CombatResources.createSortedFightList(localFightList);
	   			 breakInt = CombatResources.endBattle(player, entity, sortedFightList);
	   			 if (breakInt == -1) {// This is the method for battle to end!
	   				 break;
	   			 }
	   			 else if (breakInt == -2) {// This skips the turn of a dead enemy or ally
	   				 continue;
	   			 }
    			 // Here is where the content main combat loop starts
    	    	 if (entity.getEntityType().equals("player")) {
    	    		 localEnemiesList = CombatResources.createLocalEnemiesList (player, enemyInitiator , enemiesList);
                     PlayerCombat.playerInput(userInput, player, localEnemiesList, enemiesList, sortedFightList);
    	    	 }
    	    	 else if (entity.getEntityType().equals("enemy")) {
    	    		  EnemyCombat.enemyChoice(entity, player, userInput);

    	    	  }
    	    	 else {
    	    		  System.out.println("Something went wrong with Combat Start!");
    	    	  }
    	    	// This for loop checks if an entity died and removes them from the fight
 				for (EnemyEntity enemyLoop : localEnemiesList) { 
 		    	   if(enemyLoop.isDead()) { // If an entity is dead, we do not add it back into the list
 		    		   // We skip adding the value to the sorted list
 		    		   System.out.println();
 		    		   System.out.println(enemyLoop.getName() + " died!");
 		    		   System.out.println("Enter any key to continue");
 		    		   userInput.nextLine();
 		    		   localFightList.remove(enemyLoop);
 		    		   
 		    	   }
 				}
    	     }
    	    if (breakInt == -1) {
    	    	break;
    	    }
		   }
	   }
	}
