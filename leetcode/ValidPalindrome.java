package leetcode;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        return isPalindromeRecursive(s, 0, s.length() - 1);
        // return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindromeRecursive(String s, int i, int j) {
        if (i < j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if (isSpecialChar(a)) {
                return isPalindromeRecursive(s, i + 1, j);
            } else if (isSpecialChar(b)) {
                return isPalindromeRecursive(s, i, j - 1);
            } else {
                if (a == b) {
                    return isPalindromeRecursive(s, i + 1, j - 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if (isSpecialChar(a)) {
                i++;
            } else if (isSpecialChar(b)) {
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

    private boolean isSpecialChar(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }
}