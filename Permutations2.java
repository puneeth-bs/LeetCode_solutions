import java.util.*;
public class Permutations2 {
        
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(resultList, new ArrayList(), set, nums, visited);
        return resultList;
    }
    
    public static void backTrack(List<List<Integer>> resultList, List<Integer> currList, HashSet<List<Integer>> set, int[] nums, boolean[] visited){
        
        if(currList.size() == nums.length){
            if(!set.contains(currList)){
                set.add(currList);
                resultList.add(new ArrayList(currList));
                return;
            }else{
                return;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true) continue;
            currList.add(nums[i]);
            visited[i] = true;
            backTrack(resultList, currList, set, nums, visited);
            currList.remove(currList.size()-1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scn.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
        	nums[i] = scn.nextInt();
        }
        
        for(List<Integer> list : permuteUnique(nums)){
        	System.out.print("[ ");
        	for(int item : list){
        		System.out.print(item+", ");
        	}
        	System.out.print(" ]");
        }
        System.out.print(" ]");
    }
}
