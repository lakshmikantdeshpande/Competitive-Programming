package leetcode;

public class SwapAdjacentNodes {

    private static class ListNode {
        int data;
        ListNode next;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
