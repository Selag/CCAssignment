package LinkedLists;

import LinkedLists.Solution06.ListNode;

public class Solution03 {
	public static boolean deleteMiddle(ListNode node) {
	    if (node == null || node.next == null) {
	      return false;
	    } else {
	      node.val = node.next.val;
	      node.next = node.next.next;
	      return true;
	    }
	  }

	public static void main(String[] args) {
	    ListNode a = new ListNode('a');
	    ListNode b = new ListNode('b');
	    ListNode c = new ListNode('c');
	    ListNode d = new ListNode('d');
	    ListNode e = new ListNode('e');
	    a.next = b;
	    b.next = c;
	    c.next = d;
	    d.next = e;
	    System.out.println(a);
	    deleteMiddle(c);
	    System.out.println(a);
	}
}
