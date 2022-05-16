package tools;
import java.util.Scanner;

import entitycharacteristics.PlayerEntity;

public class UserInputMethods {
    public static void createName (Scanner userInput, PlayerEntity player) {
       int breakLoopInt = 0;
 	   while(breakLoopInt == 0) { // Here we input the user's name for their character
 		   System.out.println("");
 		   System.out.println("What is your character's name?");
 		   String tempName;
 		   tempName = userInput.nextLine();
 		   if (tempName.length() == 0) {
			   System.out.println();
			   System.out.println("You entered a blank line.");
			   continue;
 		   }
 		   tempName = GeneralTools.capitolizeString(tempName);
 		   player.setName(tempName);
 		   
 		   while(true) { // This loop provides input validation for their choice in name
 			   System.out.println("");
 			   System.out.println("Are you ok with the name " + player.getName());
 			   System.out.println("Yes or No");
 			   String yesOrNo = userInput.nextLine().toLowerCase();
 			   if (yesOrNo.equals("yes")) {
 				  System.out.println();
 				  System.out.println("Alright, lets move on");
 				  System.out.println("Enter any key to continue");
 				  userInput.nextLine();
 				  breakLoopInt = 1;
 				  break;
 			   }
 			   else if(yesOrNo.equals("no")) {
 				   System.out.println();
 				   System.out.println("Let's try another name then.");
 				   break;
 			   }
 			   else {
 				   System.out.println();
 				   System.out.println("The only valid inputs are yes or no");
 			   
 		       }
 		 }
 	  }
    }
    public static void createGender (Scanner userInput, PlayerEntity player) {
        int breakLoopInt = 0;
  	   while(breakLoopInt == 0) { // Here we input the user's name for their character
  		   System.out.println("");
  		   System.out.println("What is your character's gender?");
  		   System.out.println("You can enter Male, Female, or Non-Binary");
  		   String tempGender;
  		   tempGender = userInput.nextLine();
  		   tempGender = GeneralTools.removeWhiteSpace(GeneralTools.uncapitolize(tempGender));
  		   if (tempGender.length() == 0) {
 			   System.out.println();
 			   System.out.println("You entered a blank line.");
 			   continue;
  		   }
  		   else if (tempGender.equals("male")) 	{		   
  			   player.setGender("Male");
  		   }
  		   else if (tempGender.equals("female")) {
  			   player.setGender("Female");
  		   }
  		   else if (tempGender.equals("non-binary")) {
  			   player.setGender("Non-Binary");
  		   }
  		   else {
  			   System.out.println();
  			   System.out.println("That was an invalid input!");
  			   continue;
  		   }
  		   while(true) { // This loop provides input validation for their choice in name
  			   System.out.println("");
  			   System.out.println("Are you ok with the gender " + player.getGender());
  			   System.out.println("Yes or No");
  			   String yesOrNo = userInput.nextLine().toLowerCase();
  			   if (yesOrNo.equals("yes")) {
  				  System.out.println();
  				  System.out.println("Alright, lets move on");
  				  System.out.println("Enter any key to continue");
  				  userInput.nextLine();
  				  breakLoopInt = 1;
  				  break;
  			   }
  			   else if(yesOrNo.equals("no")) {
  				   System.out.println();
  				   System.out.println("Let's try another again.");
  				   break;
  			   }
  			   else {
  				   System.out.println();
  				   System.out.println("The only valid inputs are yes or no");
  			   
  		       }
  		 }
  	  }
     	
     }
}
