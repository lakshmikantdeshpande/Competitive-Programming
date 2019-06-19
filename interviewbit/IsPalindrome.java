public class IsPalindrome {

    public int isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return 1;
        }

        int start = 0;
        int end = input.length() - 1;
        input = input.toLowerCase();

        while (start < end) {
            char a = input.charAt(start);
            char b = input.charAt(end);
            if (!Character.isLetter(a) && !Character.isDigit(a)) {
                start++;
            } else if (!Character.isLetter(b) && !Character.isDigit(b)) {
                end--;
            } else if (a == b) {
                start++;
                end--;
            } else {
                return 0;
            }
        }
        return 1;
    }

}
