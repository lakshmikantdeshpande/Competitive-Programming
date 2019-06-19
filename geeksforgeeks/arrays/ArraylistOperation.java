package geeksforgeeks.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class ArraylistOperation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      // Declaring ArrayList
      ArrayList<Character> clist = new ArrayList<>();

      int q = sc.nextInt();

      // Looping for queries
      while (q-- > 0) {
        char ch = sc.next().charAt(0);

        if (ch == 'i') {
          char c = sc.next().charAt(0);
          insert(clist, c);
        }

        if (ch == 'f') {
          char c = sc.next().charAt(0);
          freq(clist, c);
        }
      }
    }
  }

  private static void insert(List<Character> clist, char c) {
    clist.add(c);
  }

  private static void freq(List<Character> clist, char c) {
    final int frequency = Collections.frequency(clist, c);
    if (frequency > 0)
      System.out.println(frequency);
    else
      System.out.println("Not Present");
  }
}
