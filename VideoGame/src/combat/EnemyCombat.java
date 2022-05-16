package combat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import entitycharacteristics.BodyRegion;
import entitycharacteristics.EntityBase;
import entitycharacteristics.Organs;
import entitycharacteristics.PlayerEntity;
import mapresources.PlayerMapFunctions;
import tools.GeneralTools;

public class EnemyCombat {
   public static void enemyChoice (EntityBase enemy, PlayerEntity player, Scanner userInput) {
	   // Function variables
	   Random randGen = new Random();
	   int enemyChoice;
	   BodyRegion bodyRegionChoice = new BodyRegion();
	   AttackType attackTypeChoice = new AttackType();
	   
		 while(true) { // This while loop determines what type of attack the enemy uses!
             // Choose which attack to use with random number generator
			 enemyChoice = randGen.nextInt(enemy.getAttackList().size()) + 1;
		  	 int iterationFactor = 1;
		  	 for (AttackType attack : enemy.getAttackList()) {
		  		 String iString = "" + iterationFactor;
		  		 if (enemyChoice == iterationFactor) {
		  			 iterationFactor = -1;
		  			 attackTypeChoice = attack;
		  			 break;
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 if (iterationFactor != -1) {
		  		 System.out.println("Something went wrong for the Attack Type at enemyChoice!");
		  	 }
		  	 break;
			 }
		 while (true) { // Determines what body region the damage should hit on the target!
			 enemyChoice = randGen.nextInt(player.getBodyRegionList().size()) + 1;
			 
			 int iterationFactor = 1;
		  	 for (BodyRegion bodyRegion : player.getBodyRegionList()) {
		  		 String iString = "" + iterationFactor;
		  		 if (enemyChoice == iterationFactor) {
		  			 iterationFactor = -1;
		  			 bodyRegionChoice = bodyRegion;
		  			 break;
		  		 }
		  		 iterationFactor += 1;
		  	 }
		  	 if (iterationFactor != -1) {
		  		 System.out.println("Something went wrong for the bodyRegion at enemyChoice!");
		  	 }
		  	 break;
			 }	
		 enemyAttack(enemy, player, userInput, attackTypeChoice, bodyRegionChoice);
   }
   public static void enemyAttack (EntityBase enemy, PlayerEntity player, Scanner userInput, AttackType attackTypeChoice, BodyRegion bodyRegionChoice) {
	   double totalDamage;
	   double currentDamage;
	   int numOrgans;
	   double randomNum;
	   Random randGen = new Random();
	   ArrayList<Organs> randomOrganList = bodyRegionChoice.getOrgans();
	   Collections.shuffle(randomOrganList);
	   totalDamage = enemy.getBaseAttackDamage() + attackTypeChoice.getDamage();
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
	   System.out.println(enemy.getName() + " landed a " + attackTypeChoice.getName() + " attack on " + player.getName() + "'s " + bodyRegionChoice.getName() + "!");
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
   }
}
