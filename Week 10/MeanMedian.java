
import java.util.Arrays;
import java.util.Scanner;
/**
 * Exercise #2a on pg 484.
 * @author Tony
 */
public class MeanMedian {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int [5];
        
        int total =0;
        
        for (int index = 0; index <nums.length; index++){
            System.out.println("Enter value at #" +(index +1) + ":");
            nums[index] = scanner.nextInt();
            total += nums[index];
        }
        
        System.out.println("Array values are:");
        
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "");
        }
        
        System.out.println();
        
        int mean = total / nums.length;
        
        System.out.println("Mean: " + mean);
        
        Arrays.sort(nums);
        
        int median = nums[nums.length / 2];
        
        System.out.println("Median: " + median);
        
    }
    
}
  
       