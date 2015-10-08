package MathAndLogic;

import java.util.Random;

public class Solution10 {
	public static int findPoisonedBottle(int bottleNumber, boolean[] strips, int poisonedBottle) {
		for (int i = 1; i <= bottleNumber; i++) { 
			if (i == poisonedBottle) {
				for (int j = 0; j < 10; j++) {
					if (((i >>> j) & 1) == 1) {
						strips[9 - j] = true;
					}
				}
			}
		}
		int result = 0;
		for (int j = 0; j < strips.length; j++) { 
			result = (result << 1) + (strips[j] ? 1 : 0);
		}
		return result;
	}

	public static void main(String[] args) {
		int bottleNumber=100;
		boolean[] strips = new boolean[10];
		int poisonedBottle = new Random().nextInt(bottleNumber) + 1;
		System.out.println("Poisoned bottle Number: " + poisonedBottle);
		int result = findPoisonedBottle(bottleNumber, strips, poisonedBottle);
		System.out.println("Result:"+result);
	}
}
