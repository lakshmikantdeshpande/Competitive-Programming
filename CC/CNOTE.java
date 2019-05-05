package CC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CNOTE {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int testcases = Integer.parseInt(br.readLine());
    while (testcases-- > 0) {
      String[] tokens = br.readLine().split(" ");
      int pagesForPoetry = Integer.parseInt(tokens[0]);
      int availablePages = Integer.parseInt(tokens[1]);
      int money = Integer.parseInt(tokens[2]);
      int notebooks = Integer.parseInt(tokens[3]);

      int requiredPages = pagesForPoetry - availablePages;
      boolean notebookFound = false;
      while (notebooks-- > 0) {
        tokens = br.readLine().split(" ");
        int pages = Integer.parseInt(tokens[0]);
        int price = Integer.parseInt(tokens[1]);
        if (pages >= requiredPages && price <= money) {
          notebookFound = true;
        }
      }

      pw.println(notebookFound ? "LuckyChef" : "UnluckyChef");
    }
    br.close();
    pw.close();
  }
}
