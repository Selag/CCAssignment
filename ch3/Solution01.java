package StackAndQueue;
import java.util.*;

/*
* Algorithm:  When Pop from one stack , we need to move the element from current Stack
* to the end.
* 
* Complexity: Time: O(1), Space: O(n)
*/
public class Solution01 {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public Solution01(int stackSize) {
    stackCapacity = stackSize;
    values = new int[stackSize * numberOfStacks];
    sizes = new int[numberOfStacks];
  }

  public void push(int stackNum, int value) throws Exception {
    if (isFull(stackNum))
      throw new Exception();
    sizes[stackNum]++;
    values[indexOfTop(stackNum)] = value;
  }

  public int pop(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum))
      throw new EmptyStackException();
    int val = values[indexOfTop(stackNum)];
    sizes[stackNum]--;
    return val;
  }

  public int peek(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum))
      throw new EmptyStackException();
    return values[indexOfTop(stackNum)];
  }

  public boolean isEmpty(int stackNum) {
    return sizes[stackNum] == 0;
  }

  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }

  private int indexOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset + size;   
  }
}
