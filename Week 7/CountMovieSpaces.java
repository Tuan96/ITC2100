
import java.util.Scanner;

/**
 * Chapter 7-3a: count the spaces of a quote, Java Programming (Farrell, 2015).
 * @author Tony
 */
public class CountMovieSpaces {

public static void main(String args[]) {
       
    //Quote from the character Red (Morgan Freeman) in the movie "The Shawshank Redemption" (1994). 
    String movieQuote = "Get busy living or get busy dying.";
         
    Scanner in = new Scanner(System.in);
         
    int spacescount = 0;
    
    for(int i = 0; i < movieQuote.length(); i++) 
        
    spacescount += (Character.isWhitespace(movieQuote.charAt(i))) ? 1 : 0;
        
        System.out.println("Total number of spaces are "+ spacescount);            

    }

}

   
