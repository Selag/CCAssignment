package ArraysAndStrings;

import java.io.IOException;

public class Solution03 {
	/* From the end of the string, replace the blank space with %20 */
	public static char[] URLify(char[] chars, int len) {
	    int spaces = countSpaces(chars, len);
	    int end = len - 1 + spaces * 2;
	    for (int i = len - 1; i >= 0; i--) {
	    	// Blank Space
	    	if (chars[i] == ' ') {
	        chars[end - 2] = '%';
	        chars[end - 1] = '2';
	        chars[end]     = '0';
	        end -= 3;
	    	}else{
	    		//Non space character
	    		chars[end] = chars[i];
	    		end--;
	    	}
	    }
	    return chars;
	}

   static int countSpaces(char[] chars, int len) {
	  int count = 0;
	  for (int i = 0; i < len; i++)
		  if (chars[i] == ' ')
			  count++;
	  return count;
   }

   public static void main(String[] args) throws IOException {
	  char[] chars = "Mr John Smith    ".toCharArray();
	  System.out.println(URLify(chars, 13));
   }
}
