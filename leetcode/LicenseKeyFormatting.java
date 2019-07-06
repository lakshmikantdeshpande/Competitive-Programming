package leetcode;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String str, int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            if (str.charAt(i) != '-')
                builder.append(builder.length() % (k + 1) == k ? '-' : "").append(str.charAt(i));
        return builder.reverse().toString().toUpperCase();
    }
}
