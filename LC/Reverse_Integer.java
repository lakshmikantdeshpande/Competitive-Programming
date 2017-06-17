// N time 1 space
// handled Overflow case

class Reverse_Integer {
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
                return 0;
        }
        return (int) temp;
    }
}
