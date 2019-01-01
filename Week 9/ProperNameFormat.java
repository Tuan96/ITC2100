/**
 * String: first, middle, last name with mixed Uppercase & Lowercase letters.
 * Output: Proper format of first, middle and last name.
 * @author Tony
 */
public class ProperNameFormat {
    
    public static void main(String[] args){
    
        String sentence = "ToNY eDward sTARk";    

        String name[] = sentence.replaceAll("\\s+", " ").trim().split(" ");
        
        String properName = "";
        
        for (String word : name) {
            
            for (int i = 0; i < word.length(); i++)
                
                properName = properName + ((i == 0) ? word.substring(i, i + 1).toUpperCase(): 
                
                (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toLowerCase().toLowerCase() + " ");
            
        }
        
        System.out.println("The correct letter format is: " + properName);
    
    }

}