package leetcode.google2;

public class DIStringMatch {

    public int[] diStringMatch(String S) {
        if (S == null || S.isEmpty()) {
            return new int[]{};
        }

        int N = S.length();
        int low = 0;
        int high = N;
        int[] result = new int[N + 1];

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[N] = low;
        return result;
    }
}
