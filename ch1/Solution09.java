package ArraysAndStrings;

public class Solution09 {
	public static boolean isRotation(String s1, String s2) {
		String s3 = s1 + s1;
	    return s3.contains(s2);
	}
	public static void main(String[] args) {
	    System.out.println(isRotation("waterbottle", "erbottlewat") ? "True" : "False");
	    System.out.println(isRotation("waterbottl", "erbottlewat") ? "True" : "False");
	}
}
