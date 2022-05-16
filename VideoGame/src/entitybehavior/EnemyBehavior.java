package entitybehavior;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import combat.CombatStart;
import entitycharacteristics.*;
import mapresources.*;

public class EnemyBehavior {
	public static void enemyMovementChoice (PlayerEntity player, EnemyEntity enemyEntity, Scanner userInput, ArrayList<EnemyEntity> enemiesList) {
		int entityStackInt = 0;
		for (EnemyEntity otherEnemy : enemiesList) {
			if (((enemyEntity.getxCoordinate() == otherEnemy.getxCoordinate()) && (enemyEntity.getyCoordinate() == otherEnemy.getyCoordinate())) && (otherEnemy != enemyEntity)) {
				entityStackInt = -1;
			}
		}
		System.out.println(entityStackInt); // FIXME
		if (((Math.abs(enemyEntity.getxCoordinate() - player.getxCoordinate()) < enemyEntity.getTooCloseToPlayer()) && (Math.abs(enemyEntity.getyCoordinate() - player.getyCoordinate()) < enemyEntity.getTooCloseToPlayer())) || (entityStackInt == -1)) {
			enemyRandomMovement(player, enemyEntity);
		}
		else if ((Math.abs(enemyEntity.getxCoordinate() - player.getxCoordinate()) < enemyEntity.getViewDistance()) && (Math.abs(enemyEntity.getyCoordinate() - player.getyCoordinate()) < enemyEntity.getViewDistance())) {
			enemyPursuePlayer (player, enemyEntity);
		}
		else {
			enemyRandomMovement(player, enemyEntity);
		}
    	if (((Math.abs(enemyEntity.getxCoordinate() - player.getxCoordinate()) < enemyEntity.getCombatDistance()) && (Math.abs(enemyEntity.getyCoordinate() - player.getyCoordinate()) < enemyEntity.getCombatDistance())) && enemiesList.contains(enemyEntity)) {
    		CombatStart.combatLoop(player, enemyEntity, userInput, enemiesList);
    	}
	}
	public static void enemyRandomMovement (PlayerEntity player, EnemyEntity enemyEntity) { // Updates enemy location while moving around the map // This function also initiates combat if player is too close
		Random randGen = new Random();
		int randomChoice = randGen.nextInt(8) + 1;
		// Decision branching checks what direction the enemy commands to go!
    	if (randomChoice == 1 ) { 
    		EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
		 }
	    else if (randomChoice == 2) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if (randomChoice == 3) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if (randomChoice == 4) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if (randomChoice == 5) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (randomChoice == 6) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (randomChoice == 7) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (randomChoice == 8) {
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
      }
	public static void enemyPursuePlayer (PlayerEntity player, EnemyEntity enemyEntity) {
		Random randGen = new Random();
		int randomChoice = randGen.nextInt(3);
		// Decision branching checks what direction the enemy commands to go!
    	if ((enemyEntity.getyCoordinate() < player.getyCoordinate()) && ((randomChoice == 0) || (player.getxCoordinate() == enemyEntity.getxCoordinate()))) { // This moves the entity down! The y coordinate is raised by movement speed!
    		EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
		 }
	    else if ((enemyEntity.getyCoordinate() > player.getyCoordinate()) && ((randomChoice == 0) || (player.getxCoordinate() == enemyEntity.getxCoordinate()))) { // This moves the entity up! The y coordinate is lowered by movement speed!
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if ((enemyEntity.getxCoordinate() > player.getxCoordinate()) && ((randomChoice == 1) || (player.getyCoordinate() == enemyEntity.getyCoordinate()))) { // This moves the entity left! The x coordinate is lowered by movement speed!
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if ((enemyEntity.getxCoordinate() < player.getxCoordinate()) && ((randomChoice == 1) || (player.getyCoordinate() == enemyEntity.getyCoordinate()))) { // This moves the entity right! The x coordinate is raised by movement speed!
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	     }
	    else if (((enemyEntity.getxCoordinate() > player.getxCoordinate()) && (enemyEntity.getyCoordinate() > player.getyCoordinate())) && (randomChoice == 2)) { // This moves the entity up and left
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (((enemyEntity.getxCoordinate() < player.getxCoordinate()) && (enemyEntity.getyCoordinate() > player.getyCoordinate())) && (randomChoice == 2)) { // This moves the entity up and right
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (((enemyEntity.getxCoordinate() > player.getxCoordinate()) && (enemyEntity.getyCoordinate() < player.getyCoordinate())) && (randomChoice == 2)) { // This moves the entity down and left
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() - enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	    else if (((enemyEntity.getxCoordinate() < player.getxCoordinate()) && (enemyEntity.getyCoordinate() < player.getyCoordinate())) && (randomChoice == 2)) { // This moves the entity down and right
	    	EnemyMapFunctions.updateEnemyLocation(enemyEntity.getxCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getyCoordinate() + enemyEntity.getMovementSpeed(), enemyEntity.getxCoordinate(), enemyEntity.getyCoordinate(), enemyEntity);
	    }
	}
	public static ArrayList<EnemyEntity> enemyDeath (ArrayList<EnemyEntity> enemiesList) {
		ArrayList<EnemyEntity> numberOfEnemiesToRemove = new ArrayList<EnemyEntity>();
		int i = 0;
		for (EnemyEntity enemy: enemiesList) {
			if (enemy.isDead()) {
				numberOfEnemiesToRemove.add(enemy);
			}
			i += 1;
		}
		for (EnemyEntity a: numberOfEnemiesToRemove) {
			enemiesList.remove(a);
		}
		return enemiesList;
	}
}
