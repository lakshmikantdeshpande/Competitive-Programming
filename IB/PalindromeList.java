package IB;

class PalindromeList {
  public int lPalin(ListNode head) {
    if (head == null || head.next == null) {
      return 1;
    }

    ListNode slow = head, fast = head;
    ListNode prevSlow = head;
    ListNode middle = null;
    boolean result = false;

    // find center of the linked list first
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      prevSlow = slow;  // for odd size linked lists
      slow = slow.next;
    }

    if (fast != null) {
      middle = slow;
      slow = slow.next;
    }

    ListNode secondHead = slow;
    prevSlow.next = null;
    secondHead = reverse(secondHead);
    result = compare(head, secondHead);

    secondHead = reverse(secondHead);

    if (middle != null) {
      prevSlow.next = middle;
      prevSlow = prevSlow.next;
    }
    prevSlow.next = secondHead;
    return result ? 1 : 0;
  }

  class ListNode {
    int val;
    public ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  private boolean compare(ListNode one, ListNode two) {
    while (one != null && two != null) {
      if (one.val != two.val) {
        return false;
      }
      one = one.next;
      two = two.next;
    }
    return (one == null && two == null);
  }

  private ListNode reverse(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
