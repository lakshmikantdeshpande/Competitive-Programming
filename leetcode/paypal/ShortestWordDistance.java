package leetcode.paypal;

public class ShortestWordDistance {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = wordsDict.length;
        int one = -1;
        int two = -1;

        for (int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i])) {
                one = i;
            } else if (word2.equals(wordsDict[i])) {
                two = i;
            }

            if (one != -1 && two != -1) {
                min = Math.min(min, Math.max(one, two) - Math.min(one, two));
            }
        }
        return min;
    }
}
