package TreeAndGraph;

import java.util.Stack;
import TreeAndGraph.Solution03.TreeNode;

public class Solution05 {
	/*
	 * Iteratively traverse the tree using in order traverse,
	 * Check whether nodes are in ascending order.
	 * 
	 * */ 
	public boolean isValidBST(TreeNode root){
        if(root==null)
            return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode cur = root;
        while(cur!=null||!stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur = cur.leftChild;
            }else{
                cur = stack.pop();
                if(pre!=null&&pre.value>=cur.value)
                    return false;
                pre = cur;
                cur = cur.rightChild;
            }
        }
        return true;
    }
}