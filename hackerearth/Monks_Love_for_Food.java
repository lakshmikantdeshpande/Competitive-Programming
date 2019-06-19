import java.io.PrintWriter;
import java.util.Scanner;

class Monks_Love_for_Food {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();
        Stack stack = new Stack(1024);

        while (queries-- > 0) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                if (stack.isEmpty())
                    pw.println("No Food");
                else
                    pw.println(stack.pop());
            } else {
                stack.push(scanner.nextInt());
            }
        }

        pw.close();
        scanner.close();
    }

    static class Stack {
        private final int[] array;
        private int top = -1;
        private int size = 0;

        Stack(int sz) {
            if (sz <= 0 || sz == Integer.MAX_VALUE)
                sz = 10;
            top = -1;
            size = sz;
            array = new int[sz];
        }

        Stack() {
            this(100);
        }

        public synchronized void push(int data) throws Exception {
            if (top + 1 == size - 1)
                throw new Exception("OVERFLOW");
            array[++top] = data;
        }

        public synchronized int pop() throws Exception {
            if (isEmpty())
                throw new Exception("UNDERFLOW");
            int retVal = array[top];
            array[top--] = 0;
            return retVal;
        }

        public boolean isEmpty() {
            return top == -1;
        }

    }
}
