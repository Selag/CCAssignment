package TreeAndGraph;

import TreeAndGraph.Solution03.TreeNode;

public class Solution08 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        
        // Divide
        TreeNode left = lowestCommonAncestor(root.leftChild, p, q);
        TreeNode right = lowestCommonAncestor(root.rightChild, p, q);
        
        // Conquer
        if (left != null && right != null) {
            return root;
        } 
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
}
