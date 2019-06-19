package geeksforgeeks.adhoc;
// lakshmikantd on CodeChef, HackerEarth
// lakshmikantdeshpande on HackerRank, GitHub, GeeksForGeeks

import java.util.Scanner;

class Height {
  int feet;
  int inches;

  public Height(int ft, int inc) {
    feet = ft;
    inches = inc;
  }
}

class maximum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      Height arr[] = new Height[n];
      for (int i = 0; i < n; i++) {
        int temp1 = sc.nextInt();
        int temp2 = sc.nextInt();
        arr[i] = new Height(temp1, temp2);

      }
      GfG gfg = new GfG();

      int res = gfg.findMax(arr, n);
      System.out.println(res);
    }
  }
}

class GfG {
  public static int findMax(Height arr[], int n) {
    int max = 0;
    for (Height height : arr) {
      max = Math.max(max, height.feet * 12 + height.inches);
    }
    return max;
  }

}