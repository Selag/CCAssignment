package ArraysAndStrings;

public class Solution05 {
	/*
	 * 
	 *  We make a first pass over S and T concurrently and stop at the first non-matching
	character between S and T.
		1. If S matches all characters in T, then check if there is an extra character at the end
	of T. (Append operation)
		2. If | n – m | == 1, that means we must skip this non-matching character only in T
	and make sure the remaining characters between S and T are exactly matching.
	(Insert operation)
		3. If | n – m | == 0, then we skip both non-matching characters in S and T and make
	sure the remaining characters between S and T are exactly matching.
	(Modify operation)
	*
	*/
	
	public static boolean isOneEditDistance(String s, String t) {
        int m = s.length(), n = t.length();
        if(m > n)
            return isOneEditDistance(t,s);
        if(n-m>1)
            return false;
        
        int i = 0, shift = n-m;
        while(i<m&&s.charAt(i)==t.charAt(i))    i++;
        //Append operation
        if(i==m)    return shift>0;
        //Modify operation
        if(shift==0)    i++;
        //Insertion operation
        while(i<m&&s.charAt(i)==t.charAt(i+shift)) i++;
        return i==m;
    }
	
	public static void main(String[] args) {
	    System.out.println(isOneEditDistance("pale",  "ple") ? "true" : "false"); 
	    System.out.println(isOneEditDistance("pales", "pale") ? "true" : "false"); 
	    System.out.println(isOneEditDistance("pale",  "bale") ? "true" : "false"); 
	    System.out.println(isOneEditDistance("pale",  "bake") ? "true" : "false"); 
	  }
}
