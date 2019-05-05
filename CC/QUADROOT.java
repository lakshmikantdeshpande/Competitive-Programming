package CC;

import java.io.PrintWriter;
import java.util.Scanner;

class QUADROOT {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    float c = scanner.nextFloat();

    double answer1 = (-b + Math.sqrt(b * b - (4 * (a * c)))) / (2 * a);
    double answer2 = (-b - Math.sqrt(b * b - (4 * (a * c)))) / (2 * a);
    pw.printf("%f\n%f", answer1, answer2);

    pw.close();
    scanner.close();
  }

}
