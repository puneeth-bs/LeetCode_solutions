// Palindromic Substrings (leetcode)
import java.util.Scanner;
public class PallindromicSubstrings {
        
    //solution
    public static int countSubstring(String s){
    	
    	boolean [][] dp = new boolean [s.length()][s.length()];
    	int count = 0;
    	for(int gap = 0; gap < s.length(); gap++){
    		for(int i = 0, j = gap; j < dp.length; i++,j++){
    			
    			if(gap == 0){
    				dp[i][j] = true;
    				
    			}else if(gap == 1){
    				if(s.charAt(i) == s.charAt(j)){
    					dp[i][j] = true;
    				}else{
    					dp[i][j] = false;
    				}
    				
    			}else{
    				
    				if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
    					dp[i][j] = true;
    				}else{
    					dp[i][j] = false;
    				}
    				
    			}
    			
    			if(dp[i][j] == true){
    				count++;
    			}
    			
    		}
    	}
    	
    	return count;
    	
    }
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print ("Enter string: ");
        String string = s.next();
        System.out.println (countSubstring(string));
    }
}
