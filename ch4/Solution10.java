package TreeAndGraph;

public class Solution10 {
	  public class Node {
	    public Node left;
	    public Node right;
	    public int val;
	    public Node(int val) {
	      this.val = val;
	    }
	  }

	  // Assumption: Larger tree is T1
	  public boolean containsTree(Node T1, Node T2) {
	    if (T2 == null)
	      return true;
	    return subTree(T1, T2);
	  }

	  // Assumption: Larger tree is T1
	  public boolean subTree(Node T1, Node T2) {
	    if (T1 == null)
	      return false;
	    else if (T1.val == T2.val && isSameTree(T1, T2))
	      return true;
	    return subTree(T1.left, T2) ||
	           subTree(T1.right, T2);
	  }
	  
	  public boolean isSameTree(Node p, Node q) {
	        if(p==null&&q==null)
	            return true;
	        if(p==null||q==null)
	            return false;
	        if(p.val!=q.val)
	            return false;
	        return isSameTree(p.left, q.left)&&isSameTree(p.right,q.right);
	    }
	}
