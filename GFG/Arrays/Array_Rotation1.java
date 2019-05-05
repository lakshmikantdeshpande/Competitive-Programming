// N time D space

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Array_Rotation1 {

  private static int[] rotate(@NotNull int[] array, final int shift) {
    if (shift < 0) {
      throw new UnsupportedOperationException();
    } else if (shift == 0 || array.length == 0 || shift == array.length) {
      return array;
    }

    int hifts = shift % array.length;

    int[] temp = new int[hifts];
    for (int i = 0; i < hifts; i++) {
      temp[i] = array[i];
    }

    int t = 0;
    for (int i = hifts; i < array.length; i++) {
      array[t++] = array[i];
    }

    int p = 0;
    for (int i = array.length - hifts; i < array.length; i++) {
      array[i] = temp[p++];
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
    int shift = 2;
    System.out.println(Arrays.toString(rotate(array, shift)));
    array = new int[]{1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(rotate(array, 12)));
  }
}