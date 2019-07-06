package leetcode;

public class SwapAdjacentNodes {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    private static class ListNode {
        int data;
        ListNode next;
    }
}
