
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * Exercise #7 on pg 485
 * Reference: http://www.baeldung.com/java-comparator-comparable
 * @author Tony
 */

class SortPurchasesArray {
    
    public static void main(String[] args) {

        Purchase[] purchse = new Purchase[5]; 

        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){ 
            System.out.println("Enter the invoice number and sales amount (respectively) for purchase: #"+(i+1));
            
            int invoicenumber = scanner.nextInt(); 
            Double salesamount = scanner.nextDouble(); 
            
            Purchase purchase = new Purchase(); 
            purchase.setInvoiceNum(invoicenumber);
            purchase.setSaleAmout(salesamount);
            purchse[i] = purchase;    
        }

        System.out.println("Choose your method of sorting purchases: \n1) Invoice number \n2) Sales amount\n");
        int option = scanner.nextInt(); 

        if(option==1) {  
            Arrays.sort(purchse, new PurchaseInvoiceNumberSorter());
            printArray(purchse);  
        }
        
        else if(option==2) {    
            Arrays.sort(purchse, new PurchaseSalesAmountSorter());
            printArray(purchse);  
        }
        
        else { 
            System.out.println("Please choose again");
        }
        
    }

    public static void printArray(Purchase[] purchse) {
        for(Purchase p : purchse) {   
            p.displayDetails();
            System.out.println("\n");
        }
        
    }
    
}

//Comparator for invoice number.
class PurchaseInvoiceNumberSorter implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return Integer.valueOf(o1.getInvoiceNum()).compareTo(Integer.valueOf(o2.getInvoiceNum()));
    }
    
}

//Comparator for sales amount. 
class PurchaseSalesAmountSorter implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return Double.valueOf(o1.getSaleAmout()).compareTo(Double.valueOf(o2.getSaleAmout()));
    }
    
}

//Modify Purchase.
    class Purchase {
    
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;
    
    DecimalFormat numberFormat = new DecimalFormat("#.000");

    public void setInvoiceNum(int invoiceNum) {
        invoiceNumber = invoiceNum;
    }

    public void setSaleAmout(double saleAmout) {
        saleAmount = saleAmout;
        salesTax = saleAmount * 0.05;
    }

    public int getInvoiceNum() {
        return invoiceNumber;
    }

    public double getSaleAmout() {
        return saleAmount;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void displayDetails() {
        System.out.println("_______________________________________________________________");
        System.out.println("The invoice number is: #" + invoiceNumber);
        System.out.println("The sales tax for is: " + numberFormat.format(salesTax));
        System.out.println("The sales amount is: " + numberFormat.format(saleAmount));
        System.out.println("The total amount is: " + numberFormat.format(saleAmount + salesTax));
    }
    
}