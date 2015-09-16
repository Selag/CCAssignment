package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class Solution04 {
	public static boolean canPermutePalindrome(String s) {
		s = s.toLowerCase();
        Set<Character> set=new HashSet<Character>();
        for(int i=0; i<s.length(); ++i)
        	if(s.charAt(i)!=' '){
        		if (!set.add(s.charAt(i)))
        			set.remove(s.charAt(i));
        	}
        return set.size()<=1;
    }
    
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("T act coa") ? "True" : "False");
        System.out.println(canPermutePalindrome("test") ? "True" : "False");
    }
}
