// nlogn time complexity n space complexity

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class Big_Sorting {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        Arrays.sort(array, (string1, string2) -> {
            if (string1.length() > string2.length())
                return 1;
            if (string1.length() < string2.length())
                return -1;

            for (int i = 0; i < string1.length(); i++) {
                if (Character.getNumericValue(string1.charAt(i)) > Character.getNumericValue(string2.charAt(i)))
                    return 1;
                else if (Character.getNumericValue(string1.charAt(i)) < Character.getNumericValue(string2.charAt(i)))
                    return -1;
            }
            return 0;
        });

        for (String s : array)
            pw.println(s);

        pw.close();
        br.close();
    }
}