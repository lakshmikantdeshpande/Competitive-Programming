public class BackAround {
    public String backAround(String str) {
        char x = str.charAt(str.length() - 1);
        return x + str + x;
    }
}
