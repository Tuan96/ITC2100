
import java.util.Scanner;
/**
 * Exercise #6 on pg 485.
 * @author Tony
 */
public class Departments {
 
   public static int DepartmentIndex(String[][] departmentArray, String depatment){
       
       int index = -1;

       for(int i = 0; i < departmentArray.length; ++i){
           
           if(departmentArray[i][0].equalsIgnoreCase(depatment)){
               index = i;
               break;
           }
           
       }
       return index; 
   }
  
   public static void main(String[] args){
       
       String[][] deprtment = {
           {"Career and Academic", "Brock Jefferson"},
           {"Sales", "Bethony Evans"},
           {"Information Technology", "Chris Porter"},
           {"Quality Assurance", "Jessica Johnson"},
           {"Finance", "Joseph Hamilton"},
           {"Customer Service", "Luis Fabiano"}};
       
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter a department name: ");
       String department = in.nextLine();
       
       int index = DepartmentIndex(deprtment, department);
       
       if(index != -1){
           System.out.println("The supervisor for " + department + " department is " + deprtment[index][1] + ".");
       }
       
       else { 
           System.out.println("We currently don't have " + department + " in our records. Please try again. ");
       }
       
   }
   
}
    

