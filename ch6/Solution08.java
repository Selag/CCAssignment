package MathAndLogic;

public class Solution08 {
	public static int findBreakingPoint(int floors) {
		int layerNumber = 14; 
		int lastFloor = 0;
		int egg1 = layerNumber;
		while (!drop(egg1) && egg1 <= floors) {
			layerNumber = layerNumber - 1;
			lastFloor = egg1;
			egg1 = egg1 + layerNumber;
		}
		int egg2 = lastFloor + 1;
		while (egg2 < egg1 && egg2 <= floors && !drop(egg2)) {
			egg2 = egg2 + 1;
		}
		if (egg2 > floors) {
			return -1;
		} else {
			return egg2;
		}
	}

	public static boolean drop(int floor) {
		int breakingLayer = 50; 
		if (floor >= breakingLayer) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int floors = 100;
		System.out.println(Solution08.findBreakingPoint(floors));
	}
}
