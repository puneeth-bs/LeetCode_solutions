//Median of Two Sorted Arrays (leetcode)

import java.util.*;
public class Median_Of_Two_Sorted_Arrays {
     
     
    //solution    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int [] result_arr = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            result_arr[i] = nums1[i];
        }
        
        int pos = nums1.length;
        for(int j = 0; j < nums2.length; j++){
            result_arr[pos] = nums2[j];
            pos++;
        }
        
        Arrays.sort(result_arr);
        int n = result_arr.length;
        
        if(n % 2 == 0){
            return ((result_arr[(n-1)/2])+(result_arr[n/2]))/2.0;
        }else{
            return result_arr[n/2];
        }
         
    }
    
    public static void main(String[] args) {
        
      Scanner s = new Scanner(System.in);
      System.out.print ("Enter size of an array1: ");
      int n1 = s.nextInt();
      int [] nums1 = new int[n1];
      System.out.println ("Enter elements of an array1: ");
      for(int i = 0; i < n1; i++){
      	nums1[i] = s.nextInt();
      }
      
      System.out.print ("Enter size of an array2: ");
      int n2 = s.nextInt();
      int [] nums2 = new int[n2];
      System.out.println ("Enter elements of an array2: ");
      for(int i = 0; i < n2; i++){
      	nums2[i] = s.nextInt();
      }
      
      System.out.println (findMedianSortedArrays(nums1, nums2));  
        
    }
}
