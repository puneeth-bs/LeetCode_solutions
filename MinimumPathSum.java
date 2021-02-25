//Minimum Path Sum (leetcode)

import java.util.Scanner;
import java.lang.Math;
public class MinimumPathSum {
        
    
    
    //solution
    public static  int minPathSum(int [][] grid) {
    	
    	int [][] dp = new int[grid.length][grid[0].length];
    	
    	for(int i = dp.length - 1; i >= 0; i--){
    		for(int j = dp[0].length - 1; j >= 0; j--){
    			
    			if(i == dp.length-1 && j == dp[0].length-1){
    				
    				dp[i][j] = grid[i][j];
    				
    			}else if (i == dp.length-1){
    				
    				dp[i][j] = dp[i][j+1] + grid[i][j];
    				
    			}else if(j == dp[0].length-1){
    				
    				dp[i][j] = dp[i+1][j] + grid[i][j];
    				
    			}else{
    				dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + grid[i][j];
    			}	
    		}
    	}
    	
    	return dp[0][0];
    	
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print ("Enter row length: ");
        int m = s.nextInt();
        System.out.print ("Enter column length: ");
        int n = s.nextInt();
        
        int [][] matrix = new int[m][n];
        System.out.println ("Enter matrix elements: ");
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		System.out.print("matrix["+i+"]["+j+"] : ");
        		matrix[i][j] = s.nextInt();
        	}
        }
        
        System.out.println (minPathSum(matrix)); 
    }
}
