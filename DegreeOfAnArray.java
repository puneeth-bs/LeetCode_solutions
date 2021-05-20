import java.util.*;
public class DegreeOfAnArray {
        
    public static int findShortestSubArray(int [] nums){
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	HashMap<Integer, Integer> index_map = new HashMap<>();
    	int degree = 0;
    	int minLength = 0;
    	for(int i = 0; i < nums.length; i++){
    		index_map.putIfAbsent(nums[i], i);
    		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    		if(map.get(nums[i]) > degree){
    			degree = map.get(nums[i]);
    			minLength = i - index_map.get(nums[i])+1;
    		}else if(map.get(nums[i]) == degree){
    			minLength = Math.min(minLength, i - index_map.get(nums[i])+1);
    		}
    	}
    	return minLength;
    }
    public static void main(String[] args) {
    	System.out.println (findShortestSubArray(new int[]{2,1,1,2,1,3,3,3,1,3,1,3,2}));   
    }
}
