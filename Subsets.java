import java.util.*;
public class Subsets {
        
    public static List<List<Integer>> subsets(int [] nums){
    	List<List<Integer>> resultList = new ArrayList<>();
    	Arrays.sort(nums);
    	backTrack(resultList, new ArrayList<Integer>(), nums, 0);
    	return resultList;
    	
    }
    
    public static void backTrack(List<List<Integer>> resultList, List<Integer> subsetList, int[] nums, int index){
    	resultList.add(new ArrayList(subsetList));
    	for(int i = index; i < nums.length; i++){
    		subsetList.add(nums[i]);
    		backTrack(resultList, subsetList, nums, i+1);
    		subsetList.remove(subsetList.size()-1);
    	}
    }
    
    public static void printListOfLists(List<List<Integer>> listOfLists){
    	     Iterator listOfListIterator = listOfLists.iterator();
		System.out.print("[ ");
		while(listOfListIterator.hasNext()){
			List<Integer> list = new ArrayList<>();
			list = (List<Integer>) listOfListIterator.next();
			Iterator eachListIterartor = list.iterator();
			System.out.print("[ ");
			while(eachListIterartor.hasNext()){
				System.out.print(eachListIterartor.next()+"");
				if(eachListIterartor.hasNext()){
					System.out.print(", ");
				}
				
			}
			System.out.print(" ]");
			if(listOfListIterator.hasNext()) System.out.print(", ");
		}
		System.out.print(" ]");
    }
    public static void main(String[] args) {
    	   int [] arr = {1, 2, 3};
        printListOfLists(subsets(arr));
    }
}
