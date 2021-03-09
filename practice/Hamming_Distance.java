package practice;

// N time 1 Space
class Hamming_Distance {
    public int hammingDistance(int x, int y) {
        return (countSetBits(x ^ y));
    }

    private int countSetBits(int num) {
        int c = 0;
        for (c = 0; num > 0; num = num & (num - 1)) {
            ++c;
        }
        return c;
    }
}
