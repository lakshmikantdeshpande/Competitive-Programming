package practice;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        if (haystack.equals(needle)) return 0;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String substr = haystack.substring(i, i + needle.length());
            System.out.println(substr);
            if (substr.equals(needle)) return i;
        }
        return -1;
    }
}
