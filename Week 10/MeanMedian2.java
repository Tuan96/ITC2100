
import java.util.Arrays;
import java.util.Scanner;
/**
 * Exercise #2b on pg 484.
 * @author Tony
 */
public class MeanMedian2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int [20];
        
        int total = 0;
        
        System.out.println("Please enter any number of values up to 20");
        
        int amount = scanner.nextInt();
        
        nums = new int[amount];
        
        for (int index = 0; index <amount; index++){
            System.out.println("Enter value at #" +(index +1) + ":");
            nums[index] = scanner.nextInt();
            total += nums[index];
        }
        
        System.out.println("Array values are:");
        
        for (int i = 0; i < amount; i++){
            System.out.print(nums[i] + "");
        }
        
        System.out.println();
        
        int mean = total / amount;
        
        System.out.println("Mean: " + mean);
        
        Arrays.sort(nums);
        
        double median = 0;
        
        if (nums.length % 2 ==0) {  
            median = ((double) (nums[(nums.length - 1) / 2] + nums[nums.length / 2])) / 2;
        }
                
        else {   
            median = nums[(nums.length - 1) / 2]; 
        }
        
        for (int i = 0; i < amount; i++) {
            System.out.print(nums[i]+ "");
        }
       
        System.out.println("Median: " + median);
        
    }
    
}
  
       