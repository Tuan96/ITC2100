
import java.util.Scanner;
/**
 *
 * @author Tony
 */

public class BadSubscriptCaught {
    
   public static void main(String[] args)
   {
       String firstName[] = {"Tony", "Alexa", "Macintosh", "Steve", "Anna", "Jessica", "Alexandra", "Lily", "Jack", "Taylor"};
      
       Scanner input = new Scanner(System.in);
      
       try
       {
           System.out.println("Here is a list of 10 first names from 1 to 10, respectively: Tony | Alexa | Macintosh | Steve | Anna | Jessica | Alexandra | Lily | Jack | Taylor ");
           
           System.out.print("Please enter a number for the name to pop up: ");
           int nmber = input.nextInt();
          
           System.out.println("The first name at the number " + nmber + ": " + firstName[nmber-1]); //an array index ranges from 0 to 9, so I put index -1 so users can type from 1->10. 
       }
       
       catch(ArrayIndexOutOfBoundsException e)
       {          
           System.out.println("The number entered is out of range. This results in the ArrayIndexOutOfBoundsException error. Please enter another number between 1->10.");
           e.printStackTrace();
       }
   }
}