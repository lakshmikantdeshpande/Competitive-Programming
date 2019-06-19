import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() != B.size() || A.isEmpty()) {
            return 0;
        }

        int distance = 0;
        for (int i = 1; i < A.size(); i++) {
            int x = Math.abs(A.get(i) - A.get(i - 1));
            int y = Math.abs(B.get(i) - B.get(i - 1));
            distance += x < y ? y : x;
        }
        return distance;
    }
}
