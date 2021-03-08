import java.util.Scanner;
import java.lang.Math;
public class Count_Binary_Substrings {
        
    public static int countBinarySubstrings(String s){
    	
    	int prevBlock = 0;
    	int currBlock = 1;
    	
    	int count = 0;
    	
    	for(int i = 1; i < s.length(); i++){
    		if(s.charAt(i-1) == s.charAt(1)){
    			currBlock++;
    		}else{
    			count += Math.min(prevBlock, currBlock);
    			prevBlock = currBlock;
    			currBlock = 1;
    		}
    	}
    	count += Math.min(prevBlock, currBlock);
    	return count;
    }
    public static void main(String[] args) {
        System.out.println (countBinarySubstrings("00110011"));
    }
}
