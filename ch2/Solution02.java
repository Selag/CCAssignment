package LinkedLists;

import LinkedLists.Solution06.ListNode;

public class Solution02 {
	/* Maintain two pointers, move the faster one k steps ahead of the slow one */
	public static ListNode returnKth(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        
        for(int cnt = 0; cnt <= n; cnt++)
            fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.next;
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
	    System.out.println(returnKth(a, 2).val); // should be d
	}
}
