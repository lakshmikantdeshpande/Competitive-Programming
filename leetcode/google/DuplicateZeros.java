package leetcode.google;

class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int zeroCount = getZeroCount(arr);
        int i = arr.length - 1;
        int j = arr.length - 1 + zeroCount;
        while (i >= 0) {
            if (arr[i] == 0) {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                i--;
            } else {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                i--;
            }
        }
    }

    private int getZeroCount(int[] array) {
        int count = 0;
        for (int num : array) {
            count += num == 0 ? 1 : 0;
        }
        return count;
    }
}
