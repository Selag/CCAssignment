package TreeAndGraph;

import java.util.Random;

public class Solution11 {
	/*
	 * 1. Assuming the total number of nodes in the tree is n,
	 *    then randomly generate a number from 1 to n.
	 * 2. Based on in-order traverse of the tree, locate node k, which is the random number.
	 * 
	 * */
	class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		public int size = 0;

		public TreeNode(int d) {
			val = d;
			size = 1;
		}

		public int size(){
			return size;
		}
		public TreeNode find(int v){
			if (val == v){
				return this;
			}else if (val >= v){
				return left == null ? null : left.find(v);
			} else {
				return right == null ? null : right.find(v);
			}
		}

		public void insert(int v){
			if (v <= val){
				if (left == null){
					left = new TreeNode(v);
					return;
				}else{
					left.insert(v);
				}
			}else{
				if (right == null) {
					right = new TreeNode(v);
					return;
				} else {
					right.insert(v);
					return;
				}
			}
			size++;
		}
		
		public TreeNode getRandomNode(){
			int leftSize = left==null ? 0 : left.size();
			Random random = new Random();
			int index = random.nextInt(size);
			if (index < val){
				return left.getRandomNode();
			} else if(index == val){
				return this;
			} else {
				return right.getRandomNode();
			}				
		}
	}
}

