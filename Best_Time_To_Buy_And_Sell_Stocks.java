import java.util.Scanner;
public class Best_Time_To_Buy_And_Sell_Stocks {
        
    public static int max_profit(int [] prices){
    	
    	int min_price = Integer.MAX_VALUE;
    	int max_price = 0;
    	
    	for(int i = 0; i < prices.length; i++){
    		if(prices[i] < min_price){
    			min_price = prices[i];
    		}else if(prices[i] - min_price > max_price){
    			max_price = prices[i] - min_price;
    		}
    	}
    	
    	return max_price;
    	
    }
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.print ("Enter array size: ");
    	int n = s.nextInt();
    	int [] arr = new int[n];
    	System.out.println ("Enter array elements: ");
    	for(int i = 0; i < n; i++){
    		arr[i] = s.nextInt();
    	}
    	
    	System.out.println (max_profit(arr));
        
    }
}
