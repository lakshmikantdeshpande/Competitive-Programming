// N time 1 space
// poorly written :P

package competitions.week_of_code_33;

import java.io.PrintWriter;
import java.util.Scanner;

class Twin_Arrays {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();

        Num firstA = new Num(Integer.MAX_VALUE, -1);
        Num secondA = new Num(Integer.MAX_VALUE, -1);
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp < firstA.number) {
                secondA.number = firstA.number;
                secondA.index = firstA.index;
                firstA.number = temp;
                firstA.index = i;
            } else if (temp < secondA.number) {
                secondA.number = temp;
                secondA.index = i;
            }
        }

        Num firstB = new Num(Integer.MAX_VALUE, -1);
        Num secondB = new Num(Integer.MAX_VALUE, -1);
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp < firstB.number) {
                secondB.number = firstB.number;
                secondB.index = firstB.index;
                firstB.number = temp;
                firstB.index = i;
            } else if (temp < secondB.number) {
                secondB.number = temp;
                secondB.index = i;
            }
        }

        if (firstA.index != firstB.index) {
            pw.println(firstA.number + firstB.number);
        } else {
            int min = Integer.MAX_VALUE;
            if (secondA.index != secondB.index)
                min = secondA.number + secondB.number;
            min = Math.min(firstA.number + secondB.number, min);
            min = Math.min(secondA.number + firstB.number, min);
            pw.println(min);
        }

        scanner.close();
        pw.close();
    }

    private static class Num {
        int number;
        int index;

        public Num(int number, int index) {
            this.number = number;
            this.index = index;
        }
    }
}