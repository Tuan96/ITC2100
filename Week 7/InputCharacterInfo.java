
import java.util.Scanner;

/**
 * Chapter 7-1: Modified code of Figure 7-3, Java Programming (Farrell, 2015).
 * @author Tony
 */
public class InputCharacterInfo {
    
public static void main(String[] args) {
    
//user input.     
Scanner input = new Scanner(System.in);
        
System.out.println("Enter a character here: ");

char aChar = input.next().charAt(0);

if(Character.isUpperCase(aChar))
System.out.println(aChar + " is uppercase");

else
System.out.println(aChar + " is not uppercase");

if(Character.isLowerCase(aChar)) 
System.out.println(aChar + " is lowercase");

else
System.out.println(aChar + " is not lowercase");

aChar = Character.toLowerCase(aChar);

System.out.println("After toLowerCase(), aChar is " + aChar);

aChar = Character.toUpperCase(aChar);

System.out.println("After toUpperCase(), aChar is " + aChar);

if(Character.isLetterOrDigit(aChar))
System.out.println(aChar + " is a letter or digit");

else
System.out.println(aChar + " is neither a letter nor a digit");

if(Character.isWhitespace(aChar))
System.out.println(aChar + " is whitespace");

else
System.out.println(aChar + " is not whitespace");

}

}