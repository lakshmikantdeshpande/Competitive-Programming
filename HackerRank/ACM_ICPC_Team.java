import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Scanner;

class ACM_ICPC_Team {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int numbers = scanner.nextInt();
        int size = scanner.nextInt();
        scanner.nextLine();
        BitSet[] bitSets = new BitSet[size];

        int num = 0;
        for (int i = 0; i < numbers; i++) {
            bitSets[num] = new BitSet(size);
            char[] chars = scanner.nextLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1')                // set bits according to the string
                    bitSets[num].set(j);
            }
            num++;
        }

        int maxTeams = 0;
        int maxValue = 0;
        for (int i = 0; i < numbers; i++) {
            for (int j = (i + 1); j < numbers; j++) {
                int max = 0;
                for (int k = 0; k < size; k++) {
                    if (bitSets[i].get(k) | bitSets[j].get(k)) {
                        max++;
                    }
                }
                if (maxValue < max) {
                    maxTeams = 1;
                    maxValue = max;
                } else if (maxValue == max) {
                    maxTeams++;
                }
            }
        }

        pw.println(maxValue + "\n" + maxTeams);
        bitSets = null;
        pw.close();
        pw = null;
        scanner.close();
        scanner = null;
        System.gc();
    }
}