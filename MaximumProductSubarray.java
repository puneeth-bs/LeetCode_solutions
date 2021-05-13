import java.util.*;
public class MaximumProductSubarray {
        
    public static int maxProduct(int [] nums){
    	
    	   int max_overall = nums[0];
        int max_ending = nums[0];
        int min_ending = nums[0];
        
        for(int i = 1; i  < nums.length; i++){
            int temp = max_ending;
            max_ending = Math.max(Math.max(nums[i], nums[i]*max_ending), nums[i]*min_ending);
            min_ending = Math.min(Math.min(nums[i], nums[i]*temp), nums[i]*min_ending);
            max_overall = Math.max(max_overall, max_ending);
        }
        
        return max_overall;
    	
    	
    }
    public static void main(String[] args) {
        System.out.println (maxProduct(new int[]{2,3,-2,4}));
    }
}
