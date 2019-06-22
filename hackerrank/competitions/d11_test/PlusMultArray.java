package hackerrank.competitions.d11_test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

class PlusMultArray {

  private static String plusMult(List<Integer> numbers) {
    BigInteger odd = BigInteger.ZERO;
    BigInteger even = BigInteger.ZERO;
    boolean multiplyEven = false;
    boolean multiplyOdd = false;
    for (int i = 0; i < numbers.size(); i++) {
      BigInteger number = new BigInteger(numbers.get(i).toString());
      if (i % 2 == 0) {
        if (multiplyEven) {
          even = even.multiply(number);
        } else {
          even = even.add(number);
        }
        multiplyEven = !multiplyEven;
      } else {
        if (multiplyOdd) {
          odd = odd.multiply(number);
        } else {
          odd = odd.add(number);
        }
        multiplyOdd = !multiplyOdd;
      }
    }
    final BigInteger two = new BigInteger("2");
    even = even.mod(two);
    odd = odd.mod(two);
    if (even.equals(odd)) {
      return "NEUTRAL";
    }
    return even.compareTo(odd) > 0 ? "EVEN" : "ODD";
  }

  public static void main(String[] args) {
    System.out.println(plusMult(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
  }
}
