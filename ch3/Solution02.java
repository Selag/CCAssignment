package StackAndQueue;

import java.util.*;

public class Solution02 extends Stack<Integer> {
	Stack<Integer> minStack;
	public Solution02() {
		minStack = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) {
			minStack.push(value);
		} 
		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			minStack.pop();
		}
		return value;
	}

	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}
  
	public static void main(String[] args) {
		Solution02 minstack = new Solution02();
		minstack.push(1);
		minstack.push(4);
		minstack.push(8);
		System.out.println(minstack.min());
	}
}
