package leetcode.amazon;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode result = new ListNode(0);
        ListNode head = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;

            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;
        }

        if (carry == 1) {
            result.next = new ListNode(1);
        }

        return head.next;
    }
}
