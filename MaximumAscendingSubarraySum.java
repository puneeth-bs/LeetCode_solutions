import java.util.*;
public class MaximumAscendingSubarraySum {
        
    public static int maxAscendingSum(int [] arr){
    	
    	int a_pointer = 0;
        int b_pointer = 1;
        int max = Integer.MIN_VALUE;
        int sum = arr[a_pointer];
        while(b_pointer < arr.length){
            if(arr[a_pointer] < arr[b_pointer]){
                sum += arr[b_pointer];
                a_pointer++;
                b_pointer++;
            }else{
                a_pointer = b_pointer;
                b_pointer = b_pointer+1;
                if(sum > max) max = sum;
                sum = arr[a_pointer];
            }
            if(sum > max){
            	max = sum;
            }
        }
        return max;
    	
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,5,10,50};
        System.out.println (maxAscendingSum(arr));
    }
}
