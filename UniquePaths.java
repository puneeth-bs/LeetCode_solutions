import java.util.Scanner;
public class UniquePaths {
        
    
    public static int uniquePaths(int m, int n){
    	
    	int [][] dp = new int[m][n];
    	for(int i = 0; i < dp.length; i++){
    		dp[i][0] = 1;
    	}
    	
    	for(int i = 0; i < dp[0].length; i++){
    		dp[0][i] = 1;
    	}
    	
    	for(int i = 1; i < dp.length; i++){
    		for(int j = 1; j < dp[0].length; j++){
    			dp[i][j] = dp[i-1][j] + dp[i][j-1];
    		}
    	}
    	
    	return dp[m-1][n-1];
    }
    
    
    
    public static void main(String[] args) {
        System.out.println (uniquePaths(3,7));
    }
}
