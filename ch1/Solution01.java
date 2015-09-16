package ArraysAndStrings;

import java.io.IOException;

public class Solution01 {
	/* 
	 * Assumption: there are only a to z lower case letters in the string.
	 * 
	 * Data Structure and Algorithm: Since there are only 26 different characters possible 
	 * and there are 32 bits in an int, we can creates an int variable where each bit of 
	 * the variable corresponds to one of the characters in the string. 
	 *
	 * Complexity: Space: O(1), Time: O(n)
	 * 
	 * */
	public static boolean isUniqueChars(String str){
		//Initialize every bit to 0.
		int mask = 0;
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i) - 'a';
			//If the val-th bit has already been set, then there is a duplicate.
			if((mask&(1<<val))>0){
				return false;
			}
			//Set the val-th bit of the number to 1.
			mask = mask | (1<<val);
		}
		return true;		
	}
	
	public static void main(String[] args) throws IOException {
	    System.out.println(isUniqueChars("aaa") ? "Unique" : "Not Unique"); 
	    System.out.println(isUniqueChars("abc") ? "Unique" : "Not Unique"); 
	}
}
