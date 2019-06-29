package leetcode.google;

public class JumpGame {

    public boolean canJump(int[] array) {
        final int n = array.length;
        if (n < 1) return false;

        int target = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (target - i <= array[i]) {
                target = i;
            }
        }
        return target == 0;
    }
}
