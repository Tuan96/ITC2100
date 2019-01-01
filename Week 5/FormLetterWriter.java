/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytwo;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Tony
 */
public class FormLetterWriter {
    
        public static void main(String args[]) 
    {
            Date today = new Date();
            SimpleDateFormat One = new SimpleDateFormat("EEE, MMM. dd, yyyy");                
            String dte = One.format(today);        
            System.out.println("Date: " + dte+"\n");
    }
    
        private static final String SALUTATION1 = "Dear Mr. or Ms. ";
	private static final String SALUTATION2 = "Dear ";
	public String lastName;
	public String firstName;
	private static final String LETTER_END = "Thank you for your recent order.";
        
	public void displaySalutation(String last)
    {
            lastName = last;
            System.out.println(SALUTATION1 + lastName);
    }
        
	public void displaySalutation(String last, String first)
    {
            lastName = last;
            firstName = first;
            System.out.println(SALUTATION2 + firstName + " " + lastName);
    }
                
	public void displayLetter()
    {
            System.out.println(LETTER_END);
    }
		
	static 
    {
            FormLetterWriter test001 = new FormLetterWriter();
            FormLetterWriter test002 = new FormLetterWriter();
            test001.displaySalutation("Tony");
            test001.displayLetter();
            test002.displaySalutation("Tony", "Nguyen");
            test002.displayLetter();
    }

}

