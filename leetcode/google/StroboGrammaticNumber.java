package leetcode.google;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class StroboGrammaticNumber {
    public boolean isStrobogrammatic(String N) {
        if (N.equals("0")) return true;

        Map<Long, Long> flipMap = getFlipMap();
        BigInteger sum = BigInteger.ZERO;
        BigInteger temp = new BigInteger(N);
        BigInteger ten = new BigInteger("10");

        while (temp.compareTo(BigInteger.ZERO) > 0) {
            BigInteger lsb = temp.mod(ten);
            if (!flipMap.containsKey(Long.parseLong(lsb.toString()))) return false;
            lsb = new BigInteger(flipMap.get(Long.parseLong(lsb.toString())).toString());
            sum = sum.multiply(ten).add(lsb);
            temp = temp.divide(ten);
        }
        return sum.toString().equals(N);
    }

    private Map<Long, Long> getFlipMap() {
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);
        map.put(1L, 1L);
        map.put(6L, 9L);
        map.put(8L, 8L);
        map.put(9L, 6L);
        return map;
    }
}
