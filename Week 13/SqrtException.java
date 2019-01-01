
import java.util.Scanner; 
/**
 *
 * @author Tony
 */
public class SqrtException { 
    
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter a number here to get the square root: ");
        int num = input.nextInt();
        
        try 
        {
           if(num >= 0)
           {
               System.out.println("The Square Root of " + num + " is: "+Math.sqrt(num));  
           }
           
           else
           {
               throw new ArithmeticException("There is no square root for a negative number. This results in the ArithmeticException error. Please enter a positive number.");
           }
        } 
        
        catch (ArithmeticException e) 
        {
           System.out.println(num + " is an invalid number. " + e);
           e.printStackTrace();
        }
        
   }

}