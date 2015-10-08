package BitManipulation;

public class Solution01 {
	//Step 1: clear bits from i to j in N
	public static int clearBit(int i, int j) { 
		int allOnes = ~0;
		int left = allOnes << (j + 1);
		int right = (1 << i) - 1;
		int clearMask = left | right;
		return clearMask;
	}
	//Step 2: Shift M so that it lines up with N, then merge them
	public static int insertBit(int n, int m, int i, int j) {
		int clearN = n & clearBit(i, j);
		int M = m << i;
		int res = clearN | M;
		return res;
	}

	public static void main(String args[]) {
		int n = 512;
		System.out.println("N:" + Integer.toBinaryString(n));
		int m = 19;
		System.out.println("M:" + Integer.toBinaryString(m));
		int i = 2;
		int j = 6;
		int newM = insertBit(n, m, i, j);
		System.out.println("Result: " + Integer.toBinaryString(newM));

	}
}
