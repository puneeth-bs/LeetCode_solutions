import java.lang.*;
public class TrappingRainWater {
        
    
    public int maxWater(int[] arr){
    	
    	int max_units = 0;
    	
    	for(int i = 1; i < arr.length; i++){
    		
    		int left = arr[i];
    		int right = arr[i];
    		
    		for(int j = 0; j < i; j++){
    			left = Math.max(left, arr[j]);
    		}
    		
    		for(int j = i+1; j < arr.length; j++){
    			right = Math.max(right, arr[j]);
    		}
    		
    		
    		max_units +=Math.min(left,right) - arr[i];
    	}
    	
    	return max_units;
    	
    }
    
    
    public static void main(String[] args) {
    	
        TrappingRainWater sol = new TrappingRainWater();
        int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        
        System.out.println (sol.maxWater(arr));
    }
}
