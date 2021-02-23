import java.util.*;
public class PaliindromePermutation {
        
    public static void generatePallindormeWord(int current_state, int total_states, HashMap<Character, Integer> freq_map, Character odd_char, String s){
    	
    	
    	if(current_state > total_states){
    		
    		
    		StringBuilder stringBuilder = new StringBuilder();
    		String reverseString = stringBuilder.append(s).reverse().toString();
    		
    		if(odd_char != null){
    			reverseString += odd_char;
    		}
    		String result = s+reverseString;
    		System.out.println (""+(result));
    		return;
    	}
    	
    	
    	for(char ch : freq_map.keySet()){
    		freq_map.put(ch, freq_map.get(ch)-1);
    		generatePallindormeWord(current_state+1, total_states, freq_map, odd_char, s+ch);
    		freq_map.put(ch, freq_map.get(ch)+1);
    	}
    	
    }
    
    
    
    public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       System.out.print ("Enter string: ");
       String string = in.next();
       
       HashMap<Character, Integer> freq_map = new HashMap<>();
       for(int i = 0; i < string.length(); i++){
       	char ch = string.charAt(i);
       	if(freq_map.containsKey(ch)){
       		freq_map.put(ch, freq_map.get(ch)+1);
       	}else{
       		freq_map.put(ch,1);
       	}
       }
       
       Character odd_char = null;
       int odds = 0;
       int length = 0;
       
       for(char ch : freq_map.keySet()){
       	int freq = freq_map.get(ch);
       	if(freq%2 == 1){
       		odd_char = ch;
       		odds++;
       	}
       	
       	freq_map.put(ch, freq/2);
       	length += freq/2;
       }
       
       if(odds > 1){
       	System.out.println (-1);
       	return;
       }
       
       generatePallindormeWord(1, length, freq_map, odd_char, "");
    }
}
