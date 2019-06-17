package LC;

class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode first, ListNode second) {
    ListNode head = new ListNode(0);
    ListNode runner = head;

    while (first != null && second != null) {
      if (first.val <= second.val) {
        runner.next = new ListNode(first.val);
        first = first.next;
      } else {
        runner.next = new ListNode(second.val);
        second = second.next;
      }
      runner = runner.next;
    }

    while (first != null) {
      runner.next = new ListNode(first.val);
      runner = runner.next;
      first = first.next;
    }

    while (second != null) {
      runner.next = new ListNode(second.val);
      runner = runner.next;
      second = second.next;
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