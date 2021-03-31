package leetcode.google2;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] array, int K) {
        int i = array.length - 1;
        int carry = 0;

        List<Integer> list = new ArrayList<>();
        while (i >= 0 || K > 0) {
            int first = i >= 0 ? array[i] : 0;
            int second = K % 10;

            int sum = first + second + carry;
            carry = sum / 10;
            sum %= 10;
            list.add(0, sum);

            K /= 10;
            i--;
        }
        if (carry == 1) {
            list.add(0, 1);
        }
        return list;
    }
}
