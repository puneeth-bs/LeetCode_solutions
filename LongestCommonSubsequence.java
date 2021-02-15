//Longest Common Subsequence (LeetCode)

import java.util.Scanner;
public class LongestCommonSubsequence {
	
	
    //solution using dynamic programming
    public int longestCommonSubsequence(String text1, String text2) {
        
        int [][] lcs = new int[text1.length()+1][text2.length()+1];
        int max = 0;
        
        for(int i = 0; i<=text1.length(); i++){
            lcs[i][0] = 0;
        }
        
        for(int i = 0; i<=text2.length(); i++){
            lcs[0][i] = 0;
        }
        
        for(int i = 1; i <= text1.length(); i++){
            for(int j = 1; j <= text2.length(); j++){
                
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                }else{
                    lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
                }
                
                if(max < lcs[i][j]){
                    max = lcs[i][j];
                }
                
            }
        }
        return max;
    }
        
    
    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
         Scanner s = new Scanner(System.in);
         System.out.print ("Enter string1: ");
         String string1 = s.next();
         System.out.print ("Enter string2: ");
         String string2 = s.next();
         System.out.println (lcs.longestCommonSubsequence(string1, string2));
    }
}
