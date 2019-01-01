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
public class ChiliToGo {
    public static void main(String[] args) {
         
    final int ADULT_MEAL_PRICE=7;
    final int CHILD_MEAL_PRICE=4;
        int numAdult;
        int numChild;
        int totalAdultMealCost;
        int totalChildMealCost;
        int totalCost;
        
          Scanner input = new Scanner(System.in);
          
          System.out.print("Please enter a number of Adult >> "); 
            numAdult = input.nextInt(); 
          System.out.print("Please enter a number of Child >> "); 
            numChild = input.nextInt();
 
        totalAdultMealCost = numAdult*ADULT_MEAL_PRICE;
        totalChildMealCost = numChild*CHILD_MEAL_PRICE;
        totalCost = totalAdultMealCost + totalChildMealCost;
    
    System.out.println("The total money collected for adult meals is $" + totalAdultMealCost + " "); 
    System.out.println("The total money collected for child meals meals is $" + totalChildMealCost + " "); 
    System.out.println("The total money collected for all meals is $" + totalCost + " ");
    
    }
}

