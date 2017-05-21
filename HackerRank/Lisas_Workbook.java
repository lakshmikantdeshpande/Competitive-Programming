// O(N * (N / MAX)) time 1 space solution

import java.io.PrintWriter;
import java.util.Scanner;

public class Lisas_Workbook {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int max = scanner.nextInt();
        int masterIndex = 1;      // to track page number
        int specialCounter = 0;  // counter for storing special pages

        for (int i = 0; i < N; i++) {
            int chapterSize = scanner.nextInt();   // size of given chapter

            if (chapterSize <= max) {
                if (masterIndex <= chapterSize)
                    specialCounter++;
                masterIndex++;
            } else {
                int temp = max;
                int last = 0;  // to get last page of previous chapter
                while (temp <= chapterSize) {
                    if (masterIndex <= temp && masterIndex > last)
                        specialCounter++;
                    masterIndex++;
                    if (temp == chapterSize)   // if chapter ends, break
                        break;
                    last = temp;
                    temp = temp + max >= chapterSize ? chapterSize : temp + max;
                }
            }
        }
        pw.println(specialCounter);

        pw.close();
        scanner.close();
    }
}
