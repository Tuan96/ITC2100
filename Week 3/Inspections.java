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
public class Inspections {
    
    public static void main(String[] args)
    {
        int factory = 0, week = 0;
     
        for(week = 1;week <= 52; week ++)
        {
            factory = 1 + (int)(Math.random()*4);
            System.out.println("On week " + week + " the " + factory + "th factory will be inspected. ");
            
        }
         
        
    }
}
