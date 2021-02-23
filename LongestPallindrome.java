import java.util.*;
public class LongestPallindrome {
        
    
    public static int longestPallindrome(String s){
    	
    	HashMap<Character, Integer> freq_map = new HashMap<>();
    	
    		for(char ch : s.toCharArray()){
    			if(freq_map.containsKey(ch)){
    				freq_map.put(ch, freq_map.get(ch)+1);
    			}else{
    				freq_map.put(ch, 1);
    			}
    		}
    	
    	int result = 0;
    	for(char ch : freq_map.keySet()){
    		result += freq_map.get(ch)/2 * 2;
    		if(result % 2 == 0 && freq_map.get(ch) % 2 == 1){
    			result += 1;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
        System.out.println (longestPallindrome("abccccdd"));
    }
}
