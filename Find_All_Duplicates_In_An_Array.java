import java.util.*;
public class Find_All_Duplicates_In_An_Array {
        
    
    public static List<Integer> findDuplicates(int[] nums){
    	
    	   int count = 2;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        
        
        for(int key : map.keySet()){
            if(map.get(key) == count){
                list.add(key);
            }
        }
        return list;
    	
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
      
      
      for(int i : findDuplicates(nums)){
      	System.out.print (i+" ");
      }
        
    }
}
