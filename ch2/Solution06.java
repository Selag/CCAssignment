package LinkedLists;
import java.util.*;

public class Solution06 {
	public static class ListNode {
	    ListNode next;
	    char val;
	    public ListNode(char val) {
	    	this.val = val;
	    }
	    public String toString() {
	    	StringBuilder sb = new StringBuilder();
	    	ListNode temp = this;
	    	while (temp != null) {
	    		sb.append(temp.val);
	    		temp = temp.next;
	    	}
	    	return sb.toString();
	    }
	}
	  
	public static boolean isPalindrome(ListNode head) {
		if(head==null || head.next==null) return true;
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next!=null && fast.next.next!=null){ 	// 注意在此处也要判断fast.next.next!=null
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode next = slow.next.next;
		ListNode tail = slow.next;

		//Invert half list   
		while(next!=null){
			ListNode temp = slow.next;
			slow.next = next;
			tail.next = next.next;
			next.next = temp;
			next = tail.next;
		}

		while(slow.next!=null){
			if(head.val != slow.next.val){
				return false;
			}
			slow = slow.next;
			head = head.next;
		}
		return true;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode('r');
		ListNode b = new ListNode('a');
		ListNode c = new ListNode('r');
	    a.next = b;
	    b.next = c;
	    System.out.println(isPalindrome(a) ? "True" : "False");
	    System.out.println(isPalindrome(b) ? "True" : "False");
	    
	}
}
