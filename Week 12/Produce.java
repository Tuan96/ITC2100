
import java.util.ArrayList;

/**
 *
 * @author Tony
 */

public class Produce {
    
    public static void main(String args[]) {
    
    ArrayList <String>apples = new ArrayList<String>();
   
        apples.add("Red Delicious");
        apples.add("Gala");
        apples.add("Fuji");
        apples.add("Golden Delicious");
        apples.add("Granny Smith");
    
        System.out.println("The original array list has following names: " + apples + "\n");

        apples.add("Cripps Pink");
        System.out.println("Add Cripps Pink:");
        
        System.out.println("The modified array list has the following names:" + apples + "\n");

        apples.remove("Gala");
        System.out.println("Remove Gala:");
        System.out.println("The array list now has the following names:" + apples + "\n");

        String remove; 
        remove = apples.remove(2);
        System.out.println("Remove Item #2 (Golden Delicious):");
        System.out.println("The array list now has the following names:" + apples + "\n");
       
        int ln = apples.size();
        System.out.println("The size of the array is now " + ln + " elements.\n");
    
}
    
}
