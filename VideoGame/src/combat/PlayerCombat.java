package combat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import entitycharacteristics.BodyRegion;
import entitycharacteristics.EnemyEntity;
import entitycharacteristics.EntityBase;
import entitycharacteristics.Organs;
import entitycharacteristics.PlayerEntity;
import mapresources.PlayerMapFunctions;
import tools.GeneralTools;

public class PlayerCombat {
   public static void playerInput (Scanner userInput, PlayerEntity player, ArrayList<EnemyEntity> localEnemiesList, ArrayList<EnemyEntity> enemiesList, ArrayList<EntityBase> sortedFightList) {
		 // Function variables
	     String userChoice;
		 EnemyEntity enemyAttackChoice = null;
		 AttackType attackTypeChoice = null;
		 BodyRegion bodyRegionChoice = null;
		 
		 while(true) { // This while loop determines which enemy the player wants to attack
			 PlayerMapFunctions.localViewDistance (player, enemiesList);
		  	 System.out.println();
		  	 System.out.println("Who do you want to attack?" + " Your options are: ");
		  	 int iterationFactor = 1;
		  	 System.out.print("   ");
		  	 for (EnemyEntity enemy: localEnemiesList) {
		  		 System.out.print(iterationFactor + ". " + enemy.getName() + " ");
		  		 if (iterationFactor % 4 == 0) {
		  			 System.out.println();
		  			 System.out.print("   ");
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 System.out.println();
		  	 userChoice = GeneralTools.removeWhiteSpace(GeneralTools.uncapitolize(userInput.nextLine()));
		  	 iterationFactor = 1;
		  	 for (EnemyEntity enemy: localEnemiesList) {
		  		 String iString = "" + iterationFactor;
		  		 if ((userChoice.equals(iString)) || (userChoice.equals(GeneralTools.removeWhiteSpace(GeneralTools.uncapitolize(enemy.getName()))))) {
		             enemyAttackChoice = enemy;
		  			 iterationFactor = -1;
		  			 break;
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 if (iterationFactor != -1) {
		  		 System.out.println();
		  		 System.out.println("That was an invalid choice!");
		  		 continue;
		  	 }
		  	 break;
		  }
		 
		 while(true) { // This while loop determines what type of attack the player wants to use!
		     PlayerMapFunctions.localViewDistance (player, enemiesList);
		  	 System.out.println();
		  	 System.out.println("Please choose an attack! Your options are: ");
		  	 int iterationFactor = 1;
		  	 for (AttackType attack : player.getAttackList()) {
		  		 System.out.print(iterationFactor + ". " + attack.getName() + " ");
		  		 if (iterationFactor % 4 == 0) {
		  			 System.out.println();
		  			 System.out.print("   ");
		  		 }
		  		 iterationFactor += 1;	  		 
		  	 }
		  	 iterationFactor = 1;
		  	 userChoice = GeneralTools.removeWhiteSpace(GeneralTools.uncapitolize(userInput.nextLine()));
		  	 for (AttackType attack : player.getAttackList()) {
		  		 String iString = "" + iterationFactor;
		  		 if ((userChoice.equals(GeneralTools.uncapitolize(attack.getName()))) || (userChoice.equals (iString))) {
		  			 iterationFactor = -1;
		  			 System.out.println();
		  			 System.out.println("You chose " + attack.getName());
		  			 System.out.println("Enter any key to continue");
		  			 userInput.nextLine();
		  			 attackTypeChoice = attack;
		  			 break;
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 if (iterationFactor != -1) {
		  		 System.out.println();
		  		 System.out.println("That was an invalid attack type!");
		  		 continue;
		  	 }
		  	 break;
			 }
		 while (true) { // Determines what body region the damage should hit on the target!
		     PlayerMapFunctions.localViewDistance (player, enemiesList);
		  	 System.out.println();
		  	 System.out.println("Please a body region to target! Your options are: ");
		  	 System.out.print("   ");
		  	 int iterationFactor = 1;
		  	 for (BodyRegion bodyRegion : enemyAttackChoice.getBodyRegionList()) {
		  		 System.out.print(iterationFactor + ". " + bodyRegion.getName() + " ");
		  		 if (iterationFactor % 4 == 0) {
		  			 System.out.println();
		  			 System.out.print("   ");
		  		 }
		  		 iterationFactor += 1;	  		 
		  	 }
		  	 iterationFactor = 1;
		  	 userChoice = GeneralTools.removeWhiteSpace(GeneralTools.uncapitolize(userInput.nextLine()));
		  	 for (BodyRegion bodyRegion : enemyAttackChoice.getBodyRegionList()) {
		  		 String iString = "" + iterationFactor;
		  		 if ((userChoice.equals(GeneralTools.uncapitolize(bodyRegion.getName()))) || (userChoice.equals (iString))) {
		  			 iterationFactor = -1;
		  			 System.out.println();
		  			 System.out.println("You chose " + bodyRegion.getName());
		  			 System.out.println("Enter any key to continue");
		  			 userInput.nextLine();
		  			 bodyRegionChoice = bodyRegion;
		  			 break;
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 if (iterationFactor != -1) {
		  		 System.out.println();
		  		 System.out.println("That was an invalid attack type!");
		  		 continue;
		  	 }
		  	 break;
			 }			 
		 
		   playerAttack(player, enemyAttackChoice, userInput, sortedFightList, attackTypeChoice, bodyRegionChoice);
   }

	   public static void playerAttack (PlayerEntity player, EnemyEntity enemy, Scanner userInput, ArrayList<EntityBase> sortedFightList, AttackType attackTypeChoice, BodyRegion bodyRegionChoice) {
		   double totalDamage;
		   double currentDamage;
		   int numOrgans;
		   double randomNum;
		   Random randGen = new Random();
		   ArrayList<Organs> randomOrganList = bodyRegionChoice.getOrgans();
		   Collections.shuffle(randomOrganList);
		   totalDamage = player.getBaseAttackDamage() + attackTypeChoice.getDamage();
		   numOrgans = bodyRegionChoice.getOrgans().size();
		   int iterationNum = 1;
		   for (Organs currentOrgan : randomOrganList) { // This for loop determines how much damage is done to each organ!
			   if (iterationNum == numOrgans) {
				   currentOrgan.setHealth(currentOrgan.getHealth() - totalDamage);
			   }
			   else {
			   randomNum = (randGen.nextInt(100) + 1) / 100.0;
			   currentDamage = totalDamage * randomNum;
			   totalDamage = totalDamage - (currentDamage);
			   currentOrgan.setHealth(currentOrgan.getHealth() - currentDamage);
			   }
			   iterationNum += 1;
		   }
		   System.out.println();
		   System.out.println("You landed a " + attackTypeChoice.getName() + " attack on " + enemy.getName() + "'s " + bodyRegionChoice.getName() + "!");
		   System.out.print("Damage report: ");
		   iterationNum = 1;
		   for (Organs currentOrgan : bodyRegionChoice.getOrgans()) {
			   if (iterationNum == numOrgans) {
				   System.out.print("and " + currentOrgan.getName() + "'s health is now "); 
				   System.out.printf("%.2f", currentOrgan.getHealth());
				   System.out.print(".");
			   }
			   System.out.print(currentOrgan.getName() + "'s health is now ");
			   System.out.printf("%.2f", currentOrgan.getHealth());
			   System.out.print(", ");
		   }
		   System.out.println();
		   System.out.println("Enter any key to continue");
		   userInput.nextLine();
		   CombatResources.endBattle (player, enemy, sortedFightList);
	   }
}
