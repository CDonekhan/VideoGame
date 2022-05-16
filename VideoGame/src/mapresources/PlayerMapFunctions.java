package mapresources;

import java.util.ArrayList;

import entitycharacteristics.*;

public class PlayerMapFunctions {
	
	public static void playerMovement (String userChoice, PlayerEntity player) { // Updates player location while moving around the map
		// Decision branching checks what direction the player commands to go! 
		
		if (userChoice.equals("s")) { // This moves the entity down! The y coordinate is raised by movement speed!
    		  updatePlayerLocation(player.getxCoordinate(), player.getyCoordinate() + player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
		   }
	    else if (userChoice.equals("w")) { // This moves the entity up! The y coordinate is lowered by movement speed!
		   updatePlayerLocation(player.getxCoordinate(), player.getyCoordinate() - player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	     }
	    else if (userChoice.equals("a")) { // This moves the entity left! The x coordinate is lowered by movement speed!
		    updatePlayerLocation(player.getxCoordinate() - player.getMovementSpeed(), player.getyCoordinate(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	   }
	    else if (userChoice.equals("d")) { // This moves the entity right! The x coordinate is raised by movement speed!
		    updatePlayerLocation(player.getxCoordinate() + player.getMovementSpeed(), player.getyCoordinate(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	   }
	    else if ((userChoice.equals("q")) || (userChoice.equals("aw")) || (userChoice.equals("wa"))) {
	    	updatePlayerLocation(player.getxCoordinate() - player.getMovementSpeed(), player.getyCoordinate() - player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	    }
	    else if ((userChoice.equals("e")) || (userChoice.equals("wd")) || (userChoice.equals("dw"))) {
	    	updatePlayerLocation(player.getxCoordinate() + player.getMovementSpeed(), player.getyCoordinate() - player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	    }
	    else if ((userChoice.equals("z")) || (userChoice.equals("as")) || (userChoice.equals("sa"))) {
	    	updatePlayerLocation(player.getxCoordinate() - player.getMovementSpeed(), player.getyCoordinate() + player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	    }
	    else if ((userChoice.equals("c")) || (userChoice.equals("ds")) || (userChoice.equals("sd"))) {
	    	updatePlayerLocation(player.getxCoordinate() + player.getMovementSpeed(), player.getyCoordinate() + player.getMovementSpeed(), player.getxCoordinate(), player.getyCoordinate(), player, userChoice);
	    }
	    else {
		    System.out.println("You input was invalid"); //FIXME
	   }
    }
    public static void updatePlayerLocation (int currentxcoordinate, int currentycoordinate, int previousxcoordinate, int previousycoordinate, PlayerEntity player, String userChoice) { // Initializes player location inside of new region
    	int finalxCoordinate = 0;
    	int finalyCoordinate = 0;
    	// This decision branch does not allow a player to move in the specified direction if a certain symbol is present
    	if ((previousxcoordinate < currentxcoordinate) && (previousycoordinate < currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate < currentxcoordinate) && (previousycoordinate > currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate > currentxcoordinate) && (previousycoordinate > currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if ((previousxcoordinate > currentxcoordinate) && (previousycoordinate < currentycoordinate)) {
    		int j = 0;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousxcoordinate < currentxcoordinate) {
    		int j = 0;
    		finalyCoordinate = currentycoordinate;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate + 1 + i), currentycoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousxcoordinate > currentxcoordinate) {
    		int j = 0;
    		finalyCoordinate = currentycoordinate;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '|') || (MapData.accessTutorialZone((previousxcoordinate - 1 - i), currentycoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousycoordinate < currentycoordinate) {
    		int j = 0;
    		finalxCoordinate = currentxcoordinate;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate + 1 + i), currentxcoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	else if (previousycoordinate > currentycoordinate) {
    		int j = 0;
    		finalxCoordinate = currentxcoordinate;
    		for (int i = 0; i < player.getMovementSpeed(); ++i) {
    			if (((MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '|') || (MapData.accessTutorialZone((previousycoordinate - 1 - i), currentxcoordinate) == '_')) && i == 0) {
    				System.out.println("That area is inaccessable!");
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
        		player.setxCoordinate(finalxCoordinate);
        		player.setyCoordinate(finalyCoordinate);
    	    }
    	}
    	}
    	
    public static void localViewDistance (PlayerEntity player, ArrayList<EnemyEntity> enemiesList) { // Limits the player's view of the map based on their viewDistance
    	int i = 0;
    	for (i = 0; i < MapData.tutorialZone.length; ++i) { // Limits the number of rows visible
        	if (Math.abs(i - player.getyCoordinate()) < player.getViewDistance()) {
	            for(int j = 0; j < MapData.tutorialZone[i].length; ++j) { // Limits the number of columns visible
	            	if (Math.abs(j - player.getxCoordinate()) < player.getViewDistance() + (player.getViewDistance() * 0.5)) {
	            		int k = 0;
	            		if (enemiesList.size() == 0) {
	            			if ((i == player.getyCoordinate()) && (j == player.getxCoordinate())) {
		            			System.out.print(player.getMapSymbol());
		            			k = -1;
		            		}
	            		}
	            		else {
	            		for (k = 0; k < 0 + enemiesList.size(); ++k) {
	            			if ((i == player.getyCoordinate()) && (j == player.getxCoordinate())) {
		            			System.out.print(player.getMapSymbol());
		            			k = -1;
		            			break;
		            		}
		            		else if ((i == enemiesList.get(k).getyCoordinate()) && (j == enemiesList.get(k).getxCoordinate())) {
		            			System.out.print(enemiesList.get(k).getMapSymbol());
		            			k = -1;
		            			break;
		            		}
	            			}
	            		}
	            		if (k != -1) {
	            			System.out.print(MapData.tutorialZone[i][j]);
	            		}
	            		}
	            		
	            		
	            	}
	            }
        	if (Math.abs(i - player.getyCoordinate()) < player.getViewDistance()) {
        		System.out.println();
        	}
	            
        	}
        }  	
    }
