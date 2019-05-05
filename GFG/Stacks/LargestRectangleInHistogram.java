package Stacks;

import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangleInHistogram {

  public static void main(String[] args) {
    int[] areas = new int[]{2, 1, 5, 6, 2, 3};
    System.out.println(findMaxArea(areas));
  }

  private static int findMaxArea(int[] array) {
    if (array == null || array.length == 0) {
      return 0;
    }

    Deque<Integer> stack = new LinkedList<>();
    int maxArea = 0;
    int i = 0;

    while (i < array.length) {
      if (stack.isEmpty() || array[stack.peek()] <= array[i]) {
        stack.push(i++);
      } else {
        int top = stack.pop();
        maxArea = Math.max(maxArea, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
      }
    }

    while (!stack.isEmpty()) {
      int top = stack.pop();
      maxArea = Math.max(maxArea, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
    }
    return maxArea;
  }

}
