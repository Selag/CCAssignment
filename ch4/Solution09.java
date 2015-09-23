package TreeAndGraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution09 {
	public static class Tree {
		public int val;
		public Tree left;
		public Tree right;
		Tree(int val) {
			this.val = val;
		}
	}
	private static void help(List<Tree> node, List<Integer> item, List<List<Integer>> res) {
		if (node.isEmpty()) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
		Iterator<Tree> iter = new ArrayList<Tree>(node).iterator();
		while (iter.hasNext()) {
			Tree tree = iter.next();
			node.remove(tree);
			if (tree.left != null)
				node.add(tree.left);
			if (tree.right != null)
				node.add(tree.right);
			item.add(tree.val);
			help(node, item, res);
			//Backtracking
			item.remove(item.size() - 1);
			if (tree.right != null)
				node.remove(tree.right);			
			if (tree.left != null)
				node.remove(tree.left);
			node.add(tree);
		}
	}
	public static List<List<Integer>> BSTSequences(Tree root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> item = new ArrayList<Integer>();
		List<Tree> node = new ArrayList<Tree>();
		node.add(root);
		help(node, item, res);
		return res;
	}
	public static void main(String[] args) {
		Tree tree = new Tree(2);
		tree.left = new Tree(1);
		tree.right = new Tree(3);
		List<List<Integer>> results = BSTSequences(tree);
		for (List<Integer> result : results) {
			for (Integer val : result) {
				System.out.print(val + " ");
			}
			System.out.println("");
		}
	}
}
