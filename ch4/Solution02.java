package TreeAndGraph;

public class Solution02 {
	/*
	 * This problem is equal to construct a highly balanced BST from a sorted array.
	 * 
	 * */
	public static class TreeNode {
		public int value;
		public TreeNode leftChild;
		public TreeNode rightChild;
		public TreeNode(int value){
			this.value = value;
		}
	}
	public static TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0||num==null)
            return null;
        return helper(0,num.length-1,num);
    }
    
    public static TreeNode helper(int start, int end, int[] num){
        if(start>end)
            return  null;
        int m = (start+end)/2;
        TreeNode root = new TreeNode(num[m]);
        root.leftChild = helper(start, m-1, num);
        root.rightChild = helper(m+1, end, num);
        return root;
    }
	public static void inOrderTraversal (TreeNode root){
		if (root == null)
			return;
		inOrderTraversal(root.leftChild);
		System.out.println(root.value);		
		inOrderTraversal(root.rightChild);
	}
	public static void main (String args[]){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		TreeNode root = sortedArrayToBST(array);
		inOrderTraversal(root);
	}
}
