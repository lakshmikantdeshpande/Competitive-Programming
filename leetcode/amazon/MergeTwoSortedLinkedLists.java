package leetcode.amazon;

public class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                if (l1.val <= l2.val) {
                    result.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    result.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            result = result.next;
        }
        return head.next;
    }
}
