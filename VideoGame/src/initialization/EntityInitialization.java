package initialization;

import java.util.ArrayList;

import combat.AttackType;
import entitycharacteristics.*;
import tools.Generators;
import tools.UserInputMethods; 

public class EntityInitialization { // Creates a new player and adds default values

    public static PlayerEntity newPlayerInitialize () { // This function initializes the player
	    PlayerEntity player = new PlayerEntity();
	    player.setEntityType("player");
	    player.setMapSymbol('@');
	    player.setViewDistance(200);
	    player.setRegion("tutorialZone");
	    player.setMovementSpeed(2);
        player.setxCoordinate(14);
        player.setyCoordinate(14);
        player.setBlood(100);
        player.setBaseAttackDamage(50000);
        player.setDead(false);
        player.setFightSpeed(5);
        player.setBodyRegionList(SupportingInitializations.standardOrganLayout());
        ArrayList<AttackType> playerAttackList = new ArrayList<AttackType>();
        playerAttackList.add(SupportingInitializations.attackTypeInitialize("Swing"));
        playerAttackList.add(SupportingInitializations.attackTypeInitialize("Thrust"));
        player.setAttackList(playerAttackList);
	    return player;
   }
    public static EnemyHuman EnemyInitialize () { // This function initializes an enemyHuman type
	    EnemyHuman enemyHuman = new EnemyHuman();
	    enemyHuman.setGender(Generators.genderGenerator());
	    enemyHuman.setEntityType("enemy");
	    enemyHuman.setName(Generators.nameGenerator(enemyHuman.getGender()));
	    enemyHuman.setTooCloseToPlayer(2);
	    enemyHuman.setMapSymbol(enemyHuman.getName().charAt(0));
	    enemyHuman.setViewDistance(200);
	    enemyHuman.setRegion("tutorialZone");
	    enemyHuman.setMovementSpeed(1);
	    enemyHuman.setxCoordinate(2);
	    enemyHuman.setyCoordinate(2);
	    enemyHuman.setCombatDistance(4);
	    enemyHuman.setBlood(100);
	    enemyHuman.setBaseAttackDamage(5);
	    enemyHuman.setDead(false);
	    enemyHuman.setFightSpeed(1);
        ArrayList<AttackType> enemyHumanAttackList = new ArrayList<AttackType>();
        enemyHuman.setBodyRegionList(SupportingInitializations.standardOrganLayout());
        enemyHumanAttackList.add(SupportingInitializations.attackTypeInitialize("Swing"));
        enemyHumanAttackList.add(SupportingInitializations.attackTypeInitialize("Thrust"));
        enemyHuman.setAttackList(enemyHumanAttackList);
	    return enemyHuman;
   }

}
