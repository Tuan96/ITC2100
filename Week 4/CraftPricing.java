/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
import java.util.Scanner;

public class CraftPricing {
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("The name of a product: "); 
        
        String nameOfProduct=sc.nextLine(); 
        
        System.out.print("The cost of materials: $"); 
        
        double costOfMaterials=sc.nextDouble(); 
        
        System.out.print("Enter the hours of work: "); 
        
        double hoursOfWork =sc.nextDouble(); 
        
        double retailPrice= findRetailPrice(costOfMaterials,hoursOfWork); 
        
        System.out.println("The Name of the Product is: "+nameOfProduct); 
        
        System.out.println("The Retail Price is: $"+retailPrice); } 
        
        private static double findRetailPrice(double costOfMaterials,double hoursOfWork) { return costOfMaterials + (12 * hoursOfWork) + 7 ; }
    
}
