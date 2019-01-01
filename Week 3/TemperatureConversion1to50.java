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
public class TemperatureConversion1to50 {
    
  public static void main(String[] args) {
    
    float celsus = 0; 
   
    for(int fahrnheit = 1; fahrnheit <= 50; fahrnheit++)
    {
        
         celsus = (float) ((fahrnheit - 32.0)*(5f/9f));
         System.out.println(fahrnheit + " Fahrenheit equals " + celsus + " Celsius. ");
        
    }
  }
}

