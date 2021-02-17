//Longest Palindromic Substring (LeetCode)
import java.util.Scanner;
public class LongestPallindromeSubstring {
	
	
    public String longestPallindromeSubstring(String s){
    	
    	boolean [][] dp = new boolean [s.length()][s.length()];
    	int pos1 = 0, pos2 = 0, len = 0;
    	for(int g = 0; g < s.length(); g++){
    		
    		for(int i = 0, j = g; j < dp.length; i++, j++){
    			if(g == 0){
    				dp[i][j] = true;
    			}else if(g == 1){
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
    			
    			if(dp[i][j]){
    				pos1 = i;
    				pos2 = j;
    				//len = g + 1;
    			}
    		}
    	}
    	//System.out.println ("pos1 = "+pos1+" pos2 = "+pos2+" len = "+len);
    	return s.substring(pos1, pos2+1);
    	
    }
        
    
    public static void main(String[] args) {
        
     LongestPallindromeSubstring sol = new LongestPallindromeSubstring();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter string: ");
    	String string = s.next();
    	
    	System.out.println (""+sol.longestPallindromeSubstring(string));
        
    }
}
