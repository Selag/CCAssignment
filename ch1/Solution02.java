package ArraysAndStrings;

import java.util.Arrays;

public class Solution02 {
	/* 
	 * Data Structure and Algorithm: Sort the two string characters by character and then compare. 
	 * 
	 * */
	public static boolean isPermutation(String s, String t) {
	    char[] sCharArr = s.toCharArray();
	    char[] tCharArr = t.toCharArray();
	    Arrays.sort(sCharArr);
	    Arrays.sort(tCharArr);
	    if (sCharArr.length != tCharArr.length) 
	    	return false;
	    for (int i = 0; i < sCharArr.length; i++) {
            if (sCharArr[i] != tCharArr[i])
                return false;
	    }
	    return true;
    }
    public static void main(String[] args) {
	    System.out.println(isPermutation("abc", "abc") ? "This is a permutation" : "This is not a permutation");
	    System.out.println(isPermutation("test", "tset") ? "This is a permutation" : "This is not a permutation");
	    System.out.println(isPermutation("testt", "estt") ? "This is a permutation" : "This is not a permutation");
    }
}
