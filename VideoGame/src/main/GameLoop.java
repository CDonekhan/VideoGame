package main;
import java.util.*;

import entitybehavior.EnemyBehavior;
import initialization.EntityInitialization;
import initialization.GameSettings;
import entitycharacteristics.*;
import mapresources.*;

public class GameLoop {
   public static void MainGameLoop (Scanner userInput, PlayerEntity player) {
	   // Method Variables
	   String userChoice; // Used for user input choices
       ArrayList<EnemyEntity> enemiesList = new ArrayList<EnemyEntity>();

       // Initialization of enemy entities
       for (int i = 0; i < GameSettings.getNumEnemies(); ++i) {
    	   EnemyHuman enemyHuman = EntityInitialization.EnemyInitialize();
           enemiesList.add(enemyHuman);
       }
	   while (true) { // Main game loop!
		   
		   if (player.isDead() == true) { // If the player dies!
			   System.out.println();
			   System.out.println("Game Over");
			   break;
		   }
		   
		   GameLoopResources.playerMenuStatus(player, enemiesList); // This displays the status of the player!		   		   
		   userChoice = userInput.nextLine(); // Gets user input for movement!
		   PlayerMapFunctions.playerMovement(userChoice, player); // Moves player based on command!
		   for (EnemyEntity enemyEntity: enemiesList) {
			   if (player.isDead() == true) { // If the player dies!
				   break;
			   }
			   if (enemyEntity.isDead()) {
				   continue;
			   }
			   else {
			   EnemyBehavior.enemyMovementChoice(player, enemyEntity, userInput, enemiesList); 
			   }
		   }
		   enemiesList = EnemyBehavior.enemyDeath(enemiesList);
	   }
   }
}
