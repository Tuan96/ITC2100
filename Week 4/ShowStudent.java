/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class ShowStudent {
    
   public static void main(String[] args) {
    Student newStud1 = new Student();  
    newStud1.setID(9999);  
    newStud1.setCreditHours(3);   
    newStud1.setPoints(12);
    newStud1.getGPA(); 
    
    System.out.println("ID: " + newStud1.getID());  
    System.out.println("Credit Hours: " + newStud1.getCreditHours());   
    System.out.println("Points: " + newStud1.getPoints());
    System.out.println("GPA: " + newStud1.getGPA()); 
        
        } 

}
    
