import java.util.*;
public class LongestIncreasingSubsequence {
        
    public static int lengthOfLIS(int [] nums){
    	
    	int dp[] = new int[nums.length];
    	dp[0] = 1;
    	int result = 0;
    	for(int i = 0; i < nums.length; i++){
    		int max = 0;
    		for(int j = 0; j < i; j++){
    			if(nums[j] < nums[i] && dp[j] > max){
    				max = dp[j];
    			}
    		}
    		dp[i] = max+1;
    		if(dp[i] > result){
    			result = dp[i];
    		}
    	}
    	return result;
    	
    }
    public static void main(String[] args) {
        System.out.println (lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
