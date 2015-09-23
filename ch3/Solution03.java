package StackAndQueue;

import java.util.*;
import java.io.*;

public class Solution03 {
  List<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
  
  public void push(int val) {
    Stack<Integer> pre = getPreStack();
    if (pre != null) {
      pre.push(val);
    } else {
      Stack stack = new Stack();
      stack.push(val);
      stacks.add(stack);
    }
  }
  
  public int pop() throws Exception {
    Stack<Integer> pre = getPreStack();
    if (pre == null)
      throw new Exception();
    int v = pre.pop();
    if (pre.size() == 0)
      stacks.remove(stacks.size() - 1);
    return v;
  }

  public Stack<Integer> getPreStack() {
    int size = stacks.size();
    if (size == 0) return null;
    return stacks.get(size - 1);
  }

  public boolean isEmpty() {
    Stack pre = getPreStack();
    return pre == null || pre.isEmpty();
  }
}
