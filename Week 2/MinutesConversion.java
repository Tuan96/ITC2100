/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytwo;

import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class MinutesConversion {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        double numMinutes;
        
        System.out.print("Please enter a number of minutes >> "); 
            numMinutes = input.nextDouble(); 
            
            double hours = ((double) numMinutes / 60);
            double days = ((double) numMinutes / (60.00 *24));
            
            System.out.println(numMinutes + " " + "minutes equals" + " " + hours + " " + "hours" + "and equals" + " " + days + " " + "days");
            
        
    }
}
