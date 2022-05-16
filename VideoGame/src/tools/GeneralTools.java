package tools;
import java.util.*;
public class GeneralTools {
   public static String capitolizeString(String uncapitolized) {
	   Scanner stringScanner = new Scanner(uncapitolized);
	   String finalString = "";
	   while(stringScanner.hasNext()) {
		   String currentLine = stringScanner.next();
		   currentLine = currentLine.substring(0,1).toUpperCase() + currentLine.substring(1);
		   finalString = finalString + currentLine + " ";
	   }
	   stringScanner.close();
	   finalString = finalString.substring(0,finalString.length() - 1);
	   return finalString;
   }
   public static String removeWhiteSpace (String hasWhiteSpace) {
	   String noWhiteSpace = "";
	   for (int i = 0; i < hasWhiteSpace.length(); ++i) {
		   if (Character.isWhitespace(hasWhiteSpace.charAt(i))) {
			   continue;
		   }
		   else {
			   noWhiteSpace = noWhiteSpace + hasWhiteSpace.charAt(i);
		   }
	   }
       return noWhiteSpace;
	   
   }
   public static String uncapitolize (String capitolized) {
	   String uncapitolized = "";
	   for (int i = 0; i < capitolized.length(); ++i) {
		  if (Character.isLetter(capitolized.charAt(i))) {
			  uncapitolized = uncapitolized + Character.toLowerCase(capitolized.charAt(i));
		  }
		  else {
			  uncapitolized = uncapitolized + capitolized.charAt(i);
		  }
	   }
	   return uncapitolized;
   }
}

