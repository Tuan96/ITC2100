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
public class testImp {
 
    public static void main(String[] args) {
        
   Scanner in = new Scanner(System.in);
   
    String lght;
    
    System.out.println("Please input the color of the light >> ");
    
    lght=in.nextLine();
  
    System.out.println("The light is " + lght);
    
    switch (lght) {
            case "red":
            case "flashing red":
            case "red arrow":
                System.out.println("The driver must stop");
                break;
                
            case "yellow":
            case "flashing yellow":
            case "yellow arrow":
                System.out.println("The driver must proceed with caution");
                break;
                
            case "green":
            case "flashing green":
            case "green arrow":
                System.out.println("The driver may proceed");
                break;
            default:
                System.out.println("It is none of these");
                break;
        }
    
}
}