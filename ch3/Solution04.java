package StackAndQueue;

import java.util.*;

public class Solution04<T> {
  Stack<T> stackOutput, stackInput;

  public Solution04() {
    stackOutput = new Stack<T>();
    stackInput = new Stack<T>();
  }

  public int size() {
    return stackOutput.size() + stackInput.size();
  }

  public void add (T value) {
    stackOutput.push(value);
  }

  public void shiftStacks() {
    if (stackInput.isEmpty())
      while (!stackOutput.isEmpty()) {
        stackInput.push(stackOutput.pop());
      }
    }

  public T peek() {
    shiftStacks();
    return stackInput.peek();
  }

  public T remove() {
    shiftStacks();
    return stackInput.pop();
  }
}
