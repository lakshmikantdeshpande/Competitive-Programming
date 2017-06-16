public class Reverse_Integer {
    public int reverse(int x) {
        int temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        return temp;
    }
}
