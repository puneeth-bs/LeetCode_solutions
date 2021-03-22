import java.util.Scanner;
public class KnapsackProblem {
        
    public static int solution(int [] valuesArray, int [] weightsArray, int maxWeigth){
    	
    	int[][] dp = new int[valuesArray.length+1][maxWeigth+1];
    	for(int i = 1; i < dp.length; i++){
    		for(int j = 1; j < dp[0].length; j++){
    			if(j >= weightsArray[i-1]){
    				int remainingCapacity = j - weightsArray[i-1];
    				if(dp[i-1][remainingCapacity] + valuesArray[i-1] > dp[i-1][j]){
    					dp[i][j] = dp[i-1][remainingCapacity] + valuesArray[i-1];
    				}else{
    					dp[i][j] = dp[i-1][j];
    				}
    			}else{
    				dp[i][j] = dp[i-1][j];
    			}
    		}
    	}
    	
    	return dp[valuesArray.length][maxWeigth];
    	
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = s.nextInt();
        int [] valuesArray = new int[n];
        int [] weightsArray = new int[n];
        
        System.out.println ("Enter values: ");
        for(int i = 0; i < n; i++){
        	valuesArray[i] = s.nextInt();
        }
        System.out.println ("Enter weights: ");
        for(int i = 0; i < n; i++){
        	weightsArray[i] = s.nextInt();
        }
        
        System.out.print("Enter max weight: ");
        int maxWeight = s.nextInt();
        
        System.out.println (solution(valuesArray, weightsArray, maxWeight));
       
        
    }
}
