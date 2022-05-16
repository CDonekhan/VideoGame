package menuresources;
import java.util.*;

import entitycharacteristics.*;
import tools.*;

public class Menu {
   public static void introduction(Scanner userInput, PlayerEntity player) { // This method prints the introduction text when the game starts
	   System.out.println("");
	   System.out.println("Welcome to...."); // First we introduce the game itself
	   System.out.println("Game Title"); //FIXME
	   System.out.println("Enter any key to continue");
	   userInput.nextLine();
	   System.out.println("");
	   System.out.println("Here is an introduction into the plot of the game"); //FIXME
	   System.out.println("There would be mulitple lines of exposition here!");
	   System.out.println("Enter any key to continue");
	   userInput.nextLine();
	   UserInputMethods.createName(userInput, player);
	   UserInputMethods.createGender(userInput, player);
	   System.out.println(); // Here we introduce how the game works in a general sense
	   System.out.println("Introduction into how the game works and what needs to be done."); //FIXME
	   
	   System.out.println(); // Here we give more exposition for the game to start
	   System.out.println("Exposition into the start of the game loop!"); //FIXME
	   
   }
}

