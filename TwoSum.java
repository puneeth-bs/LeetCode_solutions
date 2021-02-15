
//Two Sum problem LeetCode

import java.util.*;
public class TwoSum {
	
	
    //solution
    public int[] twoSum(int[] nums, int target){
    	  
    	  Map<Integer, Integer> map = new HashMap<>();
    	  
    	  for(int i = 0; i < nums.length; i++){
    	  	int complement = target - nums[i];
    	  	if(map.containsKey(complement)){
    	  		return new int[] {map.get(complement), i};
    	  	}else{
    	  		map.put(nums[i], i);
    	  	}
    	  }
    	  
    	  throw new IllegalArgumentException("No solution");  
    }
        
    
    public static void main(String[] args) {
        
        TwoSum twoSum = new TwoSum();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = s.nextInt();
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int [] nums = new int[n];
        System.out.println ("Enter elements of an array: ");
        for(int i = 0 ; i < n; i++){
        	nums[i] = s.nextInt();
        }
        int result[] = new int[2];
        result = twoSum.twoSum(nums, target);
        for(int i = 0; i < result.length; i++){
        	System.out.print(result[i]+" ");
        }
       
        
    }
}
