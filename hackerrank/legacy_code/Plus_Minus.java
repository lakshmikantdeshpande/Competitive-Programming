import java.util.Scanner;

class Plus_Minus {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        int N = scanner.nextInt();
        double positive = 0, negative = 0, zero = 0;
        int i = 0;
        while (i++ < N) {
            int p = scanner.nextInt();
            if (p < 0)
                negative++;
            else if (p > 0)
                positive++;
            else
                zero++;
        }

        System.out.format("%05f\n%05f\n%05f", positive / N, negative / N, zero / N);
        scanner.close();
        scanner = null;
        System.gc();
    }
}