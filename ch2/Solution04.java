package LinkedLists;

import LinkedLists.Solution07.ListNode;

public class Solution04 {
	public static ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode pre = helper;
        ListNode cur = helper;
        while(cur.next!=null){
            if(cur.next.val<x){
                if(cur!=pre){
                    ListNode next = cur.next.next;
                    cur.next.next = pre.next;
                    pre.next = cur.next;
                    cur.next = next; 
                }
                else
                    cur = cur.next;
                pre = pre.next;                
            }
            else
                cur = cur.next;
        }
        return helper.next;
    }
	public static void main(String[] args) {
	    ListNode a = new ListNode(3);
	    ListNode b = new ListNode(5);
	    ListNode c = new ListNode(8);
	    ListNode d = new ListNode(5);
	    ListNode e = new ListNode(10);
	    ListNode f = new ListNode(2);
	    ListNode g = new ListNode(1);
	    a.next = b;
	    b.next = c;
	    c.next = d;
	    d.next = e;
	    e.next = f;
	    f.next = g;
	    System.out.println(a);
	    ListNode x = partition(a, 5);
	    System.out.println(x);
	}
}
