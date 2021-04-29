package leetcode.google;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode runner = resultHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int one = l1 == null ? 0 : l1.val;
            int two = l2 == null ? 0 : l2.val;
            int sum = one + two + carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            runner.next = node;
            runner = runner.next;
        }

        if (carry == 1) {
            runner.next = new ListNode(1);
        }
        return resultHead.next;
    }

    private static final class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
}
