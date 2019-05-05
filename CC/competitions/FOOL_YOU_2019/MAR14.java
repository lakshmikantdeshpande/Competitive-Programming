package CC.competitions.FOOL_YOU_2019;

import java.io.PrintWriter;
import java.util.Scanner;

class MAR14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);

    int number = scanner.nextInt();
    writer.println(getNumberInSequence(number));

    scanner.close();
    writer.close();
  }

  private static String getNumberInSequence(int number) {
    // Sequence: A073055
    switch (number) {
      case 0:
        return "1";
      case 1:
        return "3";
      case 2:
        return "3";
      case 3:
        return "12";
      case 4:
        return "12";
      case 5:
        return "60";
      case 6:
        return "540";
      case 7:
        return "1080";
      case 8:
        return "6480";
      case 9:
        return "32400";
      case 10:
        return "97200";
      case 11:
        return "486000";
      case 12:
        return "3888000";
      case 13:
        return "34992000";
      case 14:
        return "244944000";
      case 15:
        return "2204496000";
      case 16:
        return "6613488000";
      case 17:
        return "13226976000";
      case 18:
        return "39680928000";
      case 19:
        return "317447424000";
      case 20:
        return "1269789696000";
      case 21:
        return "7618738176000";
      case 22:
        return "15237476352000";
      case 23:
        return "91424858112000";
      case 24:
        return "365699432448000";
      case 25:
        return "1097098297344000";
      case 26:
        return "3291294892032000";
      case 27:
        return "26330359136256000";
      case 28:
        return "78991077408768000";
      case 29:
        return "157982154817536000";
      case 30:
        return "1105875083722752000";
      case 31:
        return "9952875753504768000";
      default:
        return "0";
    }
  }
}
