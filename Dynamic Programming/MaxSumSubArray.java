package DynamicProgramming;

public class MaxSumSubArray {

    //kadanes algo
    public static int subArraySum(int [] nums){

        int finalMax = Integer.MIN_VALUE;
        int max_so_far = 0;
        for(int i = 0; i < nums.length; i++){
            max_so_far = max_so_far + nums[i];
            if(max_so_far > finalMax){
                finalMax = max_so_far;
            }
            if(max_so_far < 0){
                max_so_far = 0;
            }
        }
        return finalMax;
    }


    public static void main(String [] args){
        System.out.print(subArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}
