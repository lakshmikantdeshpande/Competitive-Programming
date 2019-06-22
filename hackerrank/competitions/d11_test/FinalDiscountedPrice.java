package hackerrank.competitions.d11_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class FinalDiscountedPrice {

  private static void finalPrice(List<Integer> prices) {
    final Deque<Integer> stack = new ArrayDeque<>();
    final Deque<Integer> indexStack = new ArrayDeque<>();
    long finalPrice = 0;
    final PriorityQueue<Integer> noDiscountProducts = new PriorityQueue<>();
    int i = 0;
    stack.push(prices.get(0));
    indexStack.push(0);
    while (i < prices.size() - 1) {
      if (stack.isEmpty() || prices.get(i++) > stack.peek()) {
        stack.push(prices.get(i));
        indexStack.push(i);
      } else {
        int num = prices.get(i);
        while (!stack.isEmpty() && num <= stack.peek()) {
          finalPrice += stack.pop() - num;
          indexStack.pop();
        }
        stack.push(num);
        indexStack.push(i);
      }
    }
    while (!stack.isEmpty()) {
      int noDiscountProductPrice = stack.pop();
      noDiscountProducts.offer(indexStack.pop());
      finalPrice += noDiscountProductPrice;
    }
    System.out.println(finalPrice);
    while (!noDiscountProducts.isEmpty()) {
      System.out.print(noDiscountProducts.poll() + " ");
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
      try {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

    FinalDiscountedPrice.finalPrice(prices);
    bufferedReader.close();
  }
}
