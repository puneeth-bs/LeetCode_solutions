import java.util.*;
public class Search_Insert_Position {
	
	
    public static int searchInsert(int [] nums, int target){
    	
    	   for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > target){
                return i;
            }
        }
        return nums.length;
    	
    	
    	
    }
        
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int [] nums = new int[n];
        System.out.println ("Enter elements of an array: ");
        for(int i = 0 ; i < n; i++){
        	nums[i] = s.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = s.nextInt();
        
        System.out.println (searchInsert(nums, target));
    }
}
