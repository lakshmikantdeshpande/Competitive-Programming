package leetcode.jpmorgan;

public class ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int sum = 0;
        while (head != null) {
            sum = head.val + sum * 2;
            head = head.next;
        }
        return sum;
    }

    private static final class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
