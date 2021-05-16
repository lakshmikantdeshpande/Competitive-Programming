package leetcode.jpmorgan;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (map.containsKey(n)) {
            return map.get(n);
        }
        int sum = fib(n - 1) + fib(n - 2);
        map.put(n, sum);
        return sum;
    }
}
