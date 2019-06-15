package CS;

public class CountDistantPairs {
    int countDistantPairs(String inputString, int distance) {
        int count = 0;
        for (int i = 0; i < inputString.length() - distance - 1; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + distance + 1)) {
                count++;
            }
        }
        return count;
    }
}
