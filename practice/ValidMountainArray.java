package practice;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) return false;
        final int n = A.length;
        int i = 0;
        while (i < n - 1 && A[i] < A[i + 1]) i++;

        if (i == 0 || i == n - 1) return false;

        while (i < n - 1 && A[i] > A[i + 1]) i++;

        return i == n - 1;
    }
}
