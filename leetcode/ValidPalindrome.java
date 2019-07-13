package leetcode;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if (!isAlpha(a)) {
                i++;
            } else if (!isAlpha(b)) {
                j--;
            } else {
                if (a == b) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}