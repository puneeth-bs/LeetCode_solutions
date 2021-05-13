
public class MoveZeros {
        
    public static void moveZeroes(int [] nums){
    	
    	int lastZeroPos = 0;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != 0){
    			nums[lastZeroPos++] = nums[i];
    		}
    	}
    	for(int i = lastZeroPos; i < nums.length; i++){
    		nums[i] = 0;
    	}
    	
    }
    public static void main(String[] args) {
    	   int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
    		System.out.print(nums[i]+" ");
    	   }
    }
}
