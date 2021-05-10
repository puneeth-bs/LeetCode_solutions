import java.util.*;
public class HappyNumber {
        
    public static boolean isHappy(int n){
    	
    	int sum = 0;
    	int n1 = n;
    	while(true){
    		int n2 = n1;
    		while(n2 > 0){
    			int temp = n2%10;
    			sum+=(Math.pow(temp, 2));
    			n2 = n2/10;
    		}
    		if(sum == 1){
    			break;
    		}else{
    			if(String.valueOf(sum).length() == 1 && sum != 1){
    				return false;
    			}
    			n1 = sum;
    			sum = 0;
    		}
    			
    	}
    	return true;
    }
    public static void main(String[] args) {
       
       
       if(isHappy(2)){
       	System.out.println ("true");
       }else{
       	System.out.println ("false");
       }
       
    }
}
