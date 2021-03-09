package practice;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        int i = S.length() - 1;
        while (i >= 0) {
            char c = Character.toUpperCase(S.charAt(i));
            if (c == '-') {
                i--;
            } else if (count != 0 && count % K == 0) {
                str.append('-');
                count = 0;
            } else {
                str.append(c);
                count++;
                i--;
            }
        }
        return str.reverse().toString();
    }
}
