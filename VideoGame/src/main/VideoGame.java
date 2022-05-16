package main;
import java.util.Scanner;
import initialization.EntityInitialization;
import entitycharacteristics.*;
import menuresources.*;

public class VideoGame {
   
   public static void main (String[] args) {
	  
	  PlayerEntity player = EntityInitialization.newPlayerInitialize(); // Initialize new player to game	  
	  Scanner userInput = new Scanner(System.in); // Input scanner for player commands
      Menu.introduction(userInput, player); // Gives player introduction
      GameLoop.MainGameLoop(userInput, player); // Starts the main game loop
      userInput.close(); // Ensures no resource leaking
   }
}
