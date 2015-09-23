package TreeAndGraph;

import java.util.Stack;
import TreeAndGraph.Solution03.TreeNode;

public class Solution06 {
	/* 
	 * InOrder traverse the tree, keep track of previous node.
	 * Once find the previous node is the target, return current node.
	 * 
	 * */
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null)
            return null;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!=null||!stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root = root.leftChild;
            }else{
                root = stack.pop();
                if(pre!=null&&pre.value==p.value)
                    return root;
                pre = root;
                root = root.rightChild;
            }
        }
        return null;
    }
}
