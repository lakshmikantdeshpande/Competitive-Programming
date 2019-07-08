package leetcode.google;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE;
    private int sum;

    public MovingAverage(int size) {
        this.MAX_SIZE = size;
        this.sum = 0;
    }

    public double next(int val) {
        queue.offer(val);
        sum += val;
        if (queue.size() > MAX_SIZE) {
            int last = queue.poll();
            sum -= last;
        }
        return (double) sum / (double) queue.size();
    }
}
