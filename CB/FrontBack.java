public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 1 || str.length() == 0)
            return str;
        char x = str.charAt(0);
        char y = str.charAt(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);
        return y + mid + x;
    }
}
