package practice;

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (i % 10 != 0 && isValid(i)) {
                list.add(i);
            }
        }

        return list;
    }

    private boolean isValid(int i) {
        int temp = i;
        while (temp > 0) {
            int t = temp % 10;
            if (t == 0 || ((i % t) != 0)) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }
}