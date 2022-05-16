package initialization;

import java.util.ArrayList;

import combat.AttackType;
import entitycharacteristics.BodyRegion;
import entitycharacteristics.Organs;

public class SupportingInitializations {
	  public static AttackType attackTypeInitialize (String attackName) { // This method takes a string and outputs the attack type with that name!
		  AttackType returnAttack = null;
		  ArrayList<AttackType> attackList = new ArrayList<AttackType>();
		  AttackType swing = new AttackType();
		  swing.setName("Swing");
		  swing.setDamage(100);
		  attackList.add(swing);
		  
		  AttackType thrust = new AttackType();
		  thrust.setName("Thrust");
		  thrust.setDamage(50);
		  attackList.add(thrust);
		  
		  for (AttackType attack : attackList) {
			  if (attack.getName().equals(attackName)) {
				  returnAttack = attack;
				  break;
			  }
		  }
		  return returnAttack;
	  }
	  public static BodyRegion bodyRegionInitialize (String bodyRegionName) { // This method takes a string and outputs the attack type with that name!
		  BodyRegion returnBodyRegion = null;
		  ArrayList<BodyRegion> bodyRegionList = new ArrayList<BodyRegion>();
		  
		  //Initialize Body Regions
		  BodyRegion upperLeftArm = new BodyRegion();
		  upperLeftArm.setName("Upper Left Arm");
		  upperLeftArm.setOrgans(null);
		  bodyRegionList.add(upperLeftArm);
		  
		  BodyRegion lowerLeftArm = new BodyRegion();
		  lowerLeftArm.setName("Lower Left Arm");
		  lowerLeftArm.setOrgans(null);
		  bodyRegionList.add(lowerLeftArm);
	
		  BodyRegion upperRightArm = new BodyRegion();
		  upperRightArm.setName("Upper Right Arm");
		  upperRightArm.setOrgans(null);
		  bodyRegionList.add(upperRightArm);
		
		  BodyRegion lowerRightArm = new BodyRegion();
		  lowerRightArm.setName("Lower Right Arm");
		  lowerRightArm.setOrgans(null);
		  bodyRegionList.add(lowerRightArm);
		
		  BodyRegion upperLeftLeg = new BodyRegion();
		  upperLeftLeg.setName("Upper Left Leg");
		  upperLeftLeg.setOrgans(null);
		  bodyRegionList.add(upperLeftLeg);
		
		  BodyRegion lowerLeftLeg = new BodyRegion();
		  lowerLeftLeg.setName("Lower Left Leg");
		  lowerLeftLeg.setOrgans(null);
		  bodyRegionList.add(lowerLeftLeg);
		 
		  BodyRegion upperRightLeg = new BodyRegion();
		  upperRightLeg.setName("Upper Right Leg");
		  upperRightLeg.setOrgans(null);
		  bodyRegionList.add(upperRightLeg);
		 
		  BodyRegion lowerRightLeg = new BodyRegion();
		  lowerRightLeg.setName("Lower Right Leg");
		  lowerRightLeg.setOrgans(null);
		  bodyRegionList.add(lowerRightLeg);
		  
		  BodyRegion upperHead = new BodyRegion();
		  upperHead.setName("Upper Head");
		  upperHead.setOrgans(null);
		  bodyRegionList.add(upperHead);
		  
		  BodyRegion lowerHead = new BodyRegion();
		  lowerHead.setName("Lower Head");
		  lowerHead.setOrgans(null);
		  bodyRegionList.add(lowerHead);
		  
		  BodyRegion upperTorso = new BodyRegion();
		  upperTorso.setName("Upper Torso");
		  upperTorso.setOrgans(null);
		  bodyRegionList.add(upperTorso);
		  
		  BodyRegion lowerTorso = new BodyRegion();
		  lowerTorso.setName("Lower Torso");
		  lowerTorso.setOrgans(null);
		  bodyRegionList.add(lowerTorso);
		  
		  
		  for (BodyRegion region : bodyRegionList) {
			  if (region.getName().equals(bodyRegionName)) {
				  returnBodyRegion = region;
				  break;
			  }
		  }
		  return returnBodyRegion;
		  
	  }
	  public static Organs organInitialize (String organName, int health, boolean causeDeath) { // This method takes a string and outputs the attack type with that name!
		  Organs returnOrgan = null;
		  ArrayList<Organs> organList = new ArrayList<Organs>();
		  
		  //Initialize Body Regions
		  
		  // UPPER LEFT ARM
		  Organs leftShoulder = new Organs();
		  leftShoulder.setName("Left Shoulder");
		  leftShoulder.setHealth(health);
		  leftShoulder.setCauseDeath(causeDeath);
		  organList.add(leftShoulder);
		  
		  Organs leftElbow = new Organs();
		  leftElbow.setName("Left Elbow");
		  leftElbow.setHealth(health);
		  leftElbow.setCauseDeath(causeDeath);
		  organList.add(leftElbow);
		  // LOWER LEFT ARM
		  Organs leftForearm = new Organs();
		  leftForearm.setName("Left Forearm");
		  leftForearm.setHealth(health);
		  leftForearm.setCauseDeath(causeDeath);
		  organList.add(leftForearm);
		 
		  Organs lefthand = new Organs();
		  lefthand.setName("Left Hand");
		  lefthand.setHealth(health);
		  lefthand.setCauseDeath(causeDeath);
		  organList.add(lefthand);
		  // UPPER Right ARM
		  Organs rightShoulder = new Organs();
		  rightShoulder.setName("Right Shoulder");
		  rightShoulder.setHealth(health);
		  rightShoulder.setCauseDeath(causeDeath);
		  organList.add(rightShoulder);
		  
		  Organs rightElbow = new Organs();
		  rightElbow.setName("Right Elbow");
		  rightElbow.setHealth(health);
		  rightElbow.setCauseDeath(causeDeath);
		  organList.add(rightElbow);
		  // LOWER Right ARM
		  Organs rightForearm = new Organs();
		  rightForearm.setName("Right Forearm");
		  rightForearm.setHealth(health);
		  rightForearm.setCauseDeath(causeDeath);
		  organList.add(rightForearm);
		 
		  Organs rightHand = new Organs();
		  rightHand.setName("Right Hand");
		  rightHand.setHealth(health);
		  rightHand.setCauseDeath(causeDeath);
		  organList.add(rightHand);
		  //UPPER LEFT LEG
		  Organs leftThigh = new Organs();
		  leftThigh.setName("Left Thigh");
		  leftThigh.setHealth(health);
		  leftThigh.setCauseDeath(causeDeath);
		  organList.add(leftThigh);
		  
		  Organs leftKnee = new Organs();
		  leftKnee.setName("Left Knee");
		  leftKnee.setHealth(health);
		  leftKnee.setCauseDeath(causeDeath);
		  organList.add(leftKnee);
		  //LOWER LEFT LEG
		  Organs leftCalf = new Organs();
		  leftCalf.setName("Left Calf");
		  leftCalf.setHealth(health);
		  leftCalf.setCauseDeath(causeDeath);
		  organList.add(leftCalf);
		  
		  Organs leftAnkle = new Organs();
		  leftAnkle.setName("Left Ankle");
		  leftAnkle.setHealth(health);
		  leftAnkle.setCauseDeath(causeDeath);
		  organList.add(leftAnkle);
		  
		  Organs leftFoot = new Organs();
		  leftFoot.setName("Left Foot");
		  leftFoot.setHealth(health);
		  leftFoot.setCauseDeath(causeDeath);
		  organList.add(leftFoot);
		  
		  //UPPER RIGHT LEG
		  Organs rightThigh = new Organs();
		  rightThigh.setName("Right Thigh");
		  rightThigh.setHealth(health);
		  rightThigh.setCauseDeath(causeDeath);
		  organList.add(rightThigh);
		  
		  Organs rightKnee = new Organs();
		  rightKnee.setName("Right Knee");
		  rightKnee.setHealth(health);
		  rightKnee.setCauseDeath(causeDeath);
		  organList.add(rightKnee);
		  //LOWER RIGHT LEG
		  Organs rightCalf = new Organs();
		  rightCalf.setName("Right Calf");
		  rightCalf.setHealth(health);
		  rightCalf.setCauseDeath(causeDeath);
		  organList.add(rightCalf);
		  
		  Organs rightAnkle = new Organs();
		  rightAnkle.setName("Right Ankle");
		  rightAnkle.setHealth(health);
		  rightAnkle.setCauseDeath(causeDeath);
		  organList.add(rightAnkle);
		  
		  Organs rightFoot = new Organs();
		  rightFoot.setName("Right Foot");
		  rightFoot.setHealth(health);
		  rightFoot.setCauseDeath(causeDeath);
		  organList.add(rightFoot);
		  // Upper Head
		  Organs leftEye = new Organs();
		  leftEye.setName("Left Eye");
		  leftEye.setHealth(health);
		  leftEye.setCauseDeath(causeDeath);
		  organList.add(leftEye);
		  
		  Organs rightEye = new Organs();
		  rightEye.setName("Right Eye");
		  rightEye.setHealth(health);
		  rightEye.setCauseDeath(causeDeath);
		  organList.add(rightEye);

		  Organs brain = new Organs();
		  brain.setName("Brain");
		  brain.setHealth(health);
		  brain.setCauseDeath(causeDeath);
		  organList.add(brain);
		  //LOWER HEAD
		  Organs mouth = new Organs();
		  mouth.setName("Mouth");
		  mouth.setHealth(health);
		  mouth.setCauseDeath(causeDeath);
		  organList.add(mouth);
		  
		  Organs nose = new Organs();
		  nose.setName("Nose");
		  nose.setHealth(health);
		  nose.setCauseDeath(causeDeath);
		  organList.add(nose);
		  //UPPER TORSO
		  Organs heart = new Organs();
		  heart.setName("Heart");
		  heart.setHealth(health);
		  heart.setCauseDeath(causeDeath);
		  organList.add(heart);
		  
		  Organs leftLung = new Organs();
		  leftLung.setName("Left Lung");
		  leftLung.setHealth(health);
		  leftLung.setCauseDeath(causeDeath);
		  organList.add(leftLung);
		  
		  Organs rightLung = new Organs();
		  rightLung.setName("Right Lung");
		  rightLung.setHealth(health);
		  rightLung.setCauseDeath(causeDeath);
		  organList.add(rightLung);
		  
		  Organs liver = new Organs();
		  liver.setName("Liver");
		  liver.setHealth(health);
		  liver.setCauseDeath(causeDeath);
		  organList.add(liver);
		  
		  Organs upperSpine = new Organs();
		  upperSpine.setName("Upper Spine");
		  upperSpine.setHealth(health);
		  upperSpine.setCauseDeath(causeDeath);
		  organList.add(upperSpine);
		  //Lower Torso
          // Note that this section also involves the spine!
		  Organs intestines = new Organs();
		  intestines.setName("Intestines");
		  intestines.setHealth(health);
		  intestines.setCauseDeath(causeDeath);
		  organList.add(intestines);
		  
		  Organs leftKidney = new Organs();
		  leftKidney.setName("Left Kidney");
		  leftKidney.setHealth(health);
		  leftKidney.setCauseDeath(causeDeath);
		  organList.add(leftKidney);
		  
		  Organs rightKidney = new Organs();
		  rightKidney.setName("Right Kidney");
		  rightKidney.setHealth(health);
		  rightKidney.setCauseDeath(causeDeath);
		  organList.add(rightKidney);

		  Organs gonads = new Organs();
		  gonads.setName("Gonads");
		  gonads.setHealth(health);
		  gonads.setCauseDeath(causeDeath);
		  organList.add(gonads);
		  
		  Organs lowerSpine = new Organs();
		  lowerSpine.setName("Lower Spine");
		  lowerSpine.setHealth(health);
		  lowerSpine.setCauseDeath(causeDeath);
		  organList.add(lowerSpine);
		  
		  // We get the appropriate organ with the correct name
		  for (Organs organ : organList) {
			  if (organ.getName().equals(organName)) {
				  returnOrgan = organ;
				  break;
			  }
		  }
		  return returnOrgan;
		  
	  }
	  public static ArrayList<BodyRegion> standardOrganLayout() {
		  BodyRegion currentBodyRegion = new BodyRegion();
		  ArrayList<BodyRegion> bodyRegionList = new ArrayList<BodyRegion>();
		  ArrayList<Organs> tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Upper Head");
		  tempOrgansList.add(organInitialize("Left Eye", 100, false));
		  tempOrgansList.add(organInitialize("Right Eye", 100, false));
		  tempOrgansList.add(organInitialize("Brain", 100, true));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
	
		  currentBodyRegion = bodyRegionInitialize("Lower Head");
		  tempOrgansList.add(organInitialize("Mouth", 100, false));
		  tempOrgansList.add(organInitialize("Nose", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
	
		  currentBodyRegion = bodyRegionInitialize("Upper Torso");
		  tempOrgansList.add(organInitialize("Heart", 100, true));
		  tempOrgansList.add(organInitialize("Left Lung", 100, false));
		  tempOrgansList.add(organInitialize("Right Lung", 100, false));
		  tempOrgansList.add(organInitialize("Liver", 100, false));
		  tempOrgansList.add(organInitialize("Upper Spine", 100, true));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		
		  currentBodyRegion = bodyRegionInitialize("Lower Torso");
		  tempOrgansList.add(organInitialize("Intestines", 100, false));
		  tempOrgansList.add(organInitialize("Left Kidney", 100, false));
		  tempOrgansList.add(organInitialize("Right Kidney", 100, false));
		  tempOrgansList.add(organInitialize("Lower Spine", 100, true));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();	 
		  
		  currentBodyRegion = bodyRegionInitialize("Upper Left Arm");
		  tempOrgansList.add(organInitialize("Left Shoulder", 100, false));
		  tempOrgansList.add(organInitialize("Left Elbow", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Upper Right Arm");
		  tempOrgansList.add(organInitialize("Right Shoulder", 100, false));
		  tempOrgansList.add(organInitialize("Right Elbow", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Lower Left Arm");
		  tempOrgansList.add(organInitialize("Left Forearm", 100, false));
		  tempOrgansList.add(organInitialize("Left Hand", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Lower Right Arm");
		  tempOrgansList.add(organInitialize("Right Forearm", 100, false));
		  tempOrgansList.add(organInitialize("Right Hand", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Upper Left Leg");
		  tempOrgansList.add(organInitialize("Left Thigh", 100, false));
		  tempOrgansList.add(organInitialize("Left Knee", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Upper Right Leg");
		  tempOrgansList.add(organInitialize("Right Thigh", 100, false));
		  tempOrgansList.add(organInitialize("Right Knee", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Lower Left Leg");
		  tempOrgansList.add(organInitialize("Left Calf", 100, false));
		  tempOrgansList.add(organInitialize("Left Ankle", 100, false));
		  tempOrgansList.add(organInitialize("Left Foot", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
		  currentBodyRegion = bodyRegionInitialize("Lower Right Leg");
		  tempOrgansList.add(organInitialize("Right Calf", 100, false));
		  tempOrgansList.add(organInitialize("Right Ankle", 100, false));
		  tempOrgansList.add(organInitialize("Right Foot", 100, false));
		  currentBodyRegion.setOrgans(tempOrgansList);
		  bodyRegionList.add(currentBodyRegion);
		  tempOrgansList = new ArrayList<Organs>();
		  
 
		  
		  return bodyRegionList;
	  }
}
