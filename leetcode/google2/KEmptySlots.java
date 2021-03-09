package leetcode.google2;

import java.util.TreeSet;

public class KEmptySlots {
    public int kEmptySlots(int[] bulbs, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        int day = 0;
        for (int bulb : bulbs) {
            ++day;
            set.add(bulb);
            Integer low = set.lower(bulb);
            Integer high = set.higher(bulb);

            if ((low != null && bulb - low - 1 == k) ||
                    (high != null && high - bulb - 1 == k)) {
                return day;
            }
        }
        return -1;
    }
}
