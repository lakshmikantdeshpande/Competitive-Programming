public class LargestAreaUnderHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int maxArea = 0;
        
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int max = 0;
                int top = stack.pop();
                if (stack.isEmpty()) {
                    max = heights[top] * i;
                } else {
                    max = heights[top] * (i - stack.peek() - 1);
                }
                maxArea = Math.max(max, maxArea);
            }
        }
        
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int max = 0;
            if (stack.isEmpty()) {
                max = heights[top] * i;
            } else {
                max = heights[top] * (i - stack.peek() - 1);
            }
            maxArea = Math.max(max, maxArea);
        }
        return maxArea;
    }
}
