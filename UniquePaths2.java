import java.util.Scanner;
public class UniquePaths2 {
        
    public static int uniquePathsWithObstacle(int [][] obstacleGrid){
    	
    	int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
    	
    	
    	for(int i = 0; i < dp.length; i++){
    		if(obstacleGrid[i][0] == 1){
    			dp[i][0] = 0;
    			break;
    		}else{
    			dp[i][0] = 1;
    		}
    	}
    	
    	for(int i = 0; i < dp[0].length; i++){
    		if(obstacleGrid[0][i] == 1){
    			dp[0][i] = 0;
    			break;
    		}else{
    			dp[0][i] = 1;
    		}
    	}
    	
    	for(int i = 1; i < dp.length; i++){
    		for(int j = 1; j < dp[0].length; j++){
    			if(obstacleGrid[i][j] == 1){
    				dp[i][j] = 0;
    			}else{
    				dp[i][j] = dp[i-1][j] + dp[i][j-1];
    			}
    		}
    	}
    	
    	return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    	
    	
    }
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       System.out.println ("Enter row length: ");
       int m = s.nextInt();
       System.out.println ("Enter column length: ");
       int n = s.nextInt();
       
       int matrix[][] = new int[m][n];
       
       for(int i = 0;  i < m; i++){
       	for(int j = 0; j < n; j++){
       		System.out.print("matrix["+i+"]["+j+"] = ");
       		matrix[i][j] = s.nextInt();
       	}
       }
       
       System.out.println (uniquePathsWithObstacle(matrix));
       
        
    }
}
