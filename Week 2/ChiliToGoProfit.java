/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytwo;

/**
 *
 * @author Tony
 */
import java.util.Scanner;
public class ChiliToGoProfit {
    public static void main(String[] args) {
         
    final int ADULT_MEAL_PRICE = 7;
    final int CHILD_MEAL_PRICE = 4;
    final double ADULT_MEAL_COST = 4.35;
    final double CHILD_MEAL_COST = 3.10;
    
    
        int numAdult;
        int numChild;
        double totalAdultMealProfit;
        double totalChildMealProfit;
        double totalGrandProfit;
        
          Scanner input = new Scanner(System.in);
          
          System.out.print("Please enter a number of Adult >> "); 
            numAdult = input.nextInt(); 
          System.out.print("Please enter a number of Child >> "); 
            numChild = input.nextInt();
            
        totalAdultMealProfit = ((ADULT_MEAL_PRICE - ADULT_MEAL_COST)*numAdult);
        totalChildMealProfit = ((CHILD_MEAL_PRICE - CHILD_MEAL_COST)*numChild);
        totalGrandProfit = (totalAdultMealProfit + totalChildMealProfit);
    
    System.out.println("The total money collected for adult meals is $" + totalAdultMealProfit + " "); 
    System.out.println("The total money collected for child meals meals is $" + totalChildMealProfit + " "); 
    System.out.println("The total money collected for all meals is $" + totalGrandProfit + " ");
    
    }
    
}

