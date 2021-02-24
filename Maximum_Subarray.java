//Maximum Subarray (Leetcode)


import java.util.Scanner;
public class Maximum_Subarray {
	
    //solution ( Kadanes algorithm )
    public int maxSubArray(int[] nums) {
        
        int max_so_far = Integer.MIN_VALUE;
        int max_ending = 0;
        for(int i = 0; i < nums.length; i++){
            max_ending = max_ending + nums[i];
            if(max_ending > max_so_far){
                max_so_far = max_ending;
            }
            if(max_ending< 0){
                max_ending = 0;
            }
        }
        
        return max_so_far;
    }		
        
    
    public static void main(String[] args) {
    	
    	   Maximum_Subarray solution = new Maximum_Subarray();
    	   Scanner s = new Scanner(System.in);
    	   System.out.print("Enter the size of the array: ");
    	   int n = s.nextInt();
        int [] nums = new int[n];
        System.out.println ("Enter elements of an array: ");
        for(int i = 0 ; i < n; i++){
        	nums[i] = s.nextInt();
        }
        
        System.out.println (solution.maxSubArray(nums));
        
    }
}
