package practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new NextGreaterElementI().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }

    private int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextBiggestMap = getNextBiggestMap(nums2);
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextBiggestMap.getOrDefault(nums1[i], -1);
            if (result[i] != -1) {
                result[i] = nums2[result[i]];
            }
        }
        return result;
    }

    private Map<Integer, Integer> getNextBiggestMap(int[] array) {
        Map<Integer, Integer> nextBiggestMap = new HashMap<>(array.length);
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        stack.push(array[i]);

        while (i < array.length - 1) {
            if (stack.isEmpty() || array[i++] > stack.peek()) {
                stack.push(array[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() <= array[i]) {
                    nextBiggestMap.put(stack.pop(), i);
                }
                stack.push(array[i]);
            }
        }
        while (!stack.isEmpty()) {
            nextBiggestMap.put(stack.pop(), -1);
        }
        return nextBiggestMap;
    }
}
