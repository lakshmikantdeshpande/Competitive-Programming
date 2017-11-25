import java.util.ArrayList;
import java.util.List;

public class SpiralArray {

    private static void printSpiral(List<List<Integer>> arrayList) {
        int top = 0, left = 0;
        int bottom = arrayList.get(0).size() - 1, right = arrayList.get(0).size() - 1;

        int direction = 0;  // 0, 1, 2, 3   top, right, bottom, left
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.println(arrayList.get(top).get(i));
                }
                top++;
                direction = 1;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.println(arrayList.get(i).get(right));
                }
                right--;
                direction = 2;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.println(arrayList.get(bottom).get(i));
                }
                bottom--;
                direction = 3;
            } else {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(arrayList.get(i).get(left));
                }
                left++;
                direction = 0;
            }
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> masterList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(4);
        List<Integer> list2 = new ArrayList<>(4);
        List<Integer> list3 = new ArrayList<>(4);
        List<Integer> list4 = new ArrayList<>(4);

        masterList.add(list1);
        masterList.add(list2);
        masterList.add(list3);
        masterList.add(list4);

        for (int i = 0; i < 16; i++) {
            if (i < 4) {
                list1.add(i);
            } else if (i < 8) {
                list2.add(i);
            } else if (i < 12) {
                list3.add(i);
            } else {
                list4.add(i);
            }
        }

        printSpiral(masterList);
    }
}
