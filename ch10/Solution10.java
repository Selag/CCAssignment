package SortingAndSearch;

public class Solution10 {
	static RankNode root = null;

	public static void track(int x) { // Insertion function
		if (root == null) {
			root = new RankNode(x);
		} else {
			root.insert(x);
		}
	}

	public static int getRankOfNumber(int x) { // Ranking function
		return root.getRank(x);
	}

	public static class RankNode {
		public int leftSize = 0;
		public RankNode left;
		public RankNode right;
		public int data = 0;

		public RankNode(int d) {
			this.data = d;
		}

		public void insert(int d) {
			if (d <= data) {
				if (left != null) {
					left.insert(d);
				} else {
					left = new RankNode(d);
				}
				leftSize++;
			} else {
				if (right != null) {
					right.insert(d);
				} else {
					right = new RankNode(d);
				}
			}
		}

		public int getRank(int d) {
			if (d == data) {
				return leftSize;
			} else if (d < data) {
				if (left == null) {
					return -1;
				} else {
					return left.getRank(d);
				}
			} else {
				if (right == null) {
					return -1;
				} else {
					return leftSize + 1 + right.getRank(d);
				}
			}
		}
	}
	public static void main(String args[]){
		track(5);
		track(1);
		track(4);
		track(4);
		track(5);
		track(9);
		track(7);
		track(13);
		track(3);
		System.out.println(getRankOfNumber(1));
		System.out.println(getRankOfNumber(3));
		System.out.println(getRankOfNumber(4));
	}
}
