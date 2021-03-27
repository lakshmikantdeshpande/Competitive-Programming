package leetcode.google2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        // LeetCode provides this code
        throw new NotImplementedException();
    }
}
