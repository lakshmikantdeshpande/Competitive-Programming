package practice;

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode one, ListNode two) {
        if (one == null || two == null) {
            return one == null ? two : one;
        }

        ListNode head = new ListNode(0);
        ListNode prev = head;
        while (one != null || two != null) {
            if (one == null) {
                head.next = new ListNode(two.val);
                two = two.next;
            } else if (two == null) {
                head.next = new ListNode(one.val);
                one = one.next;
            } else {
                if (one.val <= two.val) {
                    head.next = new ListNode(one.val);
                    one = one.next;
                } else {
                    head.next = new ListNode(two.val);
                    two = two.next;
                }
            }
            head = head.next;
        }
        return prev.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}