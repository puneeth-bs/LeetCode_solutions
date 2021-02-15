// Longest Substring Without Repeating Characters (leetcode)


import java.util.Scanner;
import java.util.HashSet;
import java.lang.Math;
public class Longest_Substring_Without_Repeating_Characters {
	
	
	
    public int lengthOfLongestSubstring(String s) {
        
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        
        HashSet<Character> hashSet = new HashSet();
        
        while(b_pointer < s.length()){
            
            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            }else{
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
    
        
    public static void main(String[] args) {
    	
    	Longest_Substring_Without_Repeating_Characters solution = new Longest_Substring_Without_Repeating_Characters();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter string: ");
    	String string = s.next();
    	System.out.println(solution.lengthOfLongestSubstring(string));
    	
    	
    }
}
