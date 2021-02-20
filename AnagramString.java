import java.util.*;
public class AnagramString {
	
	
    public boolean compareMap(HashMap<Character, Integer> source_map, HashMap<Character, Integer> pattern_map){
    	
    	for(char ch : source_map.keySet()){
    		if(pattern_map.getOrDefault(ch, 0) != source_map.get(ch)){
    			return false;
    		}
    	}
    	return true;
    }	
	
	
    public List<Integer> findAnagrams(String s, String p){
    	
    	HashMap<Character, Integer> source_map = new HashMap<>();
    	HashMap<Character, Integer> pattern_map = new HashMap<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	if(s.length() < p.length()){
            String temp = p;
            p = s;
            s = temp;
            
            if(p.length() == 0 || p == null) return list;
        }
    	//System.out.println ("Source: "+s+" Pattern: "+p);
    	if(s.length() == 0 || s == null) return list;
    	for(int i = 0; i < p.length(); i++){
    		char ch = p.charAt(i);
    		pattern_map.put(ch, pattern_map.getOrDefault(ch, 0)+1);
    		
    	}
    	
    	for(int i = 0; i < p.length(); i++){
    		char ch = s.charAt(i);
    		source_map.put(ch, source_map.getOrDefault(ch, 0)+1);
    	}
    	
    	//int left_pointer = 0;
    	int right_pointer = p.length();
    	int count = 0;
    	
    	while(right_pointer < s.length()){
    		
    		
    		if(compareMap(source_map, pattern_map)){
    			count++;
    			list.add(right_pointer - p.length());
    		}
    		
    		char next_char = s.charAt(right_pointer);
    		source_map.put(next_char, source_map.getOrDefault(next_char, 0)+1);
    		char previous_char = s.charAt(right_pointer - p.length());
    		
    		if(source_map.get(previous_char) == 1){
    			source_map.remove(previous_char);
    		}else{
    			source_map.put(previous_char, source_map.get(previous_char)-1);
    		}
    		right_pointer++;
    	}
    	
    	if(compareMap(source_map, pattern_map)){
    			count++;
    			list.add(right_pointer - p.length());
    		}
    	//System.out.println (count);
    	return list;
    }
        
    
    public static void main(String[] args) {
        
        AnagramString sol = new AnagramString();
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter source string: ");
        String s = sn.next();
        System.out.print ("Enter pattern string: ");
        String p = sn.next();
        for(int i : sol.findAnagrams(s, p)){
        	System.out.print (i+" ");	
        }
    }
}
