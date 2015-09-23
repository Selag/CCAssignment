package TreeAndGraph;

import java.util.ArrayList;
import java.util.List;

import TreeAndGraph.Solution03.TreeNode;

public class Solution12 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> list = new ArrayList<Integer>();
        int c = 0;
        
        dfs(root,sum,c,res,list);
        return res;

    }

    void dfs(TreeNode root, int sum, int carry, List<List<Integer>> res, List<Integer> list ){
    	if (root == null) return;

    	if (root.leftChild == null && root.rightChild == null) {
    		if (carry + root.value == sum) {
    			list.add(root.value);
    			res.add(new ArrayList<Integer>(list));  
    			list.remove(list.size()-1);
    		}
    		return;
    	}
    	list.add(root.value);
    	carry += root.value;
    	dfs(root.leftChild, sum, carry, res, list);
    	list.remove(list.size()-1);
    	carry -= root.value;

    	list.add(root.value);
    	carry += root.value;
    	dfs(root.rightChild, sum, carry, res, list);
    	list.remove(list.size()-1);
    	carry -= root.value;
    	return;

    }

}