package codechef.competitions.FOOL_YOU_2019;

import java.io.PrintWriter;
import java.util.Scanner;

class KGO15 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int T = scanner.nextInt();
    scanner.nextLine();
    while (T-- > 0) {
      String number = scanner.nextLine();
      long count = 0;
      for (char c : number.toCharArray()) {
        count += getCirclesInNumber(Character.getNumericValue(c));
      }
      writer.println(count % 1000000007);
    }

    scanner.close();
    writer.close();
  }

  private static long getCirclesInNumber(int number) {
    switch (number) {
      case 1:
      case 2:
      case 3:
      case 5:
      case 7:
        return 0;
      case 0:
      case 4:
      case 6:
      case 9:
        return 1;
      case 8:
        return 2;
      default:
        return 0;
    }
  }
}
