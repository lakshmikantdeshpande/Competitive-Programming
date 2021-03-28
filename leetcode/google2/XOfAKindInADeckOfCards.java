package leetcode.google2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) {
            return false;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck) {
            int count = countMap.getOrDefault(card, 0) + 1;
            countMap.put(card, count);
        }

        List<Integer> values = new ArrayList<>(countMap.values());
        int gcd = 0;
        for (int value : values) {
            gcd = gcd(gcd, value);
        }
        return gcd > 1;
    }

    private int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd(second, first % second);
    }
}
