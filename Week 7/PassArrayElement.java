
import java.util.Arrays;
import java.util.Collections;

/**
 * List 6 New England states in array order in array of string in reverse order.
 * Author: Tony
 */
public class PassArrayElement {
   
public static void main(String[] args) {

    String[] stringArray = new String[] {"Massachusetts", "Maine",  "Connecticut", "New Hampshire", "Rhode Island", "Vermont"};
    
        System.out.println("Six New England states: ");
     
        System.out.println("In original order: " + Arrays.toString(stringArray) + ".");
        
    Collections.reverse(Arrays.asList(stringArray));
         
        System.out.println("In reverse order: " + Arrays.toString(stringArray) + ".");
    
  }

}
