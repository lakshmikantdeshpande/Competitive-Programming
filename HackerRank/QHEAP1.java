import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class QHEAP1 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        QH q = new QH((int) Math.round(Math.pow(10, 5)));

        int N = scanner.nextInt();
        while (N-- > 0) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    q.insert(scanner.nextLong());
                    break;
                case 2:
                    Stack<Long> stack = new Stack<>();
                    long num = scanner.nextLong();
                    long p = Long.MIN_VALUE;
                    do {
                        p = q.remove();
                        stack.push(p);
                    } while (p != num);
                    stack.pop();
                    while (!stack.isEmpty()) {
                        q.insert(stack.pop());
                    }
                    break;
                case 3:
                    pw.println(q.peek());
                    break;
            }
        }

        pw.close();
        scanner.close();
    }

    static class QH {
        private long[] array;
        private int size;
        private int capacity;

        public QH(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            array = new long[capacity + 1];
        }

        public void insert(long number) {
            array[++size] = number;
            swim(size);
        }

        public long remove() {
            long number = array[1];
            swap(1, size--);
            sink(1);
            return number;
        }

        public long peek() {
            return array[1];
        }

        private void sink(int k) {
            while (2 * k <= size) {
                int j = 2 * k;
                if (j < size && array[j] > array[j + 1])
                    j++;
                if (array[j] >= array[k])
                    break;
                swap(j, k);
                k = j;
            }
        }

        private void swim(int k) {
            while (k > 1 && array[k] < array[k / 2]) {
                swap(k, k / 2);
                k /= 2;
            }
        }

        private void swap(int i, int j) {
            long temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
    }
}
