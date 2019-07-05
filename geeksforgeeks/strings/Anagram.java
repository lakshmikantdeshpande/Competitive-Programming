package geeksforgeeks.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            String[] tokens = reader.readLine().split(" ");
            boolean isAnagramPair = areAnagrams(tokens[0], tokens[1]);
            writer.println(isAnagramPair ? "YES" : "NO");
        }

        reader.close();
        writer.close();
    }

    private static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) return false;

        Map<Character, Long> map = new HashMap<>(first.length());
        for (char c : first.toCharArray()) map.put(c, map.getOrDefault(c, 0L) + 1L);

        for (char c : second.toCharArray()) {
            Long count = map.get(c);
            if (count == null || count <= 0) return false;
            map.put(c, count - 1);
        }
        return true;
    }
}
