package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailIds {
  public int numUniqueEmails(String[] emails) {
    if (emails == null) {
      throw new IllegalArgumentException("Emails array shouldn't be null");
    }

    Set<String> uniqueEmailIds = new HashSet<>();
    for (String email : emails) {
      String validEmail = getValidEmail(email);
      uniqueEmailIds.add(validEmail);
    }
    return uniqueEmailIds.size();
  }

  private String getValidEmail(String email) {
    String[] tokens = email.split("@");
    String localPart = tokens[0];
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : localPart.toCharArray()) {
      if (c == '.') {
        continue;
      } else if (c == '+') {
        break;
      }
      stringBuilder.append(c);
    }
    return stringBuilder.append('@').append(tokens[1]).toString();
  }
}
