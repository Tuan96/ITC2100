
/**
 * 4) Exercise #11 on pg 661.
 * @author Tony
 */

public class EmployeeException extends Exception {

    int e;
    EmployeeMessages em = new EmployeeMessages();
                   
    EmployeeException(int num)
    {
        e=num;
    }
              
    public String toString()
    {
        return("ERROR: "+em.errmsg(e));
    }
    
}
