package geeksforgeeks.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ConversionOfZigzagStringInRows {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            String str = reader.readLine();
            int rows = Integer.parseInt(reader.readLine());
            writer.println(convert(str, rows));
        }

        reader.close();
        writer.close();
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>(numRows);
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean up = false;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                up = !up;
            }
            currentRow += up ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }
}