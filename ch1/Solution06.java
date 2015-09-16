package ArraysAndStrings;

public class Solution06 {
	public static String compress(String str) {
	    StringBuilder sb = new StringBuilder();
	    int count = 1;
	    for (int i = 1; i < str.length(); i++) {
	      if (str.charAt(i) != str.charAt(i - 1)) {
	        sb.append(str.charAt(i-1));
	        sb.append(count);
	        count = 1;
	      } else
	        count++;
	    }
	    sb.append(str.charAt(str.length()-1));
        sb.append(count);
	    String x = sb.toString();
	    if (x.length() > str.length())
	      return str;
	    else
	      return x;
	  }

	public static void main(String[] args) {
		System.out.println(compress("aammxxxbnyyuiwwwwwwwwwwwwwwwws"));
	    System.out.println(compress("abcdef"));
	}
}
