package practice;

import java.util.PriorityQueue;

public class KthLargestNumber {
    public Integer findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (Integer i : nums) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }
}
