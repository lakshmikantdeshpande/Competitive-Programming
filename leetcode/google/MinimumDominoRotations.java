package leetcode.google;

public class MinimumDominoRotations {
  public int minDominoRotations(int[] A, int[] B) {
    int answer = getRotations(A[0], A, B);
    if (answer != -1 || A[0] == B[0]) {
      return answer;
    }
    return getRotations(B[0], A, B);
  }

  private int getRotations(int x, int[] A, int[] B) {
    int aFlips = 0;
    int bFlips = 0;

    for (int i = 0; i < A.length; i++) {
      if (A[i] != x && B[i] != x) {
        return -1;
      }

      if (A[i] != x) {
        aFlips++;
      } else if (B[i] != x) {
        bFlips++;
      }
    }
    return Math.min(aFlips, bFlips);
  }
}
