
public class LongestContinousIncreasingSubsequence {
        
    public static int findLengthOfLCIS(int [] nums){
    	   int count = 0;
        int a_pointer = 1, b_pointer = 0;
        
        if(nums.length == 1){
            return 1;
        }
        
        while(a_pointer < nums.length){
            if(nums[a_pointer - 1] >= nums[a_pointer]){
                b_pointer = a_pointer;
            }
            count = Math.max(count, (a_pointer - b_pointer)+1);
            a_pointer++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println (findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }
}
