package leetcode.google;

class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int maxOne = Integer.MAX_VALUE;
        int maxTwo = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= maxOne) {
                maxOne = num;
            } else if (num <= maxTwo) {
                maxTwo = num;
            } else {
                return true;
            }
        }
        return false;
    }
}