public class Diff21 {
    public int diff21(int n) {
        int x = Math.abs(21 - n);
        if (n > 21)
            return 2 * x;
        else
            return x;
    }
}
