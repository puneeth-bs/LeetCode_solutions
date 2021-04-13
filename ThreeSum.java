import java.util.*;
public class ThreeSum {
        
    public static List<List<Integer>> Solution(int [] nums){
    	
    	if(nums.length < 3){
    		return new ArrayList<>();
    	}else{
    		Arrays.sort(nums);
    		Set<List<Integer>> set = new HashSet<>();
    		for(int i = 0; i < nums.length - 2; i++){
    			int j = i+1;
    			int k = nums.length-1;
    			
    			while(j<k){
    				int sum = nums[i] + nums[j] + nums[k];
    				if(sum == 0){
    					set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
    				}
    				if(sum < 0){
    					j++;
    				}
    				if(sum > 0){
    					k--;
    				}
    			}
    		}
    		
    		return new ArrayList<>(set);
    	 }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int [] nums = new int[n];
        System.out.println ("Enter array elements: ");
        for(int i = 0; i < n; i++){
        	nums[i] = s.nextInt();
        }
        //iterating over listOflists
        
        Iterator listOfListsIterator = Solution(nums).iterator();
        System.out.print("[ ");
        while(listOfListsIterator.hasNext()){
        	List<Integer> list = new ArrayList<Integer>();
        	list = (List<Integer>) listOfListsIterator.next();
        	Iterator eachListIterator = list.iterator();
        	System.out.print("[ ");
        	while(eachListIterator.hasNext()){
        		System.out.print(" "+eachListIterator.next()+", ");
        	}
        	if(eachListIterator.hasNext()){
        		System.out.print("], ");
        	}else{
        		System.out.print(" ]");
        	}
        	
        }
        System.out.print(" ]");   
    }
}
