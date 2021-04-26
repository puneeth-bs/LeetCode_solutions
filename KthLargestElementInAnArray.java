import java.util.*;
public class KthLargestElementInAnArray {
        
    public static int findKthLargest(int[] nums, int k){
    	
    	Arrays.sort(nums);
    	reverseArr(nums, 0, nums.length-1);
    	return nums[k-1];
    }
    
    public static void reverseArr(int [] nums, int start, int end){
    	if(start >= end) return;
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    	reverseArr(nums, start+1, end-1);
    }
    public static void main(String[] args) {
        System.out.println (findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}
