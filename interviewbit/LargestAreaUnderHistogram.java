import java.util.ArrayList;
import java.util.Stack;

public class LargestAreaUnderHistogram {
    public int largestRectangleArea(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < list.size()) {
            if (stack.isEmpty() || list.get(stack.peek()) <= list.get(i)) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = 0;
                if (stack.isEmpty()) {
                    area = list.get(top) * i;
                } else {
                    area = list.get(top) * (i - stack.peek() - 1);
                }
                maxArea = Math.max(area, maxArea);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = 0;
            if (stack.isEmpty()) {
                area = list.get(top) * i;
            } else {
                area = list.get(top) * (i - stack.peek() - 1);
            }
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
