package LC;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepetitions {

  // Brute force
  private int lengthOfLongestSubstringBrute(String str) {
    int maxLength = 0;
    int n = str.length();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        if (areAllUnique(str, i, j)) {
          maxLength = Math.max(maxLength, j - i);
        }
      }
    }

    return maxLength;
  }

  private boolean areAllUnique(String str, int i, int j) {
    Set<Character> visited = new HashSet<>();
    for (; i < j; i++) {
      boolean added = visited.add(str.charAt(i));
      if (!added) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new LongestSubstringWithoutRepetitions().lengthOfLongestSubstringBrute("aaababababaa"));
  }
}


