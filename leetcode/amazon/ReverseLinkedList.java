package leetcode.amazon;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev = null, next = null, curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode prev) {
        if (head == null) return prev;

        ListNode next = head.next;
        head.next = prev;
        return reverse(next, head);
    }
}
