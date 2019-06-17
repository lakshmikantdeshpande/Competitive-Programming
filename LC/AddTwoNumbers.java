package LC;// N time N space

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode first, ListNode second) {
    ListNode head = new ListNode(0);
    ListNode runner = head;

    int carry = 0;
    while (first != null || second != null) {
      int a = first == null ? 0 : first.val;
      int b = second == null ? 0 : second.val;

      int sum = a + b + carry;
      carry = sum / 10;
      runner.next = new ListNode(sum % 10);
      // moving ahead
      runner = runner.next;
      if (first != null) {
        first = first.next;
      }
      if (second != null) {
        second = second.next;
      }
    }

    if (carry != 0) {
      runner.next = new ListNode(carry);
    }

    return head.next;
  }

  private static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}