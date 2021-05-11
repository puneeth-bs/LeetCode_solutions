import java.util.*;
public class RepeatedDNASequences {
        
    public static List<String> findRepeatedDnaSequences(String s){
    	
    	List<String> list = new ArrayList<>();
    	HashSet<Character> set1 = new HashSet<>();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            set1.add(ch);
        }
        
        if(set1.size() == 1  && s.length() > 10){
            list.add(s.substring(0, 10));
            return list;
        }
       
    	HashSet<String> set = new HashSet<>();
    	for(int i = 0; i < s.length(); i++){
    		
    		int j = i + 10;
    		if(j <= s.length()){
    			String subString = s.substring(i, j);
    			if(set.contains(subString)){
    				list.add(subString);
    			}else{
    				set.add(subString);
    			}
    		}else{
    			break;
    		}
    	}
    	
    	return list;
    	
    }
    
    
    
    
    
    public static void printList(List<String> list){
    	
    	System.out.print("[ ");
    	Iterator listIterator = list.iterator();
    	while(listIterator.hasNext()){
    		System.out.print(""+listIterator.next());
    		if(listIterator.hasNext()){
    			System.out.print(", ");
    		}
    	}
    	System.out.print(" ]");
    	
    }
    
    public static void main(String[] args) {
        printList(findRepeatedDnaSequences("GAGAGAGAGAGA"));
        
    }
}
