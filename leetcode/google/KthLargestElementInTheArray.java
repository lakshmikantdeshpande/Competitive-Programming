package leetcode.google;

import java.util.PriorityQueue;

class KthLargestElementInTheArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) queue.poll();
        }
        return queue.poll();
    }
}