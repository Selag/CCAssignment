package LinkedLists;

import LinkedLists.Solution07.ListNode;

public class Solution05 {
	
	public static ListNode addTwoNumbersFollowup(ListNode l1, ListNode l2){
		ListNode res = reverse(addTwoNumbers(reverse(l1),reverse(l2)));
		return res;
	}
	
	public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int digit = carry + x + y;
            carry = digit / 10;
            curr.next = new ListNode(digit % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

	public static void main(String[] args) {
	    ListNode a = new ListNode(7);
	    ListNode b = new ListNode(1);
	    ListNode c = new ListNode(6);
	    a.next = b;
	    b.next = c;
	    
	    ListNode d = new ListNode(5);
	    ListNode e = new ListNode(9);
	    ListNode f = new ListNode(2);
	    d.next = e;
	    e.next = f;
	    
	    ListNode h = new ListNode(6);
	    ListNode i = new ListNode(1);
	    ListNode j = new ListNode(7);
	    h.next = i;
	    i.next = j;
	    
	    ListNode k = new ListNode(2);
	    ListNode l = new ListNode(9);
	    ListNode m = new ListNode(5);
	    k.next = l;
	    l.next = m;

	    ListNode x = addTwoNumbers(a, d);
	    ListNode y = addTwoNumbersFollowup(h,k);
	    System.out.println(x);
	    System.out.println(y);
	}
}
