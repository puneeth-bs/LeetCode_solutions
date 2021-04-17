import java.util.Scanner;
public class SortArray {
	
	
    //mergeSort
    public void sort(int[] nums){
    	
    	divideArray(0, nums.length-1, nums);
    	
    }
    
    public void divideArray(int lowerIndex, int higherIndex, int [] nums){
    	
    	if(lowerIndex < higherIndex){
    		int middleIndex = lowerIndex + (higherIndex - lowerIndex)/2;
    		//sorting left part of the array
    		divideArray(lowerIndex, middleIndex, nums);
    		//sorting right part of the array
    		divideArray(middleIndex+1, higherIndex, nums);
    		
    		mergeArray(nums, lowerIndex, higherIndex, middleIndex);
    		
    		
    	}
    	
    }
    
    public void mergeArray(int [] nums, int lowerIndex, int higherIndex, int middleIndex){
    	
    	int [] tempArray = new int[nums.length];
    	for(int i = 0; i < nums.length; i++){
    		tempArray[i] = nums[i];
    	}
    	
    	int i = lowerIndex;
    	int j = middleIndex+1;
    	int k = lowerIndex;
    	
    	while(i <= middleIndex && j <= higherIndex){
    		if(tempArray[i] < tempArray[j]){
    			nums[k] = tempArray[i];
    			i++;
    		}else{
    			nums[k] = tempArray[j];
    			j++;
    		}
    		
    		k++;
    	}
    	
    	while(i <= middleIndex){
    		nums[k] = tempArray[i];
    		k++;
    		i++;
    	}
    	
    }
	
    
        
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        SortArray solution = new SortArray();
        System.out.print("Enter size of an array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < arr.length; i++){
        	arr[i] = s.nextInt();
        }
        
        solution.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
        	System.out.print (""+arr[i]+" ");
        }
        
        
        
        
    }
}
