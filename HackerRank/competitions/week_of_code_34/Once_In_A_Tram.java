package competitions.week_of_code_34;

import java.io.PrintWriter;
import java.util.Scanner;

public class Once_In_A_Tram {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        pw.println(onceInATram(N));
        pw.close();
        scanner.close();
    }

    static int onceInATram(int number) {
        int start = number / 1000;
        int end = number % 1000;

        int sCount = getCount(start);
        int eCount = getCount(end);

        int required = sCount * 2;
        int sum = sCount + eCount;

        int difference = required - sum;
        if (difference < 0) {
            int temp = number + 1;
            int left = getCount(temp % 1000);
            int right = getCount(temp / 1000);
            int t = left + right;
            while (right != left) {
                temp++;
                left = getCount(temp % 1000);
                right = getCount(temp / 1000);
                t = left + right;

            }
            return temp;
        } else if (difference == 0) {
            return number + 9;
        }

        while ((difference--) != 0) {
            number++;
        }

        return number;
    }

    static int getCount(int number) {
        int counter = 0;
        while (number > 0) {
            counter = counter + number % 10;
            number /= 10;
        }

        return counter;
    }
}
