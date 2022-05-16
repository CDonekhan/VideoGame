package main;

import java.util.ArrayList;

import entitycharacteristics.*;
import mapresources.PlayerMapFunctions;

public class GameLoopResources {
	public static void playerMenuStatus(PlayerEntity player, ArrayList<EnemyEntity> enemiesList) {
		System.out.println("---------------------");
		System.out.println(player.getName() + " is currently in the " + player.getRegion() + " region."); // Displays player current region
		System.out.println("x/y coordinates: " + player.getxCoordinate() + "," + player.getyCoordinate()); // FIXME
		PlayerMapFunctions.localViewDistance(player, enemiesList); // Prints map for player visual
	   }
    public static void endDies (PlayerEntity player) {
    	System.out.println("You Died!");
    	player.setDead(true);
    }
}
