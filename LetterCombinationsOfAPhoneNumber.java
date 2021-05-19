import java.util.*;
public class LetterCombinationsOfAPhoneNumber {
        
    public static List<String> letterCombinations(String digits){
    	LinkedList<String> listQueue = new LinkedList<String>();
    	if(digits.length() == 0) return listQueue;
    	listQueue.add("");
    	String[] mappings = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    	for(int i = 0; i < digits.length(); i++){
    		int digit = Character.getNumericValue(digits.charAt(i));
    		while(listQueue.peek().length() == i){
    			String string = listQueue.remove();
    			for(char ch : mappings[digit].toCharArray()){
    				listQueue.add(string + ch);
    			}
    		}
    	}
    	return listQueue;
    	
    	
    }
    
    public static void printList(List<String> list){
    	for(String s : list){
    		System.out.print(s+" ");
    	}
    }
    public static void main(String[] args) {
        printList(letterCombinations("23"));
    }
}
