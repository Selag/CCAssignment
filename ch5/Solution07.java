package BitManipulation;

public class Solution07 {
	public static int swapOddEvenBits(int x) {
	    return (((x & 0xaaaaaaaa) >>> 1) | 
	            ((x & 0x55555555) <<  1));
	  }
	public static void main(String[] args) {
		System.out.println("Input: "+Integer.toBinaryString(6));
	    System.out.println("Output: "+Integer.toBinaryString(swapOddEvenBits(6)));
	}
}
