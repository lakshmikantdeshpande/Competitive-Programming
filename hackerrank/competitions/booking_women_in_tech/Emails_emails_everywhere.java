package competitions.booking_women_in_tech;

import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class email {
    private long priority;
    private int order;
    private String name;

    public email(int order, String name, long priority) {
        this.order = order;
        this.name = name;
        this.priority = priority;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Emails_emails_everywhere {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Queue<email> queue = new PriorityQueue<>(new Comparator<email>() {
            @Override
            public int compare(email o1, email o2) {
                if (o1.getPriority() < o2.getPriority())
                    return 1;
                else if (o1.getPriority() > o2.getPriority())
                    return -1;
                else {
                    if (o1.getOrder() > o2.getOrder())
                        return 1;
                    else
                        return -1;
                }
            }
        });

        int N = scanner.nextInt();
        int order = 0;
        while (N-- > 0) {
            switch (scanner.next()) {
                case "store":
                    String emailname = scanner.next();
                    long priority = scanner.nextInt();
                    queue.offer(new email(++order, emailname, priority));
                    break;
                case "get_next_email":
                    if (queue.size() == 0)
                        pw.println(-1);
                    else
                        pw.println(queue.poll().getName());
                    break;
            }
        }

        queue = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}