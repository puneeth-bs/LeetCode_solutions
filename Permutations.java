import java.util.*;
public class Permutations {
        
    
    public static List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result_list = new ArrayList<>();
        if(nums == null || nums.length == 0){
        	return result_list;
        }
        
        List<Integer> permutation = new ArrayList<>();
        permuteNumber(nums, permutation, result_list);
        return result_list;
        
    }
    
    private static void permuteNumber(int [] nums, List<Integer> permutations, List<List<Integer>> result_list){
    	
    	if(permutations.size() == nums.length){
    		result_list.add(new ArrayList<>(permutations));
    		return;
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		if(permutations.contains(nums[i])){
    			continue;	
    		}
    		
    		
    		permutations.add(nums[i]);
    		permuteNumber(nums, permutations, result_list);
    		permutations.remove(permutations.size()-1);
    			
    	}
    	
    	
    }
    
    
    
    public static void main(String[] args) {
       
      Scanner s = new Scanner(System.in);
      System.out.print ("Enter size of an array: ");
      int n = s.nextInt();
      int [] nums = new int[n];
      System.out.println ("Enter elements of an array: ");
      for(int i = 0; i < n; i++){
      	nums[i] = s.nextInt();
      }
      
      permute(nums);    
    }
}
