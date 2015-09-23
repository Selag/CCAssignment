package TreeAndGraph;

import TreeAndGraph.Solution03.TreeNode;

public class Solution04 {
	/*
	 * Recursively check whether the height difference between two nodes are smaller than 2.
	 * 
	 * */
	public static class TreeNode {
		public int value;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public TreeNode leftChild;
		public TreeNode rightChild;
		public TreeNode(int value){
			this.value = value;
		}
		
	}
	public static int getHeight(TreeNode root){
		if (root == null)
			return 0;
		return Math.max(getHeight(root.leftChild), getHeight(root.rightChild))+1;
	}
	public static boolean isBalanced(TreeNode root){
		if (root == null)
			return true;
		if (Math.abs(getHeight(root.leftChild)-getHeight(root.rightChild))> 1)
			return false;
		else
			return isBalanced(root.leftChild) && isBalanced(root.rightChild);
	}
}