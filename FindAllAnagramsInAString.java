import java.util.*;
public class FindAllAnagramsInAString {
        
    
    public static List<Integer> findAnagrams(String s, String p){
    	
    	List<Integer> list = new ArrayList<>();
    	if(s.length() == 0 || s == null) return list;
    	if(s.length() < p.length()) return list;
    	HashMap<Character, Integer> pmap = new HashMap<>();
    	HashMap<Character, Integer> smap = new HashMap<>();
    	
    	for(int i = 0; i < p.length(); i++){
    		char ch = p.charAt(i);
    		if(pmap.containsKey(ch)){
    			pmap.put(ch, pmap.get(ch)+1);
    		}else{
    			pmap.put(ch, 1);
    		}
    	}
    	
    	for(int i = 0; i < p.length(); i++){
    		char ch = s.charAt(i);
    		if(smap.containsKey(ch)){
    			smap.put(ch, smap.get(ch)+1);
    		}else{
    			smap.put(ch, 1);
    		}
    	}
    	
    	int i = p.length();
    	
    	while(i < s.length()){
    		if(compareMaps(smap, pmap) == true){
    			list.add((i-p.length()));
    		}
    		
    		char cha = s.charAt(i);
    		smap.put(cha, smap.getOrDefault(cha, 0)+1);
    		char chr = s.charAt(i-p.length());
    		if(smap.get(chr) == 1){
    			smap.remove(chr);
    		}else{
    			smap.put(chr, smap.get(chr)-1);
    		}
    		i++;
    	}
    	
    	if(compareMaps(smap, pmap) == true){
    		list.add((i-p.length()));
    	}
    	
    	
    	
    	return list;
    }
    
    public static boolean compareMaps(HashMap<Character, Integer> smap, HashMap<Character, Integer> pmap){
    	for(char sch : smap.keySet()){
    		if(pmap.getOrDefault(sch, 0) != smap.get(sch)){
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    
    public static void main(String[] args) {
        
        for(int i : findAnagrams("cbaebabacd", "abc")){
        	System.out.print(i+" ");
        }
        
    }
}
