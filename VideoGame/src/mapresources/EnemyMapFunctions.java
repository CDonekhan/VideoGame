package mapresources;
import entitycharacteristics.*;

import java.util.Random;

import combat.*;
import entitybehavior.*;
public class EnemyMapFunctions {

	public static void updateEnemyLocation (int currentxcoordinate, int currentycoordinate, int previousxcoordinate, int previousycoordinate, EnemyEntity enemyEntity) { // Initializes enemy location inside of new region
    	int finalxCoordinate = 0;
    	int finalyCoordinate = 0;
    	if ((previousxcoordinate < currentxcoordinate) && (previousycoordinate < currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate + 1 + i) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate + 1 + i) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate + 1 + i) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate + 1 + i) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate + 1 + i;
    				finalxCoordinate = previousxcoordinate + 1 + i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate < currentxcoordinate) && (previousycoordinate > currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate - 1 - i) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate - 1 - i) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate - 1 - i) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), previousycoordinate - 1 - i) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate - 1 - i;
    				finalxCoordinate = previousxcoordinate + 1 + i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate > currentxcoordinate) && (previousycoordinate > currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate - 1 - i) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate - 1 - i) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate - 1 - i) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate - 1 - i) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate - 1 - i;
    				finalxCoordinate = previousxcoordinate - 1 - i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate > currentxcoordinate) && (previousycoordinate < currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate + 1 + i) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate + 1 + i) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate + 1 + i) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), previousycoordinate + 1 + i) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate + 1 + i;
    				finalxCoordinate = previousxcoordinate - 1 - i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousxcoordinate < currentxcoordinate) {
    		int j = 0;
    		finalyCoordinate = currentycoordinate;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable for Entity!"); //FIXME
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '_')) {
    				break;
    			}
    			else {
    				finalxCoordinate = previousxcoordinate + 1 + i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousxcoordinate > currentxcoordinate) {
    		int j = 0;
    		finalyCoordinate = currentycoordinate;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable for Entity!"); //FIXME
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '_')) {
    				break;
    			}
    			else {
    				finalxCoordinate = previousxcoordinate - 1 - i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousycoordinate < currentycoordinate) {
    		int j = 0;
    		finalxCoordinate = currentxcoordinate;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable for Entity!"); //FIXME
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate + 1 + i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousycoordinate > currentycoordinate) {
    		int j = 0;
    		finalxCoordinate = currentxcoordinate;
    		for (int i = 0; i < enemyEntity.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable for Entity!"); //FIXME
    				j = 1;
    				break;
    			}
    			else if ((MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '_')) {
    				break;
    			}
    			else {
    				finalyCoordinate = previousycoordinate - 1 - i;
    			}
    		}
    	    if (j == 0) {
        		enemyEntity.setxCoordinate(finalxCoordinate);
        		enemyEntity.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	}
}
