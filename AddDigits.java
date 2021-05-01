public class AddDigits {
	
	
    public static int addDigits(int num){
    	int sum = 0;
    	while(true){
    		while(num > 0){
    			sum+=num%10;
    			num/=10;
    		}
    		num = sum;
    		if(String.valueOf(num).length() != 1){
    			sum = 0;
    		}else{
    			break;
    		}
    	}
    	
    	return sum;
    }
        
    
    public static void main(String[] args) {
        System.out.println (addDigits(38));
    }
}
