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
public class TemperatureConversion {
    
  public static void main(String[] args) {
    float temperatue;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("Enter temperature in Fahrenheit");
    temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperature in Celsius = " + temperatue);
  }
}

