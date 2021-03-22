import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class CoinChange {
        
    public static int coinChange(int [] coins, int amount){
    	
    	int [] dp = new int[amount+1];
    	Arrays.fill(dp, amount+1);
    	dp[0] = 0;
    	
    	for(int i = 0; i <= amount; i++){
    		for(int j = 0; j < coins.length; j++){
    			if(i >= coins[j]){
    				dp[i] = Math.min(dp[i], dp[i - coins[j]]+1);
    			}
    			
    		}
    	}
    	
    	return dp[amount] > amount ? -1 : dp[amount];
    	
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print ("Enter size of an array: ");
        int size = s.nextInt();
        int [] arr = new int[size];
        System.out.println ("Enter elements of an array: ");
        for(int i = 0; i < size; i++){
        	arr[i] = s.nextInt();
        }
        System.out.print ("Enter amount: ");
        int amt = s.nextInt();
        System.out.println (coinChange(arr, amt));
        
        
        
    }
}
