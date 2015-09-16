package LinkedLists;

public class Solution07 {
	public static class ListNode {
		int val;
	    ListNode next;
	    
	    public ListNode(int val) {
	    	this.val = val;
	    }
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        ListNode temp = this;
	        while (temp != null) {
	        	sb.append(temp.val);
	        	sb.append(" ");
	        	temp = temp.next;
	        }
	        return sb.toString();
	    }
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    int lenA = 0, lenB = 0;
	    ListNode currA = headA, currB = headB;
	    while(currA != null) {
	        lenA++;
	        currA = currA.next;
	    }
	    while(currB != null) {
	        lenB++;
	        currB = currB.next;
	    }
	    currA = headA;
	    currB = headB;
	    if(lenA > lenB) {
	        for(int i=0; i<lenA-lenB; i++)
	            currA = currA.next;
	    } else {
	        for(int i=0; i<lenB-lenA; i++)
	            currB = currB.next;
	    }
	    while(currA != currB) {
	        currA = currA.next;
	        currB = currB.next;
	    }
	    return currA;
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
	    
	    g.next = h;
	    h.next = d;
	    System.out.println(a);
	    System.out.println(g);
	    
	    System.out.println(getIntersectionNode(a, g));
	}
}
