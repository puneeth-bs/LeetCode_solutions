import java.util.*;
public class RotateString {
        
    public static boolean rotateString(String s, String goal){
    	if(s.length() != goal.length()) return false;
        if(s.length() == 0 && goal.length() == 0) return true;
        if(s.length() == 0 && goal.length() != 0) return false;
        String string = s+s;
        int j = goal.length();
        for(int i = 0; i < string.length(); i++){
            
            if(i+j <= string.length()-1){
                String subString = string.substring(i, i+j);
                if(subString.equals(goal)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        if(rotateString("abcde", "abced")){
        	System.out.println ("true");
        }else{
        	System.out.println ("false");
        }
        
    }
}
