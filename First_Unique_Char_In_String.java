import java.util.*;
public class First_Unique_Char_In_String {
	
	
    public static int firstUniqueChar(String s){
    	
    	
    	HashMap<Character, Integer> freq_map = new HashMap<>();
    	
    	for(int i = 0; i < s.length(); i++){
    		if(!freq_map.containsKey(s.charAt(i))){
    			freq_map.put(s.charAt(i), 1);
    		}else{
    			freq_map.put(s.charAt(i), freq_map.get(s.charAt(i))+1);
    		}
    	}
    	
    	for(int i = 0; i < s.length(); i++){
    		if(freq_map.get(s.charAt(i)) == 1){
    			return i;
    		}
    	}
    	
    	return -1;
    	
    	
    }
        
    
    public static void main(String[] args) {
    	
    	System.out.println (firstUniqueChar("loveleetcode"));
        
    }
}
