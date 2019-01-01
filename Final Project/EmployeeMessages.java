
/**
 * 4) Exercise #11 on pg 661.
 * @author Tony
 */

public class EmployeeMessages {
                
    private String[] msg= new String[] {
    "Employee Number is not numeric. Please try again.",
    "Employee Number is less than 1000. Please try again.",
    "Employee Number is more than 9999. Please try again.",
    "Hourly Pay is not numeric. Please try again",
    "Hourly Pay is less than $9. Please try again.",
    "Hourly Pay is greater than $25. Please try again."
            
    };
                        
public String errmsg(int e)
{
    return msg[e];
}

}
