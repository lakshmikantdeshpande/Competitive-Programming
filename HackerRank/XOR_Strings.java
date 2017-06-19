import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class XOR_Strings {
    private static String stringsXOR(String s, String t) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i))
                strb.append(0);
            else
                strb.append(1);
        }
        return strb.toString();
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String a = br.readLine();
        String b = br.readLine();
        pw.println(stringsXOR(a, b));

        pw.close();
        br.close();
    }
}