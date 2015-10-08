package BitManipulation;

import java.util.Scanner;

public class Solution06 {
	public static int swapNumber(int a, int b) {
		int count = 0;
		for (int c = a ^ b; c != 0; c = c & (c - 1)) {
			count++;
		}
		return count;
	}

	public static void main(String args[]) {
		System.out.println(swapNumber(29, 15));
	}
}
