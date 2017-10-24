// N time N space

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Array_Rotation1 {

    private static int[] rotate(@NotNull int[] array, int shift) {
        if (shift < 0 || shift > array.length) {
            throw new UnsupportedOperationException();
        } else if (shift == 0 || array.length == 0 || shift == array.length) {
            return array;
        }

        int[] temp = new int[shift];
        for (int i = 0; i < shift; i++) {
            temp[i] = array[i];
        }

        int t = 0;
        for (int i = shift; i < array.length; i++) {
            array[t++] = array[i];
        }

        int p = 0;
        for (int i = array.length - shift; i < array.length; i++) {
            array[i] = temp[p++];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int shift = 2;
        System.out.println(Arrays.toString(rotate(array, shift)));
    }
}