package geeksforgeeks.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingTwoQueues {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      GfG g = new GfG();

      int q = sc.nextInt();
      while (q > 0) {
        int queryType = sc.nextInt();
        if (queryType == 1) {
          int a = sc.nextInt();
          g.push(a);
        } else if (queryType == 2) {
          System.out.print(g.pop() + " ");
        }
        q--;
      }
      System.out.println();


      t--;
    }
  }

  private static class GfG {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    /*The method pop which return the element poped out of the stack*/
    int pop() {
      if (q2.isEmpty()) {
        if (q1.isEmpty()) {
          return -1;
        } else {
          while (q1.size() > 1) {
            q2.offer(q1.poll());
          }
          return q1.poll();
        }
      } else {
        while (q2.size() > 1) {
          q1.offer(q2.poll());
        }
        return q2.poll();
      }
    }

    void push(int a) {
      if (q1.isEmpty() && q2.isEmpty()) {
        q1.offer(a);
      } else if (q1.isEmpty()) {
        q2.offer(a);
      } else {
        q1.offer(a);
      }
    }
  }
}
