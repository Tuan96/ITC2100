//Create an Automobile class for a dealership.
//Include fields for an ID number, make, model, color, year, and miles per gallon.
// 0 < ID < 9999, else ID - 0.
// 2000 < Year < 2017, else Year = 0.
// 10 < Miles per Gallon < 60, else Miles per Gallon = 0
// Include a constructor and use the set methods. 
// Write an application that demonstrates all methods work correctly. 

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */

class TestAutomobiles {
        
        //main method
        public static void main (String[] args) throws java.lang.Exception { 
        
            //create three class objects
            Automobiles car1=new Automobiles(-1,2018,34,"Toyota","Camry","Black");
            
            Automobiles car2=new Automobiles(2,2015,32,"BMW","M3","White");
            
            Automobiles car3=new Automobiles(3,2016,30,"Cadillac","ATS-V Sedan","Grey");
            
                //call the methods and print the values
                System.out.println("AUTOMOBILE 1:");
                System.out.println("AUTOMOBILE ID - "+car1.getID());
                System.out.println("AUTOMOBILE MAKE - "+car1.getMake());
                System.out.println("AUTOMOBILE MODEL - "+car1.getModel());
                System.out.println("AUTOMOBILE COLOUR - "+car1.getColor());
                System.out.println("AUTOMOBILE YEAR - "+car1.getYear());
                System.out.println("AUTOMOBILE MILES PER GALLON - "+car1.getMiles_p_gallon());
               
            
                System.out.println("");
                
                //call the methods and print the values
                System.out.println("AUTOMOBILE 2:");
                System.out.println("AUTOMOBILE ID - "+car2.getID());
                System.out.println("AUTOMOBILE MAKE - "+car2.getMake());
                System.out.println("AUTOMOBILE MODEL - "+car2.getModel());
                System.out.println("AUTOMOBILE COLOUR - "+car2.getColor());
                System.out.println("AUTOMOBILE YEAR - "+car2.getYear());
                System.out.println("AUTOMOBILE MILES PER GALLON - "+car2.getMiles_p_gallon());
                
            
                System.out.println("");
                
                //call the methods and print the values
                System.out.println("AUTOMOBILE 3:");
                System.out.println("AUTOMOBILE ID - "+car3.getID());
                System.out.println("AUTOMOBILE MAKE - "+car3.getMake());
                System.out.println("AUTOMOBILE NAME - "+car3.getModel());
                System.out.println("AUTOMOBILE COLOUR - "+car3.getColor());
                System.out.println("AUTOMOBILE YEAR - "+car3.getYear());
                System.out.println("AUTOMOBILE MILES PER GALLON - "+car3.getMiles_p_gallon());
                
        }
        
}

public class Automobiles {
   
   //declare variables
   int ID, year, vin_number, miles_p_gallon, speed;
   
   String make, model, color;
   
   Scanner scan = new Scanner(System.in);
   
   //constructor
   Automobiles() 
   {
       ID = 0;
       year = 0;
       miles_p_gallon = 0;
       make = "NO MAKE";
       model = "NO MAKE";
       color = "NO MAKE"; 
   }
   
   //constructor
   Automobiles(int id, int y, int m_p_g, String mak, String mod, String col) 
   {
       ID = setID(id);
       year = setYear(y);
       miles_p_gallon = setMiles_p_gallon(m_p_g);
       make = mak;
       model = mod;
       color = col;
   }
   
   //get and set methods
   int setID(int id) 
   {
        if (id > 9999 || id <0)
            id = 0;
        return id;
   }
       
   int setYear(int y)
   {
       if (y < 2000 || y > 2017)
            y = 0;
       return y;
   }
       
   int setMiles_p_gallon(int m_p_g)
   {
       if (m_p_g < 10 || m_p_g > 60)
            m_p_g = 0;
       return m_p_g;
   }
   
   int getID()
   {
       return ID;
   }
   
   int getYear()
   {
       return year;
   }
   
   int getMiles_p_gallon()
   {
       return miles_p_gallon;
   }
   
   int getSpeed()
   {
       return speed;
   }        
           
   String getMake()
   {
       return make;
   }
   
   String getModel()
   {
       return model;
   }
   
   String getColor()
   {
       return color;
   }
   
}