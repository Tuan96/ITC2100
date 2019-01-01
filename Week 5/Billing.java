/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytwo;

import java.util.Date;

/**
 *
 * @author Tony
 */
public class Billing {
    
        public static void main(String args[]) 
    {
            Date today = new Date();
            java.text.SimpleDateFormat One = new java.text.SimpleDateFormat("EEE, MMM. dd, yyyy");                 
            String dte = One.format(today);        
            System.out.println("Date: " + dte+"\n");
    }
    
    private static final double TAX = 0.08;
	private static double photoBookPrice;
	private static int booksOrdered;
        static
    {
            computeBill(10);
            computeBill(10, 15);
            computeBill(10, 15, 20.00);
    }
        
    public static void computeBill(double price)
    {
            photoBookPrice = price;
            double booksBill = (photoBookPrice * TAX) + photoBookPrice;
            System.out.println("(Book price only) Total cost for your order is " + booksBill);
    }
        
    public static void computeBill(double price, int ordered)
    {
            photoBookPrice = price;
            booksOrdered = ordered;
            double booksBill = (photoBookPrice * booksOrdered * TAX) + (photoBookPrice * booksOrdered);
            System.out.println("(Book price & quantity ordered) Total cost for your order is " + booksBill);
    }
                
    public static void computeBill(double price, int ordered, double discount)
    {
            photoBookPrice = price;
            booksOrdered = ordered;
            double booksBill = (photoBookPrice * booksOrdered * TAX - discount) + (photoBookPrice * booksOrdered);
            System.out.println("(Book price, quantity ordered & coupon) Total cost for your order is " + booksBill);
    }
    
}
