import java.util.*;
public class StringPermutation {
	
	
	
    public void generateWords(int current_state, int total_states, HashMap<Character, Integer> freq_map, String s){
    	
    	if(current_state > total_states){
    		System.out.println (""+s);
    	}
    	
    	for(char ch : freq_map.keySet()){
    		if(freq_map.get(ch) > 0){
    			freq_map.put(ch, freq_map.get(ch) - 1);
    			generateWords(current_state+1, total_states, freq_map, s+ch);
    			freq_map.put(ch, freq_map.get(ch)+1);
    		}
    	}
    	
    }
        
    
    public static void main(String[] args) {
        
        StringPermutation sol = new StringPermutation();
        System.out.print("Enter string: ");
        Scanner s = new Scanner(System.in);
        String string = s.next();
        String emptyString = "";
        
        HashMap<Character, Integer> freq_map = new HashMap<>();
        for(char ch : string.toCharArray()){
        	if(freq_map.containsKey(ch)){
        		freq_map.put(ch, freq_map.get(ch)+1);
        	}else{
        		freq_map.put(ch, 1);
        	}
        }
        
        sol.generateWords(1, string.length(), freq_map, emptyString);
    }
}
