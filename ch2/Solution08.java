package LinkedLists;
import java.util.*;

import LinkedLists.Solution08.ListNode;

public class Solution08 {
	public static class ListNode {
	    ListNode next;
	    int val;
	    public ListNode(int val) {
	    	this.val = val;
	    }
	    public String toString() {
	    	return this.val + "";
	    }
	}

	public static ListNode detectCycle(ListNode head) {
		ListNode fast = head;
        ListNode slow = head;
        while(fast != null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                fast = head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
	    return null;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
	    ListNode b = new ListNode(2);
	    ListNode c = new ListNode(3);
	    ListNode d = new ListNode(4);
	    ListNode e = new ListNode(5);
	    
	    ListNode g = new ListNode(7);
	    ListNode h = new ListNode(8);
	    a.next = b;
	    b.next = c;
	    c.next = d;
	    d.next = e;
	    e.next = g;
	    g.next = h;
	    h.next = e;
	    
	    System.out.println(detectCycle(a));
	 }
}
