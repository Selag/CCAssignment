package StackAndQueue;

import java.util.*;

public class Solution05 {
  public Stack<Integer> sort(Stack<Integer> input) {
    Stack<Integer> res = new Stack<Integer>();
    while (!input.isEmpty()) {
      int tmp = input.pop();
      while (!res.isEmpty() && res.peek() > tmp) {
        input.push(res.pop());
      }
      res.push(tmp);
    }
    return res;
  }
}
