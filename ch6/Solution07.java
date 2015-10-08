package MathAndLogic;

import java.util.Random;

public class Solution07 {
	public static int[] runOneFamily() {
		int girls = 0;
		int boys = 0;
		Random random = new Random();
		while (girls == 0) {
			if (random.nextBoolean()) {
				girls++;
			} else {
				boys++;
			}
		}
		int[] genders = { girls, boys };
		return genders;
	}

	public static double runNFamily(int n) {
		int boys = 0;
		int girls = 0;
		for (int i = 0; i < n; i++) {
			int[] genders = runOneFamily();
			girls = girls + genders[1];
			boys = boys + genders[1];
		}
		return girls / (double) (girls + boys);
	}

	public static void main(String args[]) {
		int n = 10000;
		System.out.println(runNFamily(n));
	}
}
