
public class ProductOfArrayExceptSelf {
    
    //time complexity O(n) - one pass    
    public static int[] productExceptSelf(int [] nums){
    	
    	int n = nums.length;
    	int res[] = new int[n];
    	res[0] = 1;
    	for(int i = 1; i < nums.length; i++){
    		res[i] = res[i-1] * nums[i-1];
    	}
    	int right = 1;
    	for(int i = n-1; i >= 0; i--){
    		res[i]*=right;
    		right*=nums[i];
    	}
    	return res;
    	
    }
    
    
    
    public static void main(String[] args) {
    	
    	for(int i : productExceptSelf(new int[]{1,2,3,4})){
    		System.out.print(i+" ");
    	}
    	    
    }
}
