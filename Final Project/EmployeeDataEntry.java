
import java.util.Scanner;
/**
 * 4) Exercise #11 on pg 661.
 * @author Tony
 */
        
public class EmployeeDataEntry {
    
    public static void main(String args[]) {
                      
        String id,pay;
        int empnum,hourpay,flag=0;
        Scanner in=new Scanner(System.in);
        
        System.out.println("This is the Employee Data Entry."
                + "\nRequirements for valid data: 1000 < Employee Number < 9999, 9 < Hourly Pay < 25. ");
                       
        try
        {
        System.out.print("Enter Employee Number: ");
        id=in.nextLine();
                                        
        if(!id.matches("[0-9]+"))
        {
        throw new EmployeeException(0);
        }   
        
        else
        {
        empnum=Integer.parseInt(id);
        }
        
        if(empnum<1000)
        {
        throw new EmployeeException(1);
        }
        
        else if(empnum>9999)
        {
        throw new EmployeeException(2);
        }
                                                
        System.out.print("Enter Hourly Pay: ");
        pay=in.nextLine();
                                        
        if(!pay.matches("[0-9]+"))
        {
        throw new EmployeeException(3);
        }
        
        else
        {
        hourpay=Integer.parseInt(pay);
        }
                                                        
        if(hourpay<9)
        {
        throw new EmployeeException(4);
        }
                                                        
        else if(hourpay>25)
        {
        throw new EmployeeException(5);
        }
                                                        
        else
        {
        flag=1;
        }
        
        }
                        
        catch(EmployeeException ep)
        {
        System.out.println(ep);
        }
                        
        if(flag==1)
        {
        System.out.println("Valid employee data.");
        }  
        
    }
    
}
